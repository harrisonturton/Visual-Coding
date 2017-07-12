package main.java.view.graph.node.node.impl.SampleNode;

import main.java.view.graph.node.node.base.controller.ANodeController;

/**
 * Created by harrisonturton on 4/7/17.
 */
public class SampleNodeController extends ANodeController {

    private final String innerViewPath = "/main/resources/views/TestNode.fxml";

    @Override
    public String getInnerViewPath() {
        return innerViewPath;
    }

    public void setConnectors() {
        setIncomingConnectors();
        setOutgoingConnectors();
    }

    public void setIncomingConnectors() {
        System.out.println("Setting incoming connectors..."); // todo set Incoming connectors
    }

    public void setOutgoingConnectors() {
        /*for (int i = 0; i < 3; i++) {
            AConnectorController connector = new SimpleConnector(this);
            connector.addToNode(this, ((((double) i) * 4.0) + 3.0) / (4.0 * 3.0));
        }*/
    }
}