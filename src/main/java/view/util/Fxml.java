package main.java.view.util;

import javafx.fxml.FXMLLoader;
import javafx.scene.Node;

import java.io.IOException;
import java.net.URL;

/**
 * Created by harrisonturton on 12/7/17.
 */
public class Fxml {

    public static <T extends Node> void loadFxml(T root, String url, Object controller) {
        URL viewPath = root.getClass().getResource(url);

        FXMLLoader loader = new FXMLLoader(viewPath);
        loader.setController(controller);
        loader.setRoot(root);

        System.out.println(url);
        System.out.println(controller);
        System.out.println(root);

        try {
            loader.load();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
