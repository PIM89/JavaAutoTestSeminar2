package org.max.seminar;

/**
 * Интерфейс поставщика
 */
public interface IProducer {

    boolean subscription(IConsumer consumer);

    boolean cancel(IConsumer consumer);
}
