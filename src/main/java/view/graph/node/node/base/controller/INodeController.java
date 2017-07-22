package main.java.view.graph.node.node.base.controller;

import main.java.view.graph.node.blocks.base.INodeBlock;

import java.util.List;

/**
 * Created by harrisonturton on 4/7/17.
 */
public interface INodeController {

    /**
     * Load the wrapper view.
     */
    void setOuterView();

    /**
     * Load the node blocks as children of the wrapper.
     */
    List<INodeBlock> getBlocks();

    /**
     * Set the click & drag functionality.
     */
    void setMovement();

    /**
     * Generate Connector objects around the Node.
     */
    void setConnectors();

    /**
     * Determine whether or not the Node can be dragged around.
     */
    boolean isCanDrag();

    /**
     * Set whether or not the Node can be dragged around.
     */
    void setCanDrag(boolean canDrag);

}