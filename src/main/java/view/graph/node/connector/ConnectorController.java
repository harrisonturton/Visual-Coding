package main.java.view.graph.node.connector;

import javafx.fxml.Initializable;
import javafx.scene.layout.Region;
import javafx.scene.shape.Line;
import main.java.util.MutablePair;
import main.java.view.graph.node.blocks.base.ANodeBlock;
import main.java.view.graph.node.node.base.controller.ANodeController;
import main.java.view.util.Fxml;

import java.net.URL;
import java.util.ResourceBundle;

/**
 * Created by harrisonturton on 25/7/17.
 */
public class ConnectorController extends Region implements Initializable {

    private ANodeBlock block;

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        setHandlers();
    }

    public void setHandlers() {
        MutablePair<Double, Double> delta = new MutablePair<>(0.0, 0.0);
        Line line = new Line();
        this.getBlock().getNode().getSceneParent().getChildren().add(line);

        ANodeController node = this.getBlock().getNode();

        this.setOnMousePressed(event -> {
            this.getBlock().getNode().setCanDrag(false);

            Double dragDeltaX = node.getLayoutX() - event.getSceneX();
            Double dragDeltaY = node.getLayoutY() - event.getSceneY();
            delta.setAll(dragDeltaX, dragDeltaY);

            event.consume();
        });

        this.setOnMouseDragged(event -> {
            line.setEndX(event.getSceneX() + delta.getVal());
            line.setEndY(event.getSceneY() + delta.getKey());

            event.consume();
        });

        this.setOnMouseDragReleased(event -> {
            this.getBlock().getNode().setCanDrag(true);
            System.out.println("Ended");
            line.setEndX(0.0);
            line.setEndY(0.0);
        });
    }

    public void load(EConnectorDir direction) {
        switch (direction) {
            case INCOMING:
                Fxml.loadFxml(this, "/main/resources/views/nodes/blocks/LeftConnector.fxml", this);
                break;
            case OUTGOING:
                Fxml.loadFxml(this, "/main/resources/views/nodes/blocks/RightConnector.fxml", this);
                break;
        }

    }

    public ANodeBlock getBlock() {
        return block;
    }

    public void setBlock(ANodeBlock block) {
        this.block = block;
    }
}
