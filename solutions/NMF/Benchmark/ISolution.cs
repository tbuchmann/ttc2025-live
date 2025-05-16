using NMF.Models;
using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace NMFSolution.Benchmark
{
    public interface ISolution
    {
        void Initialize();
        Func<Model> ComputeChanges(string modelPath, string model, int iteration, string targetPath);
        Model Initial(string modelPath, string model, string targetPath);
        void Load(string modelPath, string model);
    }
}
