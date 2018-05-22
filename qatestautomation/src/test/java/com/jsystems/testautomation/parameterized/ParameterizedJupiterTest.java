package com.jsystems.testautomation.parameterized;

import com.jsystems.testautomation.ConfigJupiter;
import com.jsystems.testautomation.GamePlay;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.assertThrows;

@DisplayName("Parametrized test with JUnit 5")
public class ParameterizedJupiterTest extends ConfigJupiter {

    @Tag("all")
    @ParameterizedTest
    @CsvSource({"Hello, 5", "HelloJUnit 5, 15", "'Hello, Junit 5!', 25"})
    public void parameterizedFirstTest(String param1, int param2) {
        assertTrue(param1.contains("Hello"));
        assertTrue(param2 % 5 == 0);

    }

    @Tag("all")
    @DisplayName("Check if it contains Hello for String param")
    @ParameterizedTest
    @CsvSource(delimiter = ',', value = {"Hello", "FisrtHello", "Hello World"})
    public void parameterizedFisrtTestOneParam(String param) {
        assertTrue(param.contains("Hello"));
    }

    @Tag("all")
    @DisplayName("Check if it contains Hello for integer param")
    @ParameterizedTest
    @CsvSource(delimiter = ',', value = {"15", "25", "35"})
    public void parameterizedSecondTestOneParam(int param) {
        assertTrue(param % 5 == 0);
    }

    @Tag("param")
    @Tag("all")
    @Tag("csvFile")
    @DisplayName("Check if file contains params")
    @ParameterizedTest
    @CsvFileSource(resources = "/plik.csv", delimiter = ',')
    public void parameterizedNextTestCsvFile(String name, Integer age) {
        assertTrue(name.contains("Hello"));
        assertTrue(age % 5 == 0);
        assertTrue(age instanceof Integer);
    }

    @Tag("all")
    @DisplayName("Check if file contains string")
    @ParameterizedTest
    @ValueSource(strings = {"Hello", "Hello Junit"})
    public void parameterizedNextTestValueSource(String name) {
        assertTrue(name.contains("Hello"));
        assertTrue(name instanceof String);
    }

    @Tag("all")
    @DisplayName("Check if file contains ints")
    @ParameterizedTest
    @ValueSource(ints = {5, 15, 25})
    public void parameterizedNextTestValueSource(int age) {
        assertTrue(age % 5 == 0);
    }

    GamePlay gamePlay = new GamePlay();

    @Tag("all")
    @Test
    @DisplayName("Test for checking if exception was throws")
    public void exceptionTest() {
        assertThrows(IllegalArgumentException.class,
                () -> {
                    gamePlay.play(0);
                }
        );
    }
}