package main.java.view.graph.node.blocks;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by harrisonturton on 16/7/17.
 */
public class BlockDirectory {

    private static String resourceDir = "/main/resources/views/nodes/blocks/";

    public static final Map<EBlock, String> directory;
    static {
        directory = new HashMap<>();
        directory.put(EBlock.Constant,  resourceDir + "constant.fxml");
        directory.put(EBlock.TypeValue, resourceDir + "typevalue.fxml");
        directory.put(EBlock.Value,     resourceDir + "value.fxml");
    }
}
