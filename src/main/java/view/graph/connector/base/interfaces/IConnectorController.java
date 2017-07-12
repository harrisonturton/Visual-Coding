package main.java.view.graph.connector.base.interfaces;

import main.java.view.graph.node.node.base.interfaces.INodeController;

/**
 * Created by harrisonturton on 5/7/17.
 */
public interface IConnectorController {

    /**
     * Get the Node that this Connector is associated with.
     */
    INodeController getNode();

    /**
     * Implement drag & drop functionality
     */
    void setConnectBehaviour();
}
