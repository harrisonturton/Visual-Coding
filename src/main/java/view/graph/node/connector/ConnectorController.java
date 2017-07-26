package main.java.view.graph.node.connector;

import javafx.scene.layout.Region;
import main.java.util.MutablePair;
import main.java.view.graph.node.blocks.base.ANodeBlock;
import main.java.view.graph.node.node.base.controller.ANodeController;
import main.java.view.util.Fxml;

/**
 * Created by harrisonturton on 25/7/17.
 */
public class ConnectorController extends Region /*implements Initializable*/ {

    private ANodeBlock block;

    public void setHandlers() {
        MutablePair<Double, Double> delta = new MutablePair<>(0.0, 0.0);
        LinkCurve line = new LinkCurve(this);
        line.bindToConnector();

        this.getBlock().getNode().getSceneParent().getChildren().add(line);

        this.getBlock().getNode().layoutXProperty().addListener(((observable, oldValue, newValue) -> {
            line.setEndX((double) newValue);
        }));

        this.getBlock().getNode().layoutYProperty().addListener(((observable, oldValue, newValue) -> {
            line.setEndY((double) newValue);
        }));


        ANodeController node = this.getBlock().getNode();

        this.setOnMouseClicked(event -> {
            delta.setKey(node.getLayoutX() - event.getSceneX());
            delta.setVal(node.getLayoutY() - event.getSceneY());

            System.out.println("Node Pos: " + node.getLayoutX() + ", " + node.getLayoutY());
            System.out.println("Connector Pos: " + this.getLayoutX() + ", " + this.getLayoutY());
        });

        this.setOnMousePressed(event -> {
            this.getBlock().getNode().setCanDrag(false);

            event.consume();
        });

        this.setOnMouseDragged(event -> {

            Double x = event.getSceneX() - delta.getKey();
            Double y = event.getSceneY() - delta.getVal();

            line.setEndX(x);
            line.setEndY(y);

            event.consume();
        });

        this.setOnMouseReleased(event -> {
            this.getBlock().getNode().setCanDrag(true);
        });

        this.setOnMouseDragReleased(event -> {
            this.getBlock().getNode().setCanDrag(true);
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
