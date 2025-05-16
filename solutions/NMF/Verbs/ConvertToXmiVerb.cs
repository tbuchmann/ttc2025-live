using CommandLine;
using NMF.Models.Repository;
using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using TTC2025.UvlToDot.UniversalVariability;

namespace NMFSolution.Verbs
{
    [Verb("xmi", HelpText = "Creates the XMI representation of the given UVL model")]
    internal class ConvertToXmiVerb : VerbBase
    {
        [Value(0, Required = true, HelpText = "Path to the UVL model instance")]
        public string UvlPath {  get; set; }

        protected override void ExecuteCore()
        {
            var uvl = new UniversalVariabilityGrammar();
            var parser = uvl.CreateParser();
            var repo = new ModelRepository();
            foreach (var path in Directory.GetFiles(".", UvlPath))
            {
                Console.WriteLine($"Processing {path}");
                var lines = File.ReadAllLines(path);
                var parsed = parser.Initialize(lines);
                if (parser.Context.Errors.Any())
                {
                    throw new InvalidOperationException($"Document {path} containts errors: " + string.Join(", ", parser.Context.Errors));
                }
                Console.WriteLine($"{path} successfully parsed.");
                if (parsed is FeatureModel featureModel)
                {
                    var newFilePath = Path.ChangeExtension(path, ".uvl.xmi");
                    repo.Save(featureModel, newFilePath);
                }
                else
                {
                    throw new InvalidOperationException($"{path} is not a valid feature model but {parsed}");
                }
                Console.WriteLine($"{path} transformed successfully.");
            }
        }
    }
}
