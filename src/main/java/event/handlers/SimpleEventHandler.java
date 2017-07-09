package main.java.event.handlers;

import main.java.event.events.IEvent;
import main.java.event.events.IEventHandler;

/**
 * Created by harrisonturton on 6/7/17.
 */
public class SimpleEventHandler implements IEventHandler {

    @Override
    public void execute(IEvent event) {
        System.out.println(event.getSource());
    }
}