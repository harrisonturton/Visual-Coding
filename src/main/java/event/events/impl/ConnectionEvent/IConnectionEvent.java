package main.java.event.events.impl.ConnectionEvent;

import main.java.event.events.base.IEvent;
import main.java.view.graph.node.node.base.controller.ANodeController;

/**
 * Created by harrisonturton on 7/7/17.
 */
public interface IConnectionEvent extends IEvent {

    ANodeController getSourceNode();

    ANodeController getDestinationNode();
}
