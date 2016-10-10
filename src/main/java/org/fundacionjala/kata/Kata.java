package org.fundacionjala.kata;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.OptionalInt;

/**
 * This Class about Kata.
 */
final class Kata {

    private static final String BLANK = " ";
    private static final String A = "A";
    private static final String C = "C";
    private static final String T = "T";
    private static final String G = "G";
    private static final Map<String, String> MAP;
    static {
        MAP = new HashMap<>();
        MAP.put(A, "t");
        MAP.put(C, "g");
        MAP.put(T, "a");
        MAP.put(G, "c");
    }

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

    /**
     * this method replace letter for other letter.
     *
     * @param text String to replace.
     * @return New String with letters replaced.
     */
    static String makeComplement(final String text) {
        return text.replaceAll(A, MAP.get(A))
                .replaceAll(C, MAP.get(C))
                .replaceAll(T, MAP.get(T))
                .replaceAll(G, MAP.get(G))
                .toUpperCase();
    }
}
