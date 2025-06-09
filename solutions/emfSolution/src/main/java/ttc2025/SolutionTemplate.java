package ttc2025;

import DOT.Graph;
import UniversalVariability.FeatureModel;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;

import java.io.FileOutputStream;
import java.io.OutputStreamWriter;
import java.util.function.Supplier;

public class SolutionTemplate implements ISolution {

    private ResourceSet resourceSet;
    private FeatureModel loadedFeatureModel;

    @Override
    public void initialize() throws Exception {
        resourceSet = new ResourceSetImpl();
        resourceSet.getResourceFactoryRegistry().getExtensionToFactoryMap().put("xmi", new XMIResourceFactoryImpl());
    }

    @Override
    public void load(String modelPath, String model) {
        // loads the initial model path
        var rs = resourceSet.getResource(URI.createURI(modelPath + ".xmi"), true);
        loadedFeatureModel = (FeatureModel) rs.getContents().get(0);
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
