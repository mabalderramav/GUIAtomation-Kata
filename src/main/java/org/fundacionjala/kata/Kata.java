package org.fundacionjala.kata;

/**
 * This Class about Kata.
 */
public final class Kata {

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
    public static String calculateHighAndLow(String text) {
        final String[] arrayNumber = text.split(" ");
        return String.valueOf(calculateMayorNumber(arrayNumber))
                + " "
                + String.valueOf(calculateMinorNumber(arrayNumber));
    }

    /**
     * This method calculate minor number.
     *
     * @param arrayNumber Array number a calculate.
     * @return Minor number of array text.
     */
    private static int calculateMinorNumber(String[] arrayNumber) {
        int minor = Integer.parseInt(arrayNumber[0]);
        for (String numberString : arrayNumber) {
            int number = Integer.parseInt(numberString);
            if (number < minor) {
                minor = number;
            }
        }
        return minor;
    }

    /**
     * This method calculate mayor number.
     * @param arrayNumber Array number a calculate.
     * @return Mayor number of array text.
     */
    private static int calculateMayorNumber(String[] arrayNumber) {
        int mayor = Integer.parseInt(arrayNumber[0]);
        for (String numberString : arrayNumber) {
            int number = Integer.parseInt(numberString);
            if (number > mayor) {
                mayor = number;
            }
        }
        return mayor;
    }
}
