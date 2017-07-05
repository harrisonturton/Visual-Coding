package main.java.view.nodes.connector.base.interfaces;

import main.java.event.ConnectionEvent;

/**
 * Created by harrisonturton on 5/7/17.
 */
public interface IConnector {

    /**
     * Implement what happens on hover.
     */
    void setHoverBehaviour();

    /**
     * Implement what happens on click.
     */
    void setClickBehaviour();

    /**
     * Implement what happens on click & drag.
     */
    void setDragBehaviour();

    /**
     * Set what happens when a Connection is created.
     *
     * @param event
     */
    void setConnectBehaviour(ConnectionEvent event);
}
