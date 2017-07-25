package main.java.view.graph.node.blocks.base;

import javafx.scene.Node;

/**
 * Created by harrisonturton on 12/7/17.
 */
public interface INodeBlock {

    /**
     * Get the path to the FXML view.
     * @return
     */
    String getViewPath();

    /**
     * Load the FXML view and associated Connectors
     */
    <T extends Node> void setView(T root);

    /**
     * Load associated Connectors, if applicable.
     */
    void setConnectors();
}
