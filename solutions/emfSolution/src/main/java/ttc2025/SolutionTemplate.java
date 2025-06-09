package ttc2025;

import DOT.Graph;

import java.io.FileOutputStream;
import java.io.OutputStreamWriter;
import java.util.function.Supplier;

public class SolutionTemplate implements ISolution {
    @Override
    public void initialize() throws Exception {
        // does nothing
    }

    @Override
    public void load(String modelPath, String model) {
        // loads the initial model path
    }

    @Override
    public Graph initial(String modelPath, String model, String targetPath) throws Exception {
        // TODO: create a graph model (serialized by the benchmark driver) or directly write a dot file, as you prefer

        var fs = new FileOutputStream(targetPath);
        var sw = new OutputStreamWriter(fs);

        sw.write("digraph FeatureModel {\n");
        sw.write("rankdir=\"TB\"\n");
        sw.write("newrank=true\n");
        sw.write("bgcolor=\"#1e1e1e\"\n");
        sw.write("edge [color=white]\n");
        sw.write("node [style=filled fontcolor=\"white\" fontname=\"Arial Unicode MS, Arial\"];\n");
        sw.write("}\n");

        sw.close();
        fs.close();

        return null;
    }

    @Override
    public Supplier<Graph> computeChanges(String modelPath, String model, int iteration, String targetPath) {
        // lines added here are not considered for time measurements, for instance to load changes
        load(modelPath, model);
        return () -> {
            // lines here are considered for time measurement
            try {
                return initial(modelPath, model, targetPath);
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
        };
    }
}
