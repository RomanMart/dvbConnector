package com.bridge.driver.exception;

import java.sql.SQLException;

/**
 * General exception for connection errors
 */
public class DriverConnectionException extends SQLException {

    public DriverConnectionException(String message, Throwable cause) {
        super(message, cause);
    }

}
