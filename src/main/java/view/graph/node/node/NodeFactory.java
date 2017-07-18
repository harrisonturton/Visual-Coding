package main.java.view.graph.node.node;

import javafx.scene.layout.Pane;
import main.java.view.graph.node.node.base.ENode;
import main.java.view.graph.node.node.base.controller.ANodeController;
import main.java.view.graph.node.node.impl.SampleNode.SampleNodeController;

/**
 * Created by harrisonturton on 4/7/17.
 */
public class NodeFactory {

    private ANodeController node;

    public NodeFactory createNode(ENode type) {
        switch (type) {
            case SAMPLE:
                this.node = createSampleNode(); // todo Set this.node using createSampleNode();
                break;
            default:
                throw new IllegalArgumentException(String.format("Unknown ENodeType of type %s", type));
        }

        return this;
    }

    public ANodeController genericLoadNode(ANodeController node) {
        node.setOuterView();
//        node.setInnerView();
        node.setMovement();
        node.setConnectors();

        return node;
    }

    public ANodeController loadNodeBlock(ANodeController node) {
        node.setOuterView();
        node.setBlocks();
        node.setMovement();
        node.setConnectors();

        return node;
    }

    private ANodeController createSampleNode() {
        SampleNodeController node = new SampleNodeController();

        return loadNodeBlock(node);
    }

    public <T extends Pane> void addToScene(T parent) {
        parent.getChildren().add(node);
    }

    public ANodeController getNode() {
        return node;
    }
}
