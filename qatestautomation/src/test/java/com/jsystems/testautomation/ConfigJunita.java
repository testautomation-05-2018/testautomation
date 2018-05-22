package com.jsystems.testautomation;

import org.junit.AfterClass;
import org.junit.BeforeClass;

public class ConfigJunita {

    @BeforeClass
    public static void beforeClass() {
        System.out.println("================= @BeforeClass =========");
    }

    @AfterClass
    public static void afterClass() {
        System.out.println("================= @AfterClass =========");
    }
}
