package io.zipcoder.microlabs.mastering_loops;

public class FormatingMethods {
    public static String padLeft(String theDigit , int spaceToPad) {
        return String.format("%1$" + spaceToPad + "s ", theDigit);
                                //   !!!! temporary fix !!!!
    }
    public static String padRight(String theDigit, int spaceToPad){
        //for(int i = 1; i <= spaceToPad ; i++){
          //  theDigit += " ";
        //}
        return padLeft(theDigit , -spaceToPad);
    }

}
