package main.java.view.graph.node.blocks.impl;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.layout.VBox;
import main.java.view.graph.node.blocks.base.ANodeBlock;
import main.java.view.graph.node.blocks.base.INodeBlock;
import main.java.view.graph.node.connector.ConnectorController;

/**
 * Created by harrisonturton on 18/7/17.
 */
public class ButtonBlock extends ANodeBlock implements INodeBlock {

    private final String viewPath = "/main/resources/views/nodes/blocks/ButtonBlock.fxml";

    @FXML
    private Button button;
    private VBox leftConnectorParent;
    private VBox rightConnectorParent;

    @Override
    public void setConnectors() {
        ConnectorController sample = new ConnectorController();
        sample.load();
        leftConnectorParent.getChildren().add(sample);
    }

    @Override
    public String getViewPath() {
        return this.viewPath;
    }

    public void buttonClick() {
        button.setText("Button has been clicked!");
        System.out.println("Button clicked");
    }

    public Button getButton() {
        return this.button;
    }
}