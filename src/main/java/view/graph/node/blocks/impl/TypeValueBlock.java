package main.java.view.graph.node.blocks.impl;

import javafx.fxml.FXML;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextField;
import main.java.view.graph.node.blocks.base.INodeBlock;

/**
 * Created by harrisonturton on 12/7/17.
 */
public class TypeValueBlock implements INodeBlock {

    private final String viewPath = "/main/resources/views/nodes/blocks/TypeValueBlock.fxml";

    @FXML
    private TextField textfield;
    private ComboBox combobox;

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
