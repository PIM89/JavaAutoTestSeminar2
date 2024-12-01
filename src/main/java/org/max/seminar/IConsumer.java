package org.max.seminar;

/**
 * Интерфейс потребителя
 */
public interface IConsumer {

    //Передача сообщения
    Status sendMessage(String str);

    //Проверка доступности линии
    boolean isLineFree();
}
