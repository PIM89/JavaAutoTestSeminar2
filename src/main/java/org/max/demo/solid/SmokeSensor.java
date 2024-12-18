package org.max.demo.solid;

/**
 * Датчик дыма
 */
public class SmokeSensor implements ISensor {

    public boolean alarm;
    private int valueActual;
    private final int valueMax;
    public SmokeSensor(int valueMax, boolean alarm) {
        this.valueMax = valueMax;
        this.alarm = alarm;
    }

    @Override
    public void getSignal(int signal) {
        valueActual = signal;
        setAlarm(checkAlert(signal, valueMax), "дым");
    }

    @Override
    public void setAlarm(boolean alert, String value) {
        if (alert) {
            alarm = true;
            System.out.println("Обнаружено повышение показателя: " + value);
        }
    }

    @Override
    public Boolean isAlarm() {
        return alarm;
    }
}
