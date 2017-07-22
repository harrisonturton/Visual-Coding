package main.java.view.graph.node.node.impl.SampleNode;

import main.java.view.graph.node.blocks.impl.ButtonBlock;
import main.java.view.graph.node.blocks.impl.HeaderBlock;
import main.java.view.graph.node.blocks.impl.TypeValueBlock;
import main.java.view.graph.node.node.base.ABlockFacade;

/**
 * Created by harrisonturton on 19/7/17.
 */
public class SampleNodeBlockFacade extends ABlockFacade {

    public HeaderBlock getHeaderBlock() {
        return (HeaderBlock) this.getBlocks().get(0);
    }

    public TypeValueBlock getTypeValueBlock() {
        return (TypeValueBlock) this.getBlocks().get(1);
    }

    public ButtonBlock getButtonBlock() {
        return (ButtonBlock) this.getBlocks().get(2);
    }
}