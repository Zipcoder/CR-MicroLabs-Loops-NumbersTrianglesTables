package io.zipcoder.microlabs.mastering_loops;

public class NumberUtilities {
    public static String getEvenNumbers(int start, int stop) {
        int i = 0;
        int j = start;
        StringBuilder builder = new StringBuilder();

        while(j < stop) {
            if(j % 2 == 0)
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


    public static String getOddNumbers(int start, int stop) {
        int i = 0;
        int j = start;
        StringBuilder builder = new StringBuilder();

        while(j < stop)
        {
            if(j % 2 != 0)
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

    public static String getSquareNumbers(int start, int stop) {
        int i = start;
        StringBuilder builder = new StringBuilder();

        while(i < stop)
        {
            builder.append(i * i);
            i++;
        }

        return builder.toString();
    }


    public static String getSquareNumbers(int start, int stop, int step) {
        int i = start;
        StringBuilder builder = new StringBuilder();

        while(i < stop)
        {
            builder.append(i * i);
            i += step;
        }

        return builder.toString();
    }

    public static String getRange(int stop) {
        int i = 0;
        StringBuilder builder = new StringBuilder();

        while(i < stop)
        {
            builder.append(i);
            i++;
        }

        return builder.toString();
    }

    public static String getRange(int start, int stop) {
        int i = start;
        StringBuilder builder = new StringBuilder();

        while(i < stop)
        {
            builder.append(i);
            i++;
        }

        return builder.toString();
    }


    public static String getRange(int start, int stop, int step) {
        int i = start;
        StringBuilder builder = new StringBuilder();

        while(i < stop)
        {
            builder.append(i);
            i+=step;
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
}

