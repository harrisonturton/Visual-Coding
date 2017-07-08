package main.java.event.base.interfaces;

/**
 * Created by harrisonturton on 6/7/17.
 */
public interface IEventHandler<T> {

    void execute(IEvent event);
}