package main.java.event.interfaces;

import main.java.view.nodes.node.base.interfaces.INodeController;

/**
 * Created by harrisonturton on 5/7/17.
 */
public interface IConnectionEvent extends IViewEvent {

    /**
     * Return the Node object that initiated the connection.
     *
     * @return
     */
    INodeController getMasterNode();

    /**
     * Return the Node object that recieved the connection.
     *
     * @return
     */
    INodeController getSlaveNode();

}
