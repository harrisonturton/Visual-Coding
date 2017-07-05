package main.java.view.nodes.connector.base.interfaces;

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

    /**
     * Used to access the specific Connector. Must be unique to each Node.
     *
     * @return
     */
    String getKey();
}
