package main.java.view.graph.node.connector;

import javafx.scene.layout.Region;
import main.java.view.util.Fxml;

/**
 * Created by harrisonturton on 25/7/17.
 */
public class ConnectorController extends Region {

    public ConnectorController() {
        load();
    }

    public void load() {
        Fxml.loadFxml(this, "/main/resources/views/nodes/blocks/LeftConnector.fxml", this);
    }

    private void setHandlers() {
        this.setOnMouseEntered(event -> {
            this.setStyle("-fx-background-color: CORAL;");
        });
    }

}
