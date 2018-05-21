package com.jsystems.testautomation;

import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class JunitTest {



    @Test
    public void firstTest(){

        String testowyString = "firstTest";

        assertTrue(true == true);
        assertTrue(testowyString.equals("firstTest"));

    }

}
