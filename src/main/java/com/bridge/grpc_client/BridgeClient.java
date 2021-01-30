package com.bridge.grpc_client;

import io.grpc.ManagedChannel;

/**
 * Client to hold jdbc_grpc bridge functionality
 */
public interface BridgeClient {

    /**
     * Method which connects to remote server via gRCP and fetch connectionInfo
     *
     * @return string with response
     */
    String getConnection();

    /**
     *
     * @return
     */
    ManagedChannel getManageChannel();

}
