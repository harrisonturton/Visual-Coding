package main.java.view.graph;

import javafx.fxml.FXMLLoader;
import javafx.scene.Node;

import java.io.IOException;
import java.net.URL;

/**
 * Created by harrisonturton on 12/7/17.
 */
public class Fxml {

    public static <T extends Node> void loadFxml(T root, String url) {
        URL viewPath = root.getClass().getResource(url);

        FXMLLoader loader = new FXMLLoader(viewPath);
        loader.setController(root);
        loader.setRoot(root);

        try {
            loader.load();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static <T extends Node> void loadFxml(T resourceRoot, String url, Object root, Object controller) {
        URL viewPath = resourceRoot.getClass().getResource(url);

        FXMLLoader loader = new FXMLLoader(viewPath);
        loader.setController(controller);
        loader.setRoot(root);

        try {
            loader.load();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
