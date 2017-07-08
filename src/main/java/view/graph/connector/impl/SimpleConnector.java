package main.java.view.graph.connector.impl;

import javafx.fxml.FXMLLoader;
import main.java.view.graph.connector.base.controller.AConnectorController;
import main.java.view.graph.node.base.interfaces.INodeController;

import java.io.IOException;
import java.net.URL;

/**
 * Created by harrisonturton on 8/7/17.
 */
public class SimpleConnector extends AConnectorController {

    private final String viewPath = "/main/resources/views/AConnector.fxml";

    public SimpleConnector(INodeController parentNode) {
        super(parentNode);
        loadView();
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
}
