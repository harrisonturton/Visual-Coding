package main.java.view.graph.connector.base.controller;

import javafx.fxml.FXMLLoader;
import javafx.scene.shape.Circle;
import main.java.view.graph.connector.base.interfaces.IConnectorController;
import main.java.view.graph.node.base.interfaces.INodeController;

import java.io.IOException;
import java.net.URL;

/**
 * Created by harrisonturton on 5/7/17.
 */
public class AConnectorController extends Circle implements IConnectorController {

    private final INodeController parentNode;

    public AConnectorController(INodeController parentNode) {
        this.parentNode = parentNode;
    }

    @Override
    public INodeController getNode() {
        return this.parentNode;
    }

    @Override
    public void setConnectBehaviour() {

    }
}
