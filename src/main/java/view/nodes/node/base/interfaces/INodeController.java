package main.java.view.nodes.node.base.interfaces;

import javafx.scene.Node;

/**
 * Created by harrisonturton on 4/7/17.
 */
public interface INodeController {

    /**
     * Load the standard SampleNode view.
     */
    void setOuterView();

    /**
     * Load the custom child view.
     */
    void setInnerView();

    /**
     * Set the click & drag functionality.
     */
    void setMovement();

    /**
     * Generate Connector objects around the Node.
     */
    void setConnectors();

    /**
     * Get the JavaFx Node object to be the parent of the child view.
     *
     * @return
     */
    Node getInnerContainer();
}