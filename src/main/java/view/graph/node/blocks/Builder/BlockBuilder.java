package main.java.view.graph.node.blocks.Builder;

import javafx.scene.layout.Pane;
import main.java.view.graph.node.blocks.ANodeBlock;
import main.java.view.util.Fxml;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by harrisonturton on 17/7/17.
 */
public class BlockBuilder implements IBlockBuilder {

    private List<ANodeBlock> blocks = new ArrayList<>();

    @Override
    public IBlockBuilder addBlock(ANodeBlock block) {
        this.blocks.add(block);

        return this;
    }

    @Override
    public <T extends Pane> IBlockBuilder setViews(T root, Object controller) {
        for (ANodeBlock block : blocks) {
            Fxml.loadFxml(root, block.getViewPath(), controller);
        }

        return this;
    }

}