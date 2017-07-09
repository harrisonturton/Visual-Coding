package main.java.view.graph.connector.base;

import main.java.view.graph.connector.base.interfaces.IConnectorGenerator;

import java.util.List;

/**
 * Passed to ANodeController, used to represent view data of all Connectors in a node.
 * <p>
 * Created by harrisonturton on 4/7/17.
 */
public class ConnectorGenerator implements IConnectorGenerator {

    private final int number;
    private final List<ConnectorTooltip> tooltips;

    public ConnectorGenerator(int number, List<ConnectorTooltip> tooltips) {
        this.number = number;
        this.tooltips = tooltips;
    }

    public final int getNumber() {
        return this.number;
    }

    public final List<ConnectorTooltip> getTooltips() {
        return this.tooltips;
    }
}