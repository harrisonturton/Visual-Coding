package main.java.view.window.controllers;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.layout.AnchorPane;
import main.java.view.graph.node.node.impl.SampleNode.SampleNodeController;

public class WindowController {

    @FXML
    private AnchorPane canvas;

    public void add(ActionEvent actionEvent) {
        SampleNodeController node = new SampleNodeController();

        canvas.getChildren().add(node);
    }
}