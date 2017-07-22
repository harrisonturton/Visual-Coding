package main.java.view.graph.node.blocks.base.builder;

import javafx.scene.layout.Pane;
import main.java.view.graph.node.blocks.base.INodeBlock;

/**
 * Created by harrisonturton on 17/7/17.
 */
public interface IBlockBuilder {

    /**
     * Add a new block to the current list.
     * @param block
     */
    IBlockBuilder addBlock(INodeBlock block);

    /**
     * Load the FXML view for each block.
     */
    <T extends Pane> IBlockBuilder setViews(T root);

}
