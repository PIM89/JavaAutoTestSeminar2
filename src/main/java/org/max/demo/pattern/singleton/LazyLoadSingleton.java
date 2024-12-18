package org.max.demo.pattern.singleton;

/**
 * Метод отложенной загрузки
 */
public class LazyLoadSingleton {

    private String url;
    private Integer port;
    private Boolean connect;

    private LazyLoadSingleton() {
    }

    public static LazyLoadSingleton getInstance() {
        return SingletonClassHolder.INSTANCE;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    private static class SingletonClassHolder {
        static final LazyLoadSingleton INSTANCE = new LazyLoadSingleton();
    }

}
