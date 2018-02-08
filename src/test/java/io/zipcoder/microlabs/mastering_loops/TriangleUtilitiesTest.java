package io.zipcoder.microlabs.mastering_loops;


import org.junit.Assert;
import org.junit.Test;

public class TriangleUtilitiesTest {

    @Test
    public void getRow() {
        String expected = "********************";
        int width = 20;
        String actual = TriangleUtilities.getRow(width);
        Assert.assertEquals(expected, actual);
    }


    @Test
    public void getTriangleTest1() {
        String expected =
                "*\n" +
                        "**\n" +
                        "***\n" +
                        "****\n" +
                        "*****\n" +
                        "******\n" +
                        "*******\n" +
                        "********\n" +
                        "*********\n";
        String actual = TriangleUtilities.getTriangle(9); //input 9, get a 9 x 9, actually expect a 9x9
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void getTriangleTest2() {
        String expected =
                "*\n" +
                        "**\n" +
                        "***\n" +
                        "****\n";
        String actual = TriangleUtilities.getTriangle(4); // see above..
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testGetLargeTriangle() {
        String expected =
                "*\n" +
                "**\n" +
                "***\n" +
                "****\n" +
                "*****\n" +
                "******\n" +
                "*******\n" +
                "********\n" +
                "*********\n" +
                "**********\n";
        String actual = TriangleUtilities.getLargeTriangle();
        Assert.assertEquals(expected, actual);
    }


    @Test
    public void testGetSmallTriangle() {
        String expected =
                        "*\n" +
                        "**\n" +
                        "***\n" +
                        "****\n";
        String actual = TriangleUtilities.getSmallTriangle();
        Assert.assertEquals(expected, actual);
    }
}
