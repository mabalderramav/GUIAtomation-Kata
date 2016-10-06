package org.fundacionjala.kata;

import java.util.Arrays;
import java.util.OptionalInt;

/**
 * This Class about Kata.
 */
final class Kata {

    private static final String BLANK = " ";

    /**
     * Private constructor.
     */
    private Kata() {
    }

    /**
     * Calculate high and low.
     *
     * @param text text a calculate.
     * @return text with mayor and minor number.
     */
    static String calculateHighAndLow(final String text) {
        final String[] arrayNumber = text.split(BLANK);
        final OptionalInt optionalIntHigh = Arrays.stream(arrayNumber).mapToInt(Integer::parseInt).max();
        final OptionalInt optionalIntLow = Arrays.stream(arrayNumber).mapToInt(Integer::parseInt).min();
        int high = 0;
        int low = 0;
        if (optionalIntHigh.isPresent() && optionalIntLow.isPresent()) {
            high = optionalIntHigh.getAsInt();
            low = optionalIntLow.getAsInt();
        }
        return String.format("%s %s", high, low);
    }
}
