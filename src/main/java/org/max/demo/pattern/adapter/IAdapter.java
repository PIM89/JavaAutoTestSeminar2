package org.max.demo.pattern.adapter;

import java.util.Date;

/**
 * Интерфейс адаптера
 */
public interface IAdapter {

    void open();

    Integer row();

    String find(String searchString);

    String author();

    Integer size();

    Date createDate();
}
