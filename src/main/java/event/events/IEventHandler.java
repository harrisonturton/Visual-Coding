package main.java.event.events;

import main.java.event.events.IEvent;

/**
 * Created by harrisonturton on 6/7/17.
 */
public interface IEventHandler<T> {

    void execute(IEvent event);
}