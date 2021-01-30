package com.bridge.driver;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class DvbConnectionTest {

    private static final String TEST_URL = "jdbc:grpc://localhost:52150";

    @Test
    public void connectionTest() {
        DvbConnection dvbConnection = new DvbConnectionImpl(TEST_URL);
        Assertions.assertNotNull(dvbConnection);
    }
}
