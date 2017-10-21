package io.zipcoder.microlabs.mastering_loops;

public class StringMethods {

    public static String padleft(int cellToFormat, int spacesToPad){
        return String.format("%1$" + spacesToPad + "s", cellToFormat);
    }

}
