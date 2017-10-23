package io.zipcoder.microlabs.mastering_loops;

public class StringMethods {

    public static String padLeft(String stringToPadLeft, int spacesToPad){
        return String.format("%1$" + spacesToPad + "s", stringToPadLeft);
    }

    public static String padRight(String stringToPadRight, int spacesToPad) {
        return padLeft(stringToPadRight, -spacesToPad);
    }

    public static String padLeftAndRight(String stringToPad, int spacesToPadLeft, int totalSpacesInString) {
        return padRight(padLeft(stringToPad, spacesToPadLeft), totalSpacesInString);
    }

}
