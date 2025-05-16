using NMF.Models.Repository;
using System;
using System.Collections.Generic;
using System.Diagnostics;
using System.Linq;
using System.Net;
using System.Text;
using System.Threading.Tasks;

namespace NMFSolution.Benchmark
{
    internal class BenchmarkRunner
    {
        private ModelRepository repository;

        private string Model;
        private string ModelPath;
        private string RunIndex;
        private int Sequences;
        private string Tool;

        private readonly Stopwatch _stopwatch = new Stopwatch();
        private readonly ISolution _solution;

        public BenchmarkRunner(ISolution solution)
        {
            _solution = solution;
        }

        public void Execute()
        {
            Initialize();
            Load();
            Initial(Sequences > 0);
            for (int i = 2; i <= Sequences; i++)
            {
                Update(i);
            }
        }

        private void Load()
        {
            _stopwatch.Restart();
            _solution.Load(ModelPath!, Model!);
            _stopwatch.Stop();
            Report(BenchmarkPhase.Load);
        }

        private void Initialize()
        {
            _stopwatch.Restart();
            repository = new ModelRepository();

            ModelPath = Environment.GetEnvironmentVariable(nameof(ModelPath));
            RunIndex = Environment.GetEnvironmentVariable(nameof(RunIndex));
            Sequences = int.Parse(Environment.GetEnvironmentVariable(nameof(Sequences)));
            Tool = Environment.GetEnvironmentVariable(nameof(Tool));
            Model = Environment.GetEnvironmentVariable(nameof(Model));

            _solution.Initialize();

            _stopwatch.Stop();
            Report(BenchmarkPhase.Initialization);
        }

        private void Initial(bool sequenced)
        {
            MakeSureModelPathExists();
            var dotPath = Path.Combine(ModelPath, "..", "results", $"{Model}_{Tool}.dot");
            _stopwatch.Restart();
            var result = _solution.Initial(ModelPath, Model, dotPath);
            _stopwatch.Stop();
            Report(BenchmarkPhase.Initial, null);
            var path = Path.Combine(ModelPath, "..", "results", $"{Model}_{Tool}.xmi");
            if (result != null)
            {
                using (var target = File.Create(path))
                {
                    result.ModelUri = new Uri(path);
                    repository.Serializer.Serialize(result, target);
                }
            }
        }

        private void MakeSureModelPathExists()
        {
            if (!Directory.Exists(Path.Combine(ModelPath, "..", "results")))
            {
                Directory.CreateDirectory(Path.Combine(ModelPath, "..", "results"));
            }
        }

        private void Update(int iteration)
        {
            var updatedPath = Path.GetFullPath(Path.Combine(ModelPath, "..", $"{Model}_{iteration:00}.uvl"));
            var dotPath = Path.Combine(ModelPath, "..", "results", $"{Model}_{iteration:00}_{Tool}.dot");
            var actualActions = _solution.ComputeChanges(updatedPath, Model, iteration, dotPath);
            _stopwatch.Restart();
            var result = actualActions();
            _stopwatch.Stop();
            Report(BenchmarkPhase.Update, iteration);
            if (result != null)
            {
                using (var target = File.Create(Path.Combine(ModelPath, "results", $"{Model}_{iteration:00}_{Tool}.xmi")))
                {
                    repository.Serializer.Serialize(result, target);
                }
            }
        }

        private void Report(BenchmarkPhase phase, int? iteration = null)
        {
            Console.WriteLine($"{Tool};{Model};{RunIndex};{iteration ?? 0};{phase};Time;{_stopwatch.Elapsed.Ticks * 100}");
            Console.WriteLine($"{Tool};{Model};{RunIndex};{iteration ?? 0};{phase};Memory;{Environment.WorkingSet}");
        }
    }
}
