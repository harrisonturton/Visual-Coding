package main.java.view.graph.node.blocks.impl;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import main.java.view.graph.node.blocks.base.ANodeBlock;
import main.java.view.graph.node.blocks.base.INodeBlock;

/**
 * Created by harrisonturton on 18/7/17.
 */
public class HeaderBlock extends ANodeBlock implements INodeBlock {

    private final String viewPath = "/main/resources/views/nodes/blocks/HeaderBlock.fxml";

    @FXML
    private Label title;
    private VBox leftConnectorParent;
    private VBox rightConnectorParent;

    @Override
    public void setConnectors() {
        System.out.println(this.getLeftConnectorParent());
    }

    public void setDefaults() {
        this.title.setText("Example updated title");
    }

    @Override
    public String getViewPath() {
        return this.viewPath;
    }

    public Label getTitle() {
        return this.title;
    }
}
