package io.zipcoder.microlabs.mastering_loops;

public class StringMethods {

    public static String padLeft(String cellToFormat, int spacesToPad){
        return String.format("%1$" + spacesToPad + "s", cellToFormat);
    }

    public static String padRight(String cellToFormat, int spacesToPad) {
        return padLeft(cellToFormat, -spacesToPad);
    }

}
