package com.jsystems.testautomation;

import org.junit.FixMethodOrder;
import org.junit.jupiter.api.*;
import org.junit.runners.MethodSorters;

import java.math.BigDecimal;

import static org.hamcrest.CoreMatchers.containsString;
import static org.hamcrest.CoreMatchers.endsWith;
import static org.hamcrest.core.IsEqual.equalTo;
import static org.junit.Assert.assertFalse;

import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertSame;
import static org.junit.Assert.*;

@DisplayName("JUpiter Test class")
@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class JUpiterTest extends ConfigJunita {

    @BeforeEach
    public void beforeEach() {
        System.out.println("================= @BeforeEach =========");
    }

    @AfterEach
    public void afterEach() {
        System.out.println("================= @AfterEach =========");
    }

    @Nested
    @DisplayName("JUpiter nested Test class")
    public class JupiterNestedClass extends ConfigJunita {

        @Tag("all")
        @Test
        @DisplayName("A Test for checking string test")
        public void afirstNestedTest() {

            assertTrue(true == true);
            assertTrue(testowyStringa.equals("firstTest"));
            assertTrue("message from assertTrue", 5 == 2 + 3);
            assertFalse("message from assertTrue", 5 == 3 + 3);
            assertFalse("message from assertTrue", testowyStringa.equals("Adam"));
            assertEquals(testowyStringa, "firstTest");
            assertSame(testowyStringa, "firstTest");
            assertThat(testowyStringa, containsString("first"));
            assertThat(testowyStringa, equalTo("firstTest"));
            assertThat(testowyStringa, endsWith("Test"));

            System.out.println(0.2 * 0.2);
            assertFalse(0.2 * 0.2 == 0.04);
            assertTrue(new BigDecimal("0.2").multiply(new BigDecimal("0.2")).doubleValue() == 0.04);
        }
    }

    String testowyStringa = "firstTest";

    @Tag("all")
    @Test
    @DisplayName("B Test for checking string test")
    @RepeatedTest(6)
    public void cfirstTest() {

        assertTrue(true == true);
        assertTrue(testowyStringa.equals("firstTest"));
        assertTrue("message from assertTrue", 5 == 2 + 3);
        assertFalse("message from assertTrue", 5 == 3 + 3);
        assertFalse("message from assertTrue", testowyStringa.equals("Adam"));
        assertEquals(testowyStringa, "firstTest");
        assertSame(testowyStringa, "firstTest");
        assertThat(testowyStringa, containsString("first"));
        assertThat(testowyStringa, equalTo("firstTest"));
        assertThat(testowyStringa, endsWith("Test"));

        System.out.println(0.2 * 0.2);
        assertFalse(0.2 * 0.2 == 0.04);
        assertTrue(new BigDecimal("0.2").multiply(new BigDecimal("0.2")).doubleValue() == 0.04);
    }

    @Tag("Repeated")
    @Tag("all")
    @Test
    @DisplayName("C Test for checking string test")
    public void bfirstTest() {

        assertTrue(true == true);
        assertTrue(testowyStringa.equals("firstTest"));
        assertTrue("message from assertTrue", 5 == 2 + 3);
        assertFalse("message from assertTrue", 5 == 3 + 3);
        assertFalse("message from assertTrue", testowyStringa.equals("Adam"));
        assertEquals(testowyStringa, "firstTest");
        assertSame(testowyStringa, "firstTest");
        assertThat(testowyStringa, containsString("first"));
        assertThat(testowyStringa, equalTo("firstTest"));
        assertThat(testowyStringa, endsWith("Test"));

        System.out.println(0.2 * 0.2);
        assertFalse(0.2 * 0.2 == 0.04);
        assertTrue(new BigDecimal("0.2").multiply(new BigDecimal("0.2")).doubleValue() == 0.04);
    }
}