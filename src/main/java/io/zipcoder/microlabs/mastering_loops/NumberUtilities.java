package io.zipcoder.microlabs.mastering_loops;

public class NumberUtilities {
    public static String getEvenNumbers(int start, int stop) {
        return getNumberSequence(start, stop, true);
    }

    public static String getOddNumbers(int start, int stop) {
        return getNumberSequence(start, stop, false);
    }

    public static String getSquareNumbers(int start, int stop) {
        return getSquareNumbers(start, stop, 1);
    }

    public static String getSquareNumbers(int start, int stop, int step) {
        return getExponentiations(start, stop, step, 2);
    }

    public static String getRange(int stop) {
        return getRange(0, stop, 1);
    }

    public static String getRange(int start, int stop) {
        return getRange(start, stop, 1);
    }

    public static String getRange(int start, int stop, int step) {
        int i = start;
        StringBuilder builder = new StringBuilder();

        while(i < stop)
        {
            builder.append(i);
            i += step;
        }

        return builder.toString();
    }

    public static String getExponentiations(int start, int stop, int step, int exponent) {
        int i = start;
        StringBuilder builder = new StringBuilder();

        while(i < stop)
        {
            builder.append((int)Math.pow(i, exponent));
            i += step;
        }

        return builder.toString();
    }

    private static String getNumberSequence(int start, int stop, boolean isEven) {
        int i = 0;
        int j = start;
        StringBuilder builder = new StringBuilder();

        while(j < stop)
        {
            if((isEven && j % 2 == 0) || (!isEven && j % 2 != 0))
            {
                builder.append(j);
                j+=2;
                i++;
            }
            else
            {
                j++;
            }
        }

        return builder.toString();
    }
}

