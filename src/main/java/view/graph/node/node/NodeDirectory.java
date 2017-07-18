package main.java.view.graph.node.node;

import main.java.view.graph.node.node.base.ENode;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by harrisonturton on 16/7/17.
 */
public class NodeDirectory {

    private static String resourceDir = "/main/resources/views/nodes/impl/";

    public static final Map<ENode, String> directory;
    static {
        directory = new HashMap<>();
        directory.put(ENode.SAMPLE, resourceDir + "SampleNode.fxml");
        directory.put(ENode.ALTERNATIVE, resourceDir + "AlternativeNode.fxml");
    }
}
