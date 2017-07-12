package main.java.view.graph.node.blocks;

import javafx.scene.Node;
import main.java.view.graph.node.blocks.base.INodeBlock;

/**
 * Created by harrisonturton on 12/7/17.
 */
public interface INodeBuilder {

    /**
     * Append a block to the existing layout.
     *
     * @param block
     * @return
     */
    INodeBuilder addBlock(INodeBlock block);

    /**
     * Get the Node containing all the blocks.
     *
     * @return
     */
    Node getNode();

}
