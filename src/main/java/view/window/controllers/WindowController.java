package main.java.view.window.controllers;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.layout.AnchorPane;
import main.java.view.graph.node.base.ENodeType;
import main.java.view.graph.node.base.NodeFactory;

public class WindowController {

    @FXML
    private AnchorPane canvas;

    public void add(ActionEvent actionEvent) {
        NodeFactory factory = new NodeFactory();
        factory.createNode(ENodeType.SAMPLE).addToScene(canvas);
    }
}