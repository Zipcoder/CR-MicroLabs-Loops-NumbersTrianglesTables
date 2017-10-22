package io.zipcoder.microlabs.mastering_loops;

public class StringMethods {

    public static String padLeft(String stringToPadLeft, int spacesToPad, int digitsInMaxCell){
        if (spacesToPad >= digitsInMaxCell) {
            return String.format("%1$" + spacesToPad + "s", stringToPadLeft);
        } else {
            return null;
        }
    }

    public static String padRight(String stringToPadRight, int spacesToPad) {
        for (int i = 1; i <= spacesToPad; i++) {
            stringToPadRight +=  " ";
        }
        return stringToPadRight;
    }

}
