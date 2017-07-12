package main.java.event.handlers.base;

import main.java.event.events.base.IEvent;

/**
 * Created by harrisonturton on 6/7/17.
 */
public interface IEventHandler<T> {

    void execute(IEvent event);
}