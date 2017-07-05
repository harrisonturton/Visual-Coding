package main.java.model.observer;

import main.java.event.interfaces.IViewEvent;

/**
 * Created by harrisonturton on 5/7/17.
 */
public interface IViewObserver {

    /**
     * Handle the view event when it is emitted.
     *
     * @param event
     */
    void handleViewEvent(IViewEvent event);

}
