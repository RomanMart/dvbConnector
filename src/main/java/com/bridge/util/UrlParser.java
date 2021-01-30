package com.bridge.util;

import java.net.URI;
import java.net.URISyntaxException;

public class UrlParser {

    public static final String JDBC_PREFIX = "jdbc:";

    public static final String CUSTOM_DRIVER_PREFIX = JDBC_PREFIX + "grpc:";

    public static DriverProperties parseUrl(String jdbcUrl) throws URISyntaxException {
        if (!jdbcUrl.startsWith(CUSTOM_DRIVER_PREFIX)) {
            throw new URISyntaxException("Provided connection URL does not match required prefix: ", "'"
                    + CUSTOM_DRIVER_PREFIX);
        }

        String stringWithoutPrefix = jdbcUrl.substring(JDBC_PREFIX.length());
        URI uri = new URI(stringWithoutPrefix);

        DriverProperties driverProperties = new DriverProperties();

        driverProperties.setHost(uri.getHost());
        int port = uri.getPort();
        if (port == -1) {
            throw new IllegalArgumentException("Port value is unsupported");
        }
        driverProperties.setPort(port);

        return driverProperties;
    }
}
