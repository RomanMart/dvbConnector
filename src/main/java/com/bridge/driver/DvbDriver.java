package com.bridge.driver;

import org.apache.log4j.LogManager;

import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.DriverPropertyInfo;
import java.sql.SQLException;
import java.sql.SQLFeatureNotSupportedException;
import java.util.Properties;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import java.util.logging.Logger;

import static com.bridge.driver.Constants.CONNECT_URL_PREFIX;

/**
 * Custom driver implementation
 */
public class DvbDriver implements Driver {

    private static final org.apache.log4j.Logger LOGGER = LogManager.getLogger(DvbDriver.class);

    static {
        new DvbDriver().register();
        LOGGER.info("Driver registered");
    }

    private void register() {
        try {
            DriverManager.registerDriver(this);
        } catch (SQLException e) {
            LOGGER.error("Error was faced while registering new JDBC driver: " + e.getClass() + " " + e.getMessage());
        }
    }

    @Override
    public Connection connect(String connectionUrl, Properties properties) throws SQLException {
        LOGGER.info("Start getting JDBC connection for url :" + connectionUrl);
        if (!acceptsURL(connectionUrl)) {
            LOGGER.error("Error was faced while getting  connection: ");
            return null;
        }
        try {
            DvbConnection dvbConnection = new DvbConnectionImpl(connectionUrl);
            LOGGER.info("Connection was registered");
            return dvbConnection;
        } catch (Exception e) {
            LOGGER.warn("Error occurs while getting connection: " + e.getClass() + " " + e.getMessage());
        }
        return null;
    }

    @Override
    public boolean acceptsURL(String url) throws SQLException {
        return url.startsWith(CONNECT_URL_PREFIX);
    }

    @Override
    public DriverPropertyInfo[] getPropertyInfo(String s, Properties properties) throws SQLException {
        return new DriverPropertyInfo[0];
    }

    @Override
    public int getMajorVersion() {
        return 0;
    }

    @Override
    public int getMinorVersion() {
        return 0;
    }

    @Override
    public boolean jdbcCompliant() {
        return false;
    }

    @Override
    public Logger getParentLogger() throws SQLFeatureNotSupportedException {
        return null;
    }
}
