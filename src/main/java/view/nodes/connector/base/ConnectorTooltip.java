package main.java.view.nodes.connector.base;

import main.java.view.nodes.connector.base.interfaces.IConnectorTooltip;

/**
 * Created by harrisonturton on 4/7/17.
 */
public class ConnectorTooltip implements IConnectorTooltip {

    private final String name;
    private final String description;

    public ConnectorTooltip(String name, String description) {
        this.name = name;
        this.description = description;
    }

    @Override
    public final String getName() {
        return this.name;
    }

    @Override
    public final String getDescription() {
        return this.description;
    }
}
