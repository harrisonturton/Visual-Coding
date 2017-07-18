package main.java.view.graph.node.blocks;

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
     * Set the default values.
     */
    void setDefaults();

}
