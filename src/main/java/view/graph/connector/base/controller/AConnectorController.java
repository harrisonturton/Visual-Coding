package main.java.view.graph.connector.base.controller;

import javafx.fxml.FXMLLoader;
import javafx.scene.shape.Circle;
import main.java.view.graph.connector.base.interfaces.IConnectorController;
import main.java.view.graph.node.base.controller.ANodeController;
import main.java.view.graph.node.base.interfaces.INodeController;

import java.io.IOException;
import java.net.URL;

/**
 * Created by harrisonturton on 5/7/17.
 */
public class AConnectorController extends Circle implements IConnectorController {

    private final String viewPath = "/main/resources/views/AConnector.fxml";
    private final INodeController parentNode;
    private double heightFrac;

    public AConnectorController(INodeController parentNode) {
        this.parentNode = parentNode;
        this.loadView();
    }

    public void loadView() {
        URL viewUrl = getClass().getResource(this.viewPath);

        FXMLLoader loader = new FXMLLoader(viewUrl);
        loader.setController(this);
        loader.setRoot(this);

        try {
            loader.load();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void addToNode(ANodeController node, double heightFrac) {
        // Workaround due to anon. classes needing to reference final var
        final double _heightFrac = heightFrac;
        node.getChildren().add(this);

        node.widthProperty().addListener((observable, oldValue, newValue) -> {
            this.setCenterX((double) newValue + 15.0);
        });

        node.heightProperty().addListener((observable, oldValue, newValue) -> {
            this.setCenterY(((double) newValue * _heightFrac) - this.getRadius());
        });
    }

    @Override
    public void setConnectBehaviour() {

    }

    @Override
    public INodeController getNode() {
        return this.parentNode;
    }
}
