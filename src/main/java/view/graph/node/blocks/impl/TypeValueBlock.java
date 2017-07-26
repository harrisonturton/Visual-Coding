package main.java.view.graph.node.blocks.impl;

import javafx.fxml.FXML;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextField;
import main.java.view.graph.node.blocks.base.ANodeBlock;
import main.java.view.graph.node.blocks.base.INodeBlock;
import main.java.view.graph.node.connector.ConnectorController;
import main.java.view.graph.node.connector.EConnectorDir;

/**
 * Created by harrisonturton on 12/7/17.
 */
public class TypeValueBlock extends ANodeBlock implements INodeBlock {

    private final String viewPath = "/main/resources/views/nodes/blocks/TypeValueBlock.fxml";

    public ConnectorController leftController;
    public ConnectorController rightController;

    @FXML private TextField textfield;
    @FXML private ComboBox combobox;

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

        this.leftController = left;
        this.rightController = right;
    }

    @Override
    public String getViewPath() {
        return this.viewPath;
    }

    public TextField getTextfield() {
        return textfield;
    }

    public ComboBox getCombobox() {
        return combobox;
    }
}
