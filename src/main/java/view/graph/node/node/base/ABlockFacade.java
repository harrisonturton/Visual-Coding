package main.java.view.graph.node.node.base;

import main.java.view.graph.node.blocks.base.ANodeBlock;

import java.util.List;

/**
 * Created by harrisonturton on 19/7/17.
 */
public abstract class ABlockFacade {

    private List<ANodeBlock> blocks;

    public void setBlocks(List<ANodeBlock> blocks) {
        this.blocks = blocks;
    }

    public List<ANodeBlock> getBlocks() {
        return blocks;
    }
}
