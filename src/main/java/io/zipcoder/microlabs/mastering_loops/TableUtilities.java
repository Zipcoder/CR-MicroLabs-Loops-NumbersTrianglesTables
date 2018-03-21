package io.zipcoder.microlabs.mastering_loops;

public class TableUtilities {
    public static String getSmallMultiplicationTable() {
        return getMultiplicationTable(4);
    }

    public static String getLargeMultiplicationTable() {
        return getMultiplicationTable(9);
    }

    public static String getMultiplicationTable(int tableSize) {
        int rowNumber = 1;
        int columnNumber = 1;
        StringBuilder builder = new StringBuilder();

        while (rowNumber <= tableSize)
        {
            while (columnNumber <= tableSize)
            {
                int product = rowNumber * columnNumber;
                if (product < 10)
                {
                    builder.append("  " + product + " |");
                }
                else if(product < 100)
                {
                    builder.append(" " + product + " |");
                }
                else {
                    builder.append(product + " |");
                }
                columnNumber++;
            }
            columnNumber = 1;
            rowNumber++;
            builder.append('\n');
        }
        return builder.toString();
    }
}
