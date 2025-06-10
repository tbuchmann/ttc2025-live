import java.io.File;
import java.io.IOException;
import java.util.*;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.resource.*;
import org.eclipse.emf.ecore.resource.impl.*;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;

import dot.*;
import uvl.*;

public class UVL2DotTransformer {

    public static void main(String[] args) throws IOException {
        if (args.length != 2) {
            System.out.println("Usage: java UVL2DotTransformer <input.xmi> <output.xmi>");
            return;
        }

        String inputPath = args[0];
        String outputPath = args[1];

        // Initialize EMF
        ResourceSet resourceSet = new ResourceSetImpl();
        Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap().put("xmi", new XMIResourceFactoryImpl());

        // Register packages
        DotPackage.eINSTANCE.eClass();
        UniversalVariabilityPackage.eINSTANCE.eClass();

        // Load UVL model
        Resource inputResource = resourceSet.getResource(URI.createFileURI(new File(inputPath).getAbsolutePath()), true);
        FeatureModel uvlModel = (FeatureModel) inputResource.getContents().get(0);

        // Create DOT model
        Resource outputResource = resourceSet.createResource(URI.createFileURI(new File(outputPath).getAbsolutePath()));
        Graph dotGraph = DotFactory.eINSTANCE.createGraph();
        dotGraph.setName("UVLGraph");
        dotGraph.setType("digraph");
        dotGraph.setRankDir("TB");
        dotGraph.setColor("#1e1e1e");

        Map<Feature, Node> featureToNode = new HashMap<>();

        // Create DOT nodes for features
        for (Feature feature : uvlModel.getFeatures()) {
            Node node = DotFactory.eINSTANCE.createNode();
            node.setName(feature.getName());
            node.setStyle("filled");
            node.setFontcolor("white");
            node.setFontname("Arial Unicode MS, Arial");
            node.setColor("#ABACEA");

            SimpleLabel label = DotFactory.eINSTANCE.createSimpleLabel();
            label.setContent(feature.getName());
            node.setLabel(label);

            featureToNode.put(feature, node);
            dotGraph.getNodes().add(node);
        }

        // Create edges for feature groups
        for (Feature parent : uvlModel.getFeatures()) {
            for (FeatureGroup group : parent.getGroups()) {
                for (Feature child : group.getFeatures()) {
                    DirectedArc arc = DotFactory.eINSTANCE.createDirectedArc();
                    arc.setFromNode(featureToNode.get(parent));
                    arc.setToNode(featureToNode.get(child));
                    arc.setColor("white");

                    if (group instanceof AlternativeFeatureGroup) {
                        arc.setArrowHead("none");
                        arc.setArrowTail("odot");
                    } else if (group instanceof OrFeatureGroup) {
                        arc.setArrowHead("none");
                        arc.setArrowTail("dot");
                    } else if (group instanceof MandatoryFeatureGroup) {
                        arc.setArrowHead("dot");
                        arc.setArrowTail("none");
                    } else if (group instanceof OptionalFeatureGroup) {
                        arc.setArrowHead("odot");
                        arc.setArrowTail("none");
                    }

                    dotGraph.getNodes().add(arc); // Note: arcs are part of layers normally, simplified here
                }
            }
        }

        // TODO: Create constraint rendering as HTML-like node (not implemented in this stub)

        outputResource.getContents().add(dotGraph);
        outputResource.save(null);

        System.out.println("Transformation complete.");
    }
}
