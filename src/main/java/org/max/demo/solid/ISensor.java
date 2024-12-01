package org.max.demo.solid;

/**
 * Интерфейс датчиков
 */
public interface ISensor {

    void getSignal(int signal);

    default boolean checkAlert(int value, int maxValue) {
        return value > maxValue;
    }

    void setAlarm(boolean alert, String value);

    Boolean isAlarm();
}
