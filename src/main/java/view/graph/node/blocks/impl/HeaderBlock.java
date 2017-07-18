package main.java.view.graph.node.blocks.impl;

import main.java.view.graph.node.blocks.ANodeBlock;

/**
 * Created by harrisonturton on 18/7/17.
 */
public class HeaderBlock extends ANodeBlock {

    private final String viewPath = "/main/resources/views/nodes/blocks/HeaderBlock.fxml";

    @Override
    public String getViewPath() {
        return this.viewPath;
    }
}
