package io.zipcoder.microlabs.mastering_loops;

public class FormatingMethods {
    public static String padLeft(String theDigit , int spaceToPad) {
        return String.format("%1$" + spaceToPad + "s", theDigit);
    }
    public static String padRight(String theDigit, int spaceToPad){
        return padLeft(theDigit , -spaceToPad);
    }
    public static String paddingLeftandRight(int paddingLeft, int padsTocell, String theDigit){
        return padRight(padLeft(theDigit, paddingLeft), padsTocell);
    }
}
