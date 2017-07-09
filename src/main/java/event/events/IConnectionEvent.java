package main.java.event.events;

import main.java.view.graph.node.base.controller.ANodeController;

/**
 * Created by harrisonturton on 7/7/17.
 */
public interface IConnectionEvent extends IEvent {

    ANodeController getSourceNode();

    ANodeController getDestinationNode();
}
