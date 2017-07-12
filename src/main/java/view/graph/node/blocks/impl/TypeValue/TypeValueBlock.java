package main.java.view.graph.node.blocks.impl.TypeValue;

import javafx.scene.Node;
import main.java.view.graph.node.blocks.base.ANodeBlock;

/**
 * Created by harrisonturton on 12/7/17.
 */
public class TypeValueBlock extends ANodeBlock {

    private final String viewPath = "/main/resources/view/node/block/TypeValueBlock.fxml";

    public TypeValueBlock(Node container) {
        super(container);
    }

    @Override
    public void initializeValues() {

    }

    @Override
    public String getViewPath() {
        return this.viewPath;
    }
}
