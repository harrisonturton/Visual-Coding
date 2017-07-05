package main.java.view.nodes.node.impl;

import javafx.fxml.FXMLLoader;
import main.java.view.nodes.node.base.controller.ANodeController;

import java.net.URL;

/**
 * Created by harrisonturton on 4/7/17.
 */
public class SampleNode extends ANodeController {

    public void setInnerView () {
        URL innerPath = getClass().getResource("/resources/view/window.fxml");

        FXMLLoader innerLoader = new FXMLLoader(innerPath);
        innerLoader.setController(this);
        innerLoader.setRoot(this.getInnerContainer());
    }

    public void setConnectors () {
        System.out.println("Setting connectors ...");
    }
}