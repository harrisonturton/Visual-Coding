package main.java.view.graph.node.connector;

import javafx.scene.shape.Line;
import main.java.view.graph.node.node.base.controller.ANodeController;
import main.java.view.util.Scene;

/**
 * Created by harrisonturton on 26/7/17.
 */
public class LinkCurve extends Line {

    private final ConnectorController connector;

    public LinkCurve(ConnectorController connector) {
        this.connector = connector;
    }

    public void bindToConnector() {
        ANodeController node = this.connector.getBlock().getNode();

        node.layoutXProperty().addListener(((observable, oldValue, newValue) -> {
            this.setStartX(Scene.getSceneCenter(connector).getKey());
        }));

        node.layoutYProperty().addListener(((observable, oldValue, newValue) -> {
            this.setStartY(Scene.getSceneCenter(connector).getVal());
        }));
    }
}