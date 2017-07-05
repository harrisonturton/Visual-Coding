package main.java.event;

import main.java.event.interfaces.IConnectionEvent;
import main.java.view.nodes.node.base.interfaces.INodeController;

/**
 * Created by harrisonturton on 5/7/17.
 */
public class ConnectionEvent implements IConnectionEvent {

    private INodeController master;
    private INodeController slave;

    public ConnectionEvent (INodeController master, INodeController slave) {
        this.master = master;
        this.slave = slave;
    }

    @Override
    public INodeController getNode() {
        return master; // todo Check if we need to set master or slave here.
    }

    @Override
    public INodeController getMasterNode() {
        return master;
    }

    @Override
    public INodeController getSlaveNode() {
        return slave;
    }
}