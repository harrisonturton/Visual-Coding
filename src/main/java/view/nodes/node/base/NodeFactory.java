package main.java.view.nodes.node.base;

import main.java.view.nodes.node.base.interfaces.INodeController;
import main.java.view.nodes.node.impl.SampleNode;

/**
 * Created by harrisonturton on 4/7/17.
 */
public class NodeFactory {

    private INodeController node;

    public NodeFactory(ENodeType type) {
        createNodeType(type);
    }

    private void createNodeType(ENodeType type) {
        switch (type) {
            case SAMPLE:
                createSampleNode(); // todo Set this.node using createSampleNode();
                break;
            default:
                throw new IllegalArgumentException(String.format("Unknown ENodeType of type %s", type));
        }
    }

    private INodeController genericLoadNode (INodeController node) {
        node.setOuterView();
        node.setInnerView();
        node.setMovement();
        node.setConnectors();

        return node;
    }

    private INodeController createSampleNode() {
        return genericLoadNode(new SampleNode());
    }
}
