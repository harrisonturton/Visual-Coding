package main.java.event.interfaces;

import main.java.view.nodes.node.base.interfaces.INodeController;

/**
 * Created by harrisonturton on 5/7/17.
 */
public interface IViewEvent {

    /**
     * Get the Node object that emitted the event.
     */
    INodeController getNode();
}