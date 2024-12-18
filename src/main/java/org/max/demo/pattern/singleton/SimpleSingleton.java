package org.max.demo.pattern.singleton;

/**
 * Простая инициализация
 */
public class SimpleSingleton {

    private static final SimpleSingleton INSTANCE = new SimpleSingleton("http://url", 8080, true);
    private String url;
    private final Integer port;
    private final Boolean connect;
    private SimpleSingleton(String url, Integer port, Boolean connect) {
        this.url = url;
        this.port = port;
        this.connect = connect;
    }

    public static SimpleSingleton getInstance() {
        return INSTANCE;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

}
