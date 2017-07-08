package main.java.view.graph.node.base;

import javafx.scene.layout.Pane;
import main.java.view.graph.node.base.controller.ANodeController;
import main.java.view.graph.node.impl.SampleNode;

/**
 * Created by harrisonturton on 4/7/17.
 */
public class NodeFactory {

    private ANodeController node;

    public void createNode(ENodeType type) {
        switch (type) {
            case SAMPLE:
                this.node = createSampleNode(); // todo Set this.node using createSampleNode();
                break;
            default:
                throw new IllegalArgumentException(String.format("Unknown ENodeType of type %s", type));
        }
    }

    public <T extends Pane> void addToScene(T parent) {
        System.out.println(node.getWidth());

        parent.getChildren().add(node);

        System.out.println(node.getBoundsInLocal().getWidth());

        System.out.println(node.getWidth());

        node.setConnectors(); // must be called after adding to scene
    }

    private ANodeController genericLoadNode(ANodeController node) {
        node.setOuterView();
        node.setInnerView();
        node.setMovement();

        return node;
    }

    private ANodeController createSampleNode() {
        SampleNode node = new SampleNode();

        return genericLoadNode(node);
    }

    public ANodeController getNode() {
        return node;
    }
}
