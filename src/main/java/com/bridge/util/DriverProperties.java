package com.bridge.util;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Class which holds connection properties. Not used for now
 */
@NoArgsConstructor
@AllArgsConstructor
@Data
public class DriverProperties {

    private String user;
    private String password;
    private String host;
    private int port;

}
