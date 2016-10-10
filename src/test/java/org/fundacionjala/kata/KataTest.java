package org.fundacionjala.kata;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * This kata Test.
 */
public class KataTest {
    /**
     * this method calculate High And Low the option 1.
     */
    @Test
    public void calculateHighAndLow1() {
        final String text = "1 2 3 4 5";
        final String expected = "5 1";
        String result = Kata.calculateHighAndLow(text);
        assertEquals(expected, result);
    }

    /**
     * this method calculate High And Low the option 2.
     */
    @Test
    public void calculateHighAndLow2() {
        final String text = "1 2 -3 4 5";
        final String expected = "5 -3";
        String result = Kata.calculateHighAndLow(text);
        assertEquals(expected, result);


    }

    /**
     * this method calculate High And Low the option 1.
     */
    @Test
    public void calculateHighAndLow3() {
        final String text = "1 9 3 4 -5";
        final String expected = "9 -5";
        String result = Kata.calculateHighAndLow(text);
        assertEquals(expected, result);
    }

    /**
     * this method make complement DNA option 1.
     */
    @Test
    public void makeComplementDNA1() {
        final String text = "ATTGC";
        final String expected = "TAACG";
        String result = Kata.makeComplement(text);
        assertEquals(expected, result);
    }

    /**
     * this method make complement DNA option 1.
     */
    @Test
    public void makeComplementDNA2() {
        final String text = "GTAT";
        final String expected = "CATA";
        String result = Kata.makeComplement(text);
        assertEquals(expected, result);
    }
}
