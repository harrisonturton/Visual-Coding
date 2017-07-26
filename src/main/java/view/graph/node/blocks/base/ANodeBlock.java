package main.java.view.graph.node.blocks.base;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.layout.VBox;
import main.java.view.graph.node.node.base.controller.ANodeController;
import main.java.view.util.Fxml;

import java.net.URL;
import java.util.ResourceBundle;

/**
 * Created by harrisonturton on 25/7/17.
 */
public abstract class ANodeBlock implements INodeBlock, Initializable {

    private ANodeController node;

    @FXML private VBox leftConnectorParent;
    @FXML private VBox rightConnectorParent;

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        setConnectors();
    }

    @Override
    public <T extends Node> void setView(T root) {
        Fxml.loadFxml(root, this.getViewPath(), this);
    }

    protected VBox getLeftConnectorParent() {
        return this.leftConnectorParent;
    }

    protected VBox getRightConnectorParent() {
        return this.rightConnectorParent;
    }

    public ANodeController getNode() {
        return node;
    }

    public void setNode(ANodeController node) {
        this.node = node;
    }
}