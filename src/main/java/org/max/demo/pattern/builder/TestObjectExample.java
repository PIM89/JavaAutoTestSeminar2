package org.max.demo.pattern.builder;

import java.time.LocalDateTime;
import java.util.Random;

/**
 * Класс для демонстрации паттерна Строитель
 */
public class TestObjectExample {

    private final String stringAttr;
    private final Integer integerAttr;
    private final Double doubleAttr;
    private final Short shortAttr;
    private final Boolean booleanAttr;
    private final LocalDateTime localDateTimeAttr;
    private final Random randomAttr;

    public TestObjectExample(String stringAttr, Integer integerAttr, Double doubleAttr, Short shortAttr, Boolean booleanAttr, LocalDateTime localDateTimeAttr, Random randomAttr) {
        this.stringAttr = stringAttr;
        this.integerAttr = integerAttr;
        this.doubleAttr = doubleAttr;
        this.shortAttr = shortAttr;
        this.booleanAttr = booleanAttr;
        this.localDateTimeAttr = localDateTimeAttr;
        this.randomAttr = randomAttr;
    }

    public String getStringAttr() {
        return stringAttr;
    }

    public Integer getIntegerAttr() {
        return integerAttr;
    }

    public Double getDoubleAttr() {
        return doubleAttr;
    }

    public Short getShortAttr() {
        return shortAttr;
    }

    public Boolean getBooleanAttr() {
        return booleanAttr;
    }

    public LocalDateTime getLocalDateTimeAttr() {
        return localDateTimeAttr;
    }

    public Random getRandomAttr() {
        return randomAttr;
    }
}
