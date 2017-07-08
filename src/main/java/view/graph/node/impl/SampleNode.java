package main.java.view.graph.node.impl;

import main.java.view.graph.connector.base.controller.AConnectorController;
import main.java.view.graph.connector.impl.SimpleConnector;
import main.java.view.graph.node.base.controller.ANodeController;

/**
 * Created by harrisonturton on 4/7/17.
 */
public class SampleNode extends ANodeController {

    private final String innerViewPath = "/main/resources/views/SampleNode.fxml";

    @Override
    public String getInnerViewPath() {
        return innerViewPath;
    }

    public void setConnectors() {
        System.out.println("Setting connectors ...");

        for (int i = 0; i < 3; i++) {
            AConnectorController connector = new SimpleConnector(this);
            this.getChildren().add(connector);
            connector.setCenterX(this.getWidth() + 10);
            connector.setCenterY((this.getHeight() / 3) * i);
        }
    }

    public void onActionTest() {
        System.out.println("Clicked!");
    }
}