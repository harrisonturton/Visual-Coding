package main.java.view.graph.connector.base.interfaces;

/**
 * Created by harrisonturton on 5/7/17.
 */
public interface IConnectorTooltip {

    /**
     * Name of this Connector. Short title that appears on hover.
     *
     * @return
     */
    String getName();

    /**
     * Short description. Short blurb that appears on hover.
     *
     * @return
     */
    String getDescription();
}
