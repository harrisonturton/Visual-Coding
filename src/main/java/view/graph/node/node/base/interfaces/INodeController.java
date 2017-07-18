package main.java.view.graph.node.node.base.interfaces;

/**
 * Created by harrisonturton on 4/7/17.
 */
public interface INodeController {

    /**
     * Load the standard SampleNode view.
     */
    void setOuterView();

    /**
     * Load the node blocks as children of outer view.
     */
    void setBlocks();

    /**
     * Get the absolute path to the child view.
     * @return
     */
    String getInnerViewPath();

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

//    /**
//     * Get the JavaFx Node object to be the parent of the child view.
//     *
//     * @return
//     */
//    <T extends Region> T getInnerContainer();

}