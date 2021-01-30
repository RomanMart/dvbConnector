package com.bridge.grpc_client;

import com.bridge.util.DriverProperties;
import dvbinterface.Dvbinterface;
import dvbinterface.dataConnectionGrpc;
import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;

/**
 * implementation of {@link BridgeClient} interface
 */
public class BridgeClientImpl implements BridgeClient {

    private static final Logger LOGGER = LogManager.getLogger(BridgeClientImpl.class);

    private final DriverProperties driverProperties;

    private ManagedChannel channel;

    public BridgeClientImpl(DriverProperties driverProperties) {
        this.driverProperties = driverProperties;
    }

    /*
    for the firs implementation, there was no security implemented. Also BlockingStub is used for connection.
    I the future implementations it should be changed
     */
    @Override
    public String getConnection() {
        String connectionHost = driverProperties.getHost();
        int connectionPort = driverProperties.getPort();

        LOGGER.info("Start fetching connection info");
        channel = ManagedChannelBuilder.forAddress(connectionHost, connectionPort)
                .usePlaintext()
                .build();
        dataConnectionGrpc.dataConnectionBlockingStub client = dataConnectionGrpc
                .newBlockingStub(channel);

        Dvbinterface.getConnectionRequest request = Dvbinterface
                .getConnectionRequest
                .newBuilder()
                // for the first time we just set dummy url, as we have no real connection implementation on the server
                .setUrl(connectionHost)
                .build();

        LOGGER.info("Requesting remote server...");
        Dvbinterface.getConnectionResult result = client.getConnection(request);

        LOGGER.info("Response received: " + result.getMessage());

        return result.getMessage();
    }

    @Override
    public ManagedChannel getManageChannel() {
        return channel;
    }
}
