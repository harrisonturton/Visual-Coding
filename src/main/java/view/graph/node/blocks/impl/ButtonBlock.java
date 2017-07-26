package main.java.view.graph.node.blocks.impl;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import main.java.view.graph.node.blocks.base.ANodeBlock;
import main.java.view.graph.node.blocks.base.INodeBlock;
import main.java.view.graph.node.connector.ConnectorController;
import main.java.view.graph.node.connector.EConnectorDir;

/**
 * Created by harrisonturton on 18/7/17.
 */
public class ButtonBlock extends ANodeBlock implements INodeBlock {

    private final String viewPath = "/main/resources/views/nodes/blocks/ButtonBlock.fxml";

    @FXML
    private Button button;

    @Override
    public void setConnectors() {
        ConnectorController left = new ConnectorController();
        left.setBlock(this);
        left.load(EConnectorDir.INCOMING);
        this.getLeftConnectorParent().getChildren().add(left);

        ConnectorController right = new ConnectorController();
        right.setBlock(this);
        right.load(EConnectorDir.OUTGOING);
        this.getRightConnectorParent().getChildren().add(right);
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