package main.java.view.graph.node.blocks.base;

import javafx.scene.Node;

/**
 * Created by harrisonturton on 12/7/17.
 */
public interface INodeBlock {

    /**
     * Load the standard SampleNode view.
     */
    void setOuterView();

    /**
     * Load the custom child view.
     */
    void setInnerView();

    /**
     * Get the absolute path to the child view.
     * @return
     */
    String getInnerViewPath();

    /**
     * Get the Vbox that contains this block.
     * @return
     */
    Node getInnerContainer();

    /**
     * Set initial values, if any exist.
     */
    void initializeValues();
}
