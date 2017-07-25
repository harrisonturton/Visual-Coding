package main.java.view.graph.node.blocks.base.builder;

import javafx.scene.layout.Pane;
import main.java.view.graph.node.blocks.base.INodeBlock;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by harrisonturton on 17/7/17.
 */
public class BlockBuilder implements IBlockBuilder {

    private List<INodeBlock> blocks = new ArrayList<>();

    @Override
    public IBlockBuilder addBlock(INodeBlock block) {
        this.blocks.add(block);

        return this;
    }

    @Override
    public <T extends Pane> IBlockBuilder setViews(T root) {
        INodeBlock last = blocks.get(blocks.size() - 1);

        for (int i = 0; i < blocks.size(); i++) {

            blocks.get(i).setView(root);

//            URL viewPath = root.getClass().getResource(blocks.get(i).getViewPath());
//
//            FXMLLoader loader = new FXMLLoader(viewPath);
//            loader.setController(blocks.get(i));
//            loader.setRoot(root);
//
//            try {
//                loader.load();
//
//                if (i == 0) {
//                    HBox hbox = (HBox) loader.getNamespace().get("centerHbox");
//                    hbox.getStyleClass().add("cap");
//                }
//
//                if (i == blocks.size() - 1) {
//                    HBox hbox = (HBox) loader.getNamespace().get("centerHbox");
//                    hbox.getStyleClass().add("cup");
//                }
//
//            } catch (IOException e) {
//                e.printStackTrace();
//            }
        }

        return this;
    }

    public List<INodeBlock> getBlocks() {
        return this.blocks;
    }

}