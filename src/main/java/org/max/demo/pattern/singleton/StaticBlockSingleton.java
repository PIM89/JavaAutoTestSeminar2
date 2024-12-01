package org.max.demo.pattern.singleton;

/**
 * Метод инициализации статического блока
 */
public class StaticBlockSingleton {

    private static final StaticBlockSingleton INSTANCE;

    static {
        try {
            INSTANCE = new StaticBlockSingleton();
        } catch (Exception e) {
            throw new RuntimeException("bad creating a Singleton Class");
        }
    }

    private String url;
    private Integer port;
    private Boolean connect;

    private StaticBlockSingleton() {
    }

    public static StaticBlockSingleton getInstance() {
        return INSTANCE;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }
}
