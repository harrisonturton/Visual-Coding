package main.java.view.graph.node.blocks.Builder;

import javafx.scene.layout.Pane;
import main.java.view.graph.node.blocks.ANodeBlock;

/**
 * Created by harrisonturton on 17/7/17.
 */
public interface IBlockBuilder {

    /**
     * Add a new block to the current list.
     * @param block
     */
    IBlockBuilder addBlock(ANodeBlock block);

    /**
     * Loads the FXML view for each block.
     */
    <T extends Pane> IBlockBuilder setViews(T root, Object controller);

}
