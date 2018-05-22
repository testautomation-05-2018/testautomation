package com.jsystems.testautomation;

import org.hamcrest.collection.IsEmptyCollection;
import org.junit.*;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static com.jcabi.matchers.RegexMatchers.matchesPattern;
import static org.hamcrest.CoreMatchers.containsString;
import static org.hamcrest.CoreMatchers.endsWith;
import static org.hamcrest.CoreMatchers.hasItem;
import static org.hamcrest.Matchers.containsInAnyOrder;
import static org.hamcrest.Matchers.hasSize;
import static org.hamcrest.core.Is.is;
import static org.hamcrest.core.IsEqual.equalTo;
import static org.hamcrest.core.IsNot.not;
import static org.junit.Assert.*;

public class JunitTest extends ConfigJunita {

    @Before
    public void setUp(){
        System.out.println("================= @Before =========");

    }

    @After
    public void tearDown(){
        System.out.println("================= @After =========");

    }


    String testowyString = "firstTest";

    @Test
    public void firstTest() {


        assertTrue(true == true);
        assertTrue(testowyString.equals("firstTest"));
        assertTrue("message from assertTrue", 5 == 2 + 3);
        assertFalse("message from assertTrue", 5 == 3 + 3);
        assertFalse("message from assertTrue", testowyString.equals("Adam"));
        assertThat(testowyString, is("firstTest"));
        assertEquals(testowyString, "firstTest");
        assertSame(testowyString, "firstTest");
        assertThat(testowyString, containsString("first"));
        assertThat(testowyString, equalTo("firstTest"));
        assertThat(testowyString, endsWith("Test"));

        System.out.println(0.2 * 0.2);
        assertFalse(0.2 * 0.2 == 0.04);
        assertTrue(new BigDecimal("0.2").multiply(new BigDecimal("0.2")).doubleValue() == 0.04);
    }

    @Test
    public void arraysTest() {
        List<Integer> list1 = Arrays.asList(1, 2, 3, 4, 5);
        List<Integer> list1a = Arrays.asList(1, 2, 3, 4, 5);
        List<String> list2 = Arrays.asList("Ewa", "Adam", "Iwona", "Robert", "Tomek");
        List<String> list2a = Arrays.asList("Ewa", "Adam", "Iwona");
        List<String> list3 = new ArrayList<>();

        assertArrayEquals(list1.toArray(), list1a.toArray());
        assertThat(list2, hasSize(5));
        assertThat(list1, containsInAnyOrder(1, 2, 3, 4, 5));
        assertThat(list1, hasItem(1));
        assertThat(list2, not(IsEmptyCollection.empty()));
        assertThat(list3, IsEmptyCollection.empty());
        assertTrue(list2.containsAll(list2a));
        assertThat(list1.size(), is(5));
    }

    @Test
    public void jcabiTest() {
        assertThat(testowyString, matchesPattern("^first.*t$"));
        assertThat(testowyString, matchesPattern(".*tT.*"));
        assertThat("123456789", matchesPattern("^[0-9]+"));
    }

}
