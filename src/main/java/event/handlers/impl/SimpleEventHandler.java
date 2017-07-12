package main.java.event.handlers.impl;

import main.java.event.events.base.IEvent;
import main.java.event.handlers.base.IEventHandler;

/**
 * Created by harrisonturton on 6/7/17.
 */
public class SimpleEventHandler implements IEventHandler {

    @Override
    public void execute(IEvent event) {
        System.out.println(event.getSource());
    }
}