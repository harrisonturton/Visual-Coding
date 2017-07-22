package main.java.view.graph.node.node.base;

import main.java.view.graph.node.blocks.base.INodeBlock;

import java.util.List;

/**
 * Created by harrisonturton on 19/7/17.
 */
public abstract class ABlockFacade {

    private List<INodeBlock> blocks;

    public void setBlocks(List<INodeBlock> blocks) {
        this.blocks = blocks;
    }

    public List<INodeBlock> getBlocks() {
        return blocks;
    }
}
