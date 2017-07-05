package main.java.view.nodes.node.base.controller;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.VBox;
import main.java.view.nodes.node.base.interfaces.INodeController;
import main.java.view.nodes.connector.base.ConnectorGenerator;


import java.io.IOException;
import java.net.URL;

/**
 * Created by harrisonturton on 4/7/17.
 */
public abstract class ANodeController extends BorderPane implements INodeController {

    @FXML
    private VBox childParent;

    // Load fixed template and child view
    public void setOuterView () {
        URL outerPath = getClass().getResource("/main/resources/fxml/ANodeController.fxml");

        FXMLLoader outerLoader = new FXMLLoader(outerPath);
        outerLoader.setRoot(this);
        outerLoader.setController(this);

        try {
            // outerLoader must be loaded before innerLoader.
            outerLoader.load();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    // Set click & drag handlers
    public void setMovement () {

    }

    // Generate surrounding Connectors
    public void setConnectors (ConnectorGenerator generator) {

    }

    @Override
    public Node getInnerContainer () {
        return this.childParent;
    }
}
