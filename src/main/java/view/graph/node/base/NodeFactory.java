package main.java.view.graph.node.base;

import javafx.scene.layout.Pane;
import main.java.view.graph.node.base.controller.ANodeController;
import main.java.view.graph.node.impl.SampleNode;

/**
 * Created by harrisonturton on 4/7/17.
 */
public class NodeFactory {

    private ANodeController node;

    public NodeFactory createNode(ENodeType type) {
        switch (type) {
            case SAMPLE:
                this.node = createSampleNode(); // todo Set this.node using createSampleNode();
                break;
            default:
                throw new IllegalArgumentException(String.format("Unknown ENodeType of type %s", type));
        }

        return this;
    }

    private ANodeController genericLoadNode(ANodeController node) {
        node.setOuterView();
        node.setInnerView();
        node.setMovement();
        node.setConnectors();

        return node;
    }

    private ANodeController createSampleNode() {
        SampleNode node = new SampleNode();

        return genericLoadNode(node);
    }

    public <T extends Pane> void addToScene(T parent) {
        parent.getChildren().add(node);
    }

    public ANodeController getNode() {
        return node;
    }
}
