package main.java.view.graph.node.blocks;

import javafx.scene.layout.HBox;

/**
 * Created by harrisonturton on 12/7/17.
 */
public abstract class ANodeBlock extends HBox implements INodeBlock {

    @Override
    public void setDefaults() {
        System.out.println("Setting default values...");
    }

}
