package main.java.view.util;

import javafx.geometry.Bounds;
import javafx.scene.Node;
import main.java.util.MutablePair;

/**
 * Created by harrisonturton on 26/7/17.
 */
public class Scene {
    public static MutablePair<Double, Double> getSceneCenter(Node node) {
        Bounds boundsInScene = node.localToScene(node.getLayoutBounds());
        double posX = boundsInScene.getMaxX() - (boundsInScene.getMaxX() - boundsInScene.getMinX()) / 2.0d;
        double posY = boundsInScene.getMaxY() - (boundsInScene.getMaxY() - boundsInScene.getMinY()) / 2.0d;

        return new MutablePair<>(posX, posY);
    }
}
