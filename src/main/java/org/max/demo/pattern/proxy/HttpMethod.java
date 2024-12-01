package org.max.demo.pattern.proxy;

/**
 * Вспомогательный Enum
 */
public enum HttpMethod {

    GET("get"),
    POST("post"),
    PUT("put"),
    DELETE("delete");

    private final String value;

    HttpMethod(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }
}
