package main.java.view.window.controllers;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.layout.AnchorPane;
import main.java.view.graph.node.node.impl.SampleNode.SampleNodeController;

public class WindowController {

    @FXML
    private AnchorPane canvas;

    public void add(ActionEvent actionEvent) {
//        NodeFactory factory = new NodeFactory();
//        factory.createNode(ENode.SAMPLE).addToScene(canvas);

        SampleNodeController node = new SampleNodeController();

//        ConnectorController connector = new ConnectorController();
//        connector.load();

        canvas.getChildren().add(node);
    }
}