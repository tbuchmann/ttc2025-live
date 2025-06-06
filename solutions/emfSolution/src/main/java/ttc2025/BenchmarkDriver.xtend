package ttc2025;

class BenchmarkDriver {

	def static void main(String[] args) 
	{
		try {
	        Initialize();
	        Load();
	        Initial();
	        for (var i = 1; i <= Sequences; i++)
	        {
	            Update(i);
	        }	
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
    static String Tool;
    static String Scenario;
    static String Model;
    static String RunIndex;
    static String ModelPath;
    static int Sequences;

    var static long stopwatch;

    static Solution_iWorkflows solution;

	def static void Initialize() throws Exception
    {
    	stopwatch = System.nanoTime();

		JobCollectionPackage.eINSTANCE.eClass()
		LaboratoryAutomationPackage.eINSTANCE.eClass()
		
        Tool = System.getenv("Tool");
        Scenario = System.getenv("Scenario");
        Model = System.getenv("Model");
        RunIndex = System.getenv("RunIndex");
        ModelPath = System.getenv("ModelPath");
        Sequences = Integer.valueOf(System.getenv("Sequences"));
        
        // do whatever you want here
		
        stopwatch = System.nanoTime() - stopwatch;
        Report(BenchmarkPhase.Initialization, -1, null);
    }

    def static void Load()
    {
    	stopwatch = System.nanoTime();
    	
		val inputModelPath = '''«ModelPath»/initial.xmi'''
		
		// load model here

        stopwatch = System.nanoTime() - stopwatch;
        Report(BenchmarkPhase.Load, -1, String.valueOf(stopwatch));
    }


    def static void Initial()
    {
        
        stopwatch = System.nanoTime()
		
		solution.execute()
		
        stopwatch = System.nanoTime() - stopwatch;
        
        solution.saveOutputModels(#{'job' -> '''«ModelPath»/results/initialResult-YAMTL.xmi'''})
        
        Report(BenchmarkPhase.Initial, -1, String.valueOf(stopwatch));
    }

    def static void Update(int iteration)
    {
		
		val input_labRes = solution.getModelResource('lab')
		val output_jobRes = solution.getOutputModel('job')

        val changeName = String.format("change%02d", iteration);
		val inputChangePath = '''«ModelPath»/«changeName».txt'''
		
		solution.applyChange(inputChangePath, input_labRes, output_jobRes)

        stopwatch = System.nanoTime();

		solution.propagateDelta('lab')

        stopwatch = System.nanoTime() - stopwatch;
        
        solution.saveOutputModels(#{'job' -> '''«ModelPath»/results/«changeName»Result-YAMTL.xmi'''})
        
        Report(BenchmarkPhase.Update, iteration, String.valueOf(stopwatch));
    }

    def static void Report(BenchmarkPhase phase, int iteration, String result)
    {
    	var String iterationStr;
    	if (iteration == -1) {
    		iterationStr = "0";
    	} else {
    		iterationStr = Integer.toString(iteration);
    	}
    	System.out.println(String.format("%s;%s;%s;%s;%s;%s;Time;%s", Tool, Scenario, Model, RunIndex, iterationStr, phase.toString(), Long.toString(stopwatch)));
        if("true".equals(System.getenv("NoGC"))) {
        	// nothing to do
        } else {
	        Runtime.getRuntime().gc();
	        Runtime.getRuntime().gc();
	        Runtime.getRuntime().gc();
	        Runtime.getRuntime().gc();
	        Runtime.getRuntime().gc();
        }
        val long memoryUsed = Runtime.getRuntime().totalMemory() - Runtime.getRuntime().freeMemory();
        System.out.println(String.format("%s;%s;%s;%s;%s;%s;Memory;%s", Tool, Scenario, Model, RunIndex, iterationStr, phase.toString(), Long.toString(memoryUsed)));
    }

    enum BenchmarkPhase {
        Initialization,
        Load,
        Initial,
        Update
    }
}
