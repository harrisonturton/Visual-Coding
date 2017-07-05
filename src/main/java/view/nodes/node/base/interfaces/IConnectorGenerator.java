package main.java.view.nodes.node.base.interfaces;

import main.java.view.nodes.connector.base.ConnectorTooltip;

import java.util.List;

/**
 * Created by harrisonturton on 4/7/17.
 */
public interface IConnectorGenerator {

    /**
     * Number of Connectors in a given SampleNode.
     */
    int getNumber ();

    /**
     * List of Connector names & descriptions.
     */
    List<ConnectorTooltip> getTooltips ();
}
