package main.java.view.graph.node.blocks;

import javafx.scene.Node;
import javafx.scene.layout.VBox;
import main.java.view.graph.node.blocks.base.ANodeBlock;
import main.java.view.graph.node.blocks.base.INodeBlock;

/**
 * Created by harrisonturton on 12/7/17.
 */
public class NodeBuilder implements INodeBuilder {

    private VBox container;

    @Override
    public INodeBuilder addBlock(ANodeBlock block) {
        this.container.getChildren().add(block);
    }

    @Override
    public Node getNode() {
        return null;
    }
}
