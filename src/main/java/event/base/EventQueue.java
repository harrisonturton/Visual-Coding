package main.java.event.base;

import main.java.event.base.interfaces.IEvent;
import main.java.event.base.interfaces.IEventHandler;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by harrisonturton on 6/7/17.
 */
public class EventQueue {

    private static Map<IEvent, Collection<IEventHandler>> eventBindings = new HashMap<>();

    private EventQueue() {
        // Force singleton
    }

    public static void execute(IEvent event) {
        Collection<IEventHandler> handlers = eventBindings.get(event);
        for (IEventHandler handler : handlers) {
            handler.execute(event);
        }
    }

    public static void registerHandler(IEvent event, IEventHandler handler) {
        if (eventBindings.get(event).contains(handler)) {
            throw new ArrayStoreException("EventHandler cannot be added, as it already exists.");
        }

        Collection<IEventHandler> handlers = eventBindings.get(event);
        handlers.add(handler);

        eventBindings.put(event, handlers);
    }

    public static void unregisterHandler(IEvent event, IEventHandler handler) {
        if (!eventBindings.get(event).contains(handler)) {
            throw new ArrayStoreException("EventHandler cannot be removed, as it doesn't exist.");
        }


        Collection<IEventHandler> handlers = eventBindings.get(event);
        handlers.remove(handler);

        eventBindings.put(event, handlers);
    }
}