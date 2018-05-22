package com.jsystems.testautomation;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;

public class ConfigJupiter {

    @BeforeAll
    public static void beforeClass() {
        System.out.println("================= @BeforeAll =========");
    }

    @AfterAll
    public static void afterClass() {
        System.out.println("================= @AfterAll =========");
    }
}
