package org.max.demo.solid;

/**
 * Датчик температуры
 */
public class TemperatureSensor implements ISensor {

    private int valueActual;
    private final int valueMax;

    public TemperatureSensor(int valueMax) {
        this.valueMax = valueMax;
    }

    @Override
    public void getSignal(int signal) {
        this.valueActual = check(signal);
        setAlarm(checkAlert(signal, valueMax), "температура");
    }

    private int check(int signal) {
        return signal * 10;

    }

    @Override
    public void setAlarm(boolean alert, String value) {

    }

    @Override
    public Boolean isAlarm() {
        return checkAlert(valueActual, valueMax);
    }
}
