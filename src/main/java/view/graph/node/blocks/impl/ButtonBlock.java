package main.java.view.graph.node.blocks.impl;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import main.java.view.graph.node.blocks.base.INodeBlock;

/**
 * Created by harrisonturton on 18/7/17.
 */
public class ButtonBlock implements INodeBlock {

    private final String viewPath = "/main/resources/views/nodes/blocks/ButtonBlock.fxml";

    @FXML
    private Button button;

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