package org.max.demo.pattern.singleton;

/**
 * Enum
 */
public enum Connection {

    URL("http://"),
    PORT("8080"),
    CONNECT("true");

    private final String value;

    Connection(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }
}
