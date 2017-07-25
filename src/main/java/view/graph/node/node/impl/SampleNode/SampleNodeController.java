package main.java.view.graph.node.node.impl.SampleNode;

import main.java.view.graph.node.blocks.base.INodeBlock;
import main.java.view.graph.node.blocks.base.builder.BlockBuilder;
import main.java.view.graph.node.blocks.impl.HeaderBlock;
import main.java.view.graph.node.blocks.impl.TypeValueBlock;
import main.java.view.graph.node.node.base.ABlockFacade;
import main.java.view.graph.node.node.base.controller.ANodeController;

import java.util.List;


/**
 * Created by harrisonturton on 4/7/17.
 */
public class SampleNodeController extends ANodeController {

    private List<INodeBlock> blocks;
    private SampleNodeBlockFacade facade;

    public List<INodeBlock> getBlocks() {
        BlockBuilder builder = new BlockBuilder();
        builder.addBlock(new HeaderBlock())
                .addBlock(new TypeValueBlock())
                .setViews(this);

        return builder.getBlocks();
    }

    public ABlockFacade getFacade() {
        if (this.facade == null) {
            this.facade = new SampleNodeBlockFacade();
        }

        return this.facade;
    }

    public void setConnectors() {
        setIncomingConnectors();
        setOutgoingConnectors();
    }

    private void setIncomingConnectors() {
        System.out.println("Setting incoming connectors...");
    }

    private void setOutgoingConnectors() {
        System.out.println("Setting outgoing connectors...");
    }
}