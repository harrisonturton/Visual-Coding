package main.java.view.graph.node.blocks.base.builder;

import javafx.scene.layout.Pane;
import main.java.view.graph.node.blocks.base.ANodeBlock;
import main.java.view.graph.node.blocks.base.INodeBlock;
import main.java.view.graph.node.node.base.controller.ANodeController;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by harrisonturton on 17/7/17.
 */
public class BlockBuilder implements IBlockBuilder {

    private ANodeController node;
    private List<ANodeBlock> blocks = new ArrayList<>();

    public BlockBuilder(ANodeController node) {
        this.node = node;
    }

    @Override
    public IBlockBuilder addBlock(ANodeBlock block) {
        block.setNode(node);
        this.blocks.add(block);

        return this;
    }

    @Override
    public <T extends Pane> IBlockBuilder setViews(T root) {
        INodeBlock last = blocks.get(blocks.size() - 1);

        for (ANodeBlock block : blocks) {
            block.setView(root);
        }

        return this;
    }

    public List<ANodeBlock> getBlocks() {
        return this.blocks;
    }

}