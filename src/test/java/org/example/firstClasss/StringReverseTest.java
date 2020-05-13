package org.example.firstClasss;

import junitparams.JUnitParamsRunner;
import junitparams.Parameters;

import org.junit.Test;
import org.junit.runner.RunWith;

import static org.junit.Assert.assertEquals;


@RunWith(JUnitParamsRunner.class)
public class StringReverseTest {

  private static final Object[] getReverse(){
        return new String[][]{
                {"olleH", "Hello"},
                {"yluJ", "July"},
                {"spuP", "Pups"}

        };
    }

    @Test
    @Parameters(method = "getReverse")
    public void reverse(String expected, String actual) {
        assertEquals(expected, StringReverse.reverse(actual));
    }
}