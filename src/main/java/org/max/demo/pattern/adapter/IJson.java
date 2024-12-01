package org.max.demo.pattern.adapter;

import java.time.LocalDateTime;

/**
 * Интерфейс обработчика Json
 */
public interface IJson {

    void openResponse();

    Integer count();

    String findObject(String searchString);

    String getAuthor();

    Integer getSize();

    LocalDateTime getCreateDateTime();
}
