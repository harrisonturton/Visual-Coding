package main.java.view.graph.node.blocks.base;

import javafx.scene.Node;
import javafx.scene.layout.HBox;
import main.java.view.graph.Fxml;

/**
 * Created by harrisonturton on 12/7/17.
 */
public abstract class ANodeBlock extends HBox implements INodeBlock {

    private final String outerViewPath = "/main/resources/views/ANewNode.fxml";

    @Override
    public void setOuterView() {
        Fxml.loadFxml(this, outerViewPath);
    }

    @Override
    public void setInnerView() {
        Fxml.loadFxml(this, )
    }

    @Override
    public String getInnerViewPath() {
        return null;
    }

    @Override
    public Node getInnerContainer() {
        return null;
    }

    @Override
    public void initializeValues() {

    }
}
