package com.bridge.driver;

import com.bridge.driver.exception.DriverConnectionException;
import com.bridge.grpc_client.BridgeClient;
import com.bridge.grpc_client.BridgeClientImpl;
import com.bridge.util.DriverProperties;
import com.bridge.util.UrlParser;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.junit.platform.commons.util.StringUtils;

import java.net.URISyntaxException;
import java.sql.Array;
import java.sql.Blob;
import java.sql.CallableStatement;
import java.sql.Clob;
import java.sql.DatabaseMetaData;
import java.sql.NClob;
import java.sql.PreparedStatement;
import java.sql.SQLClientInfoException;
import java.sql.SQLException;
import java.sql.SQLWarning;
import java.sql.SQLXML;
import java.sql.Savepoint;
import java.sql.Statement;
import java.sql.Struct;
import java.util.Map;
import java.util.Properties;
import java.util.concurrent.Executor;

/**
 * Implementation of connection
 */
public class DvbConnectionImpl implements DvbConnection {

    private static final Logger LOGGER = LogManager.getLogger(DvbConnectionImpl.class);

    private final String url;

    private final BridgeClient bridgeClient;

    private boolean closed = false;

    public DvbConnectionImpl(String url) {
        this.url = url;
        DriverProperties properties;
        try {
            properties = UrlParser.parseUrl(url);
        } catch (URISyntaxException e) {
            throw new IllegalArgumentException(e);
        }
        bridgeClient = new BridgeClientImpl(properties);
        LOGGER.info("Creating new connection to " + url);
        try {
            String response = bridgeClient.getConnection();
            // lets assume for now that server should respond with "Connection success" string
            if (StringUtils.isBlank(response)) {
                throw new IllegalStateException("Cannot initialize connection. Server respond with null");
            }
        } catch (Exception e) {
            //in the future, here we can involve retry logic depends on error which is received
            throw new IllegalStateException("Cannot initialize connection with remote server", e);
        }
    }

    public BridgeClient getBridgeClient() {
        return bridgeClient;
    }

    @Override
    public Statement createStatement() throws SQLException {
        return null;
    }

    @Override
    public PreparedStatement prepareStatement(String s) throws SQLException {
        return null;
    }

    @Override
    public CallableStatement prepareCall(String s) throws SQLException {
        return null;
    }

    @Override
    public String nativeSQL(String s) throws SQLException {
        return null;
    }

    @Override
    public boolean getAutoCommit() throws SQLException {
        return false;
    }

    @Override
    public void setAutoCommit(boolean b) throws SQLException {

    }

    @Override
    public void commit() throws SQLException {

    }

    @Override
    public void rollback() throws SQLException {

    }

    @Override
    public void close() throws SQLException {
        try {
            bridgeClient.getManageChannel().shutdown();
            closed = true;
        } catch (Exception e) {
            LOGGER.warn("Exception while shutting down managed channel");
            throw new DriverConnectionException("Exception while shutting down managed channel", e);
        }
    }

    @Override
    public boolean isClosed() throws SQLException {
        return closed;
    }

    @Override
    public DatabaseMetaData getMetaData() throws SQLException {
        return null;
    }

    @Override
    public boolean isReadOnly() throws SQLException {
        return false;
    }

    @Override
    public void setReadOnly(boolean b) throws SQLException {

    }

    @Override
    public String getCatalog() throws SQLException {
        return null;
    }

    @Override
    public void setCatalog(String s) throws SQLException {

    }

    @Override
    public int getTransactionIsolation() throws SQLException {
        return 0;
    }

    @Override
    public void setTransactionIsolation(int i) throws SQLException {

    }

    @Override
    public SQLWarning getWarnings() throws SQLException {
        return null;
    }

    @Override
    public void clearWarnings() throws SQLException {

    }

    @Override
    public Statement createStatement(int i, int i1) throws SQLException {
        return null;
    }

    @Override
    public PreparedStatement prepareStatement(String s, int i, int i1) throws SQLException {
        return null;
    }

    @Override
    public CallableStatement prepareCall(String s, int i, int i1) throws SQLException {
        return null;
    }

    @Override
    public Map<String, Class<?>> getTypeMap() throws SQLException {
        return null;
    }

    @Override
    public void setTypeMap(Map<String, Class<?>> map) throws SQLException {

    }

    @Override
    public int getHoldability() throws SQLException {
        return 0;
    }

    @Override
    public void setHoldability(int i) throws SQLException {

    }

    @Override
    public Savepoint setSavepoint() throws SQLException {
        return null;
    }

    @Override
    public Savepoint setSavepoint(String s) throws SQLException {
        return null;
    }

    @Override
    public void rollback(Savepoint savepoint) throws SQLException {

    }

    @Override
    public void releaseSavepoint(Savepoint savepoint) throws SQLException {

    }

    @Override
    public Statement createStatement(int i, int i1, int i2) throws SQLException {
        return null;
    }

    @Override
    public PreparedStatement prepareStatement(String s, int i, int i1, int i2) throws SQLException {
        return null;
    }

    @Override
    public CallableStatement prepareCall(String s, int i, int i1, int i2) throws SQLException {
        return null;
    }

    @Override
    public PreparedStatement prepareStatement(String s, int i) throws SQLException {
        return null;
    }

    @Override
    public PreparedStatement prepareStatement(String s, int[] ints) throws SQLException {
        return null;
    }

    @Override
    public PreparedStatement prepareStatement(String s, String[] strings) throws SQLException {
        return null;
    }

    @Override
    public Clob createClob() throws SQLException {
        return null;
    }

    @Override
    public Blob createBlob() throws SQLException {
        return null;
    }

    @Override
    public NClob createNClob() throws SQLException {
        return null;
    }

    @Override
    public SQLXML createSQLXML() throws SQLException {
        return null;
    }

    @Override
    public boolean isValid(int i) throws SQLException {
        return false;
    }

    @Override
    public void setClientInfo(String s, String s1) throws SQLClientInfoException {

    }

    @Override
    public String getClientInfo(String s) throws SQLException {
        return null;
    }

    @Override
    public Properties getClientInfo() throws SQLException {
        return null;
    }

    @Override
    public void setClientInfo(Properties properties) throws SQLClientInfoException {

    }

    @Override
    public Array createArrayOf(String s, Object[] objects) throws SQLException {
        return null;
    }

    @Override
    public Struct createStruct(String s, Object[] objects) throws SQLException {
        return null;
    }

    @Override
    public String getSchema() throws SQLException {
        return null;
    }

    @Override
    public void setSchema(String s) throws SQLException {

    }

    @Override
    public void abort(Executor executor) throws SQLException {
        close();
    }

    @Override
    public void setNetworkTimeout(Executor executor, int i) throws SQLException {

    }

    @Override
    public int getNetworkTimeout() throws SQLException {
        return 0;
    }

    @Override
    public <T> T unwrap(Class<T> aClass) throws SQLException {
        return null;
    }

    @Override
    public boolean isWrapperFor(Class<?> aClass) throws SQLException {
        return false;
    }
}
