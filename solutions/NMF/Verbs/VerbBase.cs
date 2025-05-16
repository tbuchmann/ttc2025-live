using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace NMFSolution.Verbs
{
    public abstract class VerbBase
    {
        protected abstract void ExecuteCore();

        public int Execute()
        {
            try
            {
                ExecuteCore();
                return 0;
            }
            catch (Exception ex)
            {
                Console.Error.WriteLine(ex);
                return 1;
            }
        }
    }
}
