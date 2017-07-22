package main.java.view.graph.node.node.base.controller;

import javafx.fxml.FXML;
import javafx.scene.layout.VBox;
import main.java.util.MutablePair;
import main.java.view.graph.node.node.base.ABlockFacade;
import main.java.view.util.Fxml;

/**
 * Created by harrisonturton on 4/7/17.
 */
public abstract class ANodeController extends VBox implements INodeController {

    private final String outerViewPath = "/main/resources/views/VboxNode.fxml";
    private boolean canDrag = true;

    @FXML
    private VBox childParent;

    public ANodeController() {
        setOuterView();
        setMovement();
        setConnectors();

        this.getFacade().setBlocks(this.getBlocks());
    }

    protected abstract ABlockFacade getFacade();

    // Load the wrapper VBox that holds the child Blocks
    public void setOuterView() {
        Fxml.loadFxml(this, this.outerViewPath, this);
    }

    // Set drag handlers
    public void setMovement() {
        MutablePair<Double, Double> delta = new MutablePair<>(0.0, 0.0);

        this.setOnMousePressed(event -> {
            if (this.canDrag) {
                Double dragDeltaX = this.getLayoutX() - event.getSceneX();
                Double dragDeltaY = this.getLayoutY() - event.getSceneY();
                delta.setAll(dragDeltaX, dragDeltaY);
            }

            event.consume();
        });

        this.setOnMouseDragged(event -> {
            if (this.canDrag) {
                double newPosX = event.getSceneX() + delta.getKey();
                double newPosY = event.getSceneY() + delta.getVal();
                this.relocate(newPosX, newPosY);
            }

            event.consume();
        });
    }

    // The FXML component that holds the child Blocks
    public VBox getInnerContainer() {
        return this.childParent;
    }

    @Override
    public boolean isCanDrag() {
        return canDrag;
    }

    @Override
    public void setCanDrag(boolean canDrag) {
        this.canDrag = canDrag;
    }
}
