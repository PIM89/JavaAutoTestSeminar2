package org.max.home;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;

public abstract class AbstractTest {
    @BeforeAll
    static void init() {
        System.out.println("init test run");
    }

    @AfterAll
    static void exit() {
        System.out.println("exit test run");
    }
}
