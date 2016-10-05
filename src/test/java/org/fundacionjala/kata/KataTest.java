package org.fundacionjala.kata;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by AldoBalderrama on 10/4/2016.
 */
public class KataTest {
    @Test
    public void calculateHighAndLow1() {
        final String text = "1 2 3 4 5";
        final String expected = "5 1";
        String result = Kata.calculateHighAndLow(text);
        assertEquals(expected, result);
    }

    @Test
    public void calculateHighAndLow2() {
        final String text = "1 2 -3 4 5";
        final String expected = "5 -3";
        String result = Kata.calculateHighAndLow(text);
        assertEquals(expected, result);
    }

    @Test
    public void calculateHighAndLow3() {
        final String text = "1 9 3 4 -5";
        final String expected = "9 -5";
        String result = Kata.calculateHighAndLow(text);
        assertEquals(expected, result);
    }
}
