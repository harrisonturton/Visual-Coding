package main.java.view.graph.node.node.base.controller;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.layout.VBox;
import main.java.util.MutablePair;
import main.java.view.graph.node.node.base.interfaces.INodeController;

import java.io.IOException;
import java.net.URL;

/**
 * Created by harrisonturton on 4/7/17.
 */
public abstract class ANodeController extends VBox implements INodeController {

    private final String outerViewPath = "/main/resources/views/ANewNode.fxml";
    private boolean canDrag = true;

    @FXML
    private VBox childParent;

    // Load fixed template and child view
    public void setOuterView() {
        URL outerPath = getClass().getResource(this.outerViewPath);

        FXMLLoader outerLoader = new FXMLLoader(outerPath);
        outerLoader.setRoot(this);
        outerLoader.setController(this);

        try {
            // outerLoader must be loaded before innerLoader.
            outerLoader.load();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void setInnerView() {
        URL innerPath = getClass().getResource(this.getInnerViewPath());

        FXMLLoader innerLoader = new FXMLLoader(innerPath);
        innerLoader.setController(this);
        innerLoader.setRoot(this.getInnerContainer());

        try {
            innerLoader.load();
        } catch (IOException e) {
            e.printStackTrace();
        }
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


    @Override
    public Node getInnerContainer() {
        return this;
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
