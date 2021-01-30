package com.bridge.driver.enums;

import lombok.Getter;

@Getter
public enum ConnectionParameters {
    USER("user"),
    PASSWORD("password");

    private final String value;

    ConnectionParameters(String value) {
        this.value = value;
    }
}
