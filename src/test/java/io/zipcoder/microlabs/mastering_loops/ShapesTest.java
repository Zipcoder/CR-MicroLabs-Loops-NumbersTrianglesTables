package io.zipcoder.microlabs.mastering_loops;


import org.junit.Test;
import org.junit.Assert;

public class ShapesTest {



    @Test
    public void triangleTest(){
        //: Given
            Shapes shapes= new Shapes();
            String expected= "*\n**\n***\n****\n*****";
        //: When
            String actual= shapes.triangle();
        //: Then
            Assert.assertEquals("Sucess",expected,actual);
    }

    @Test
    public void tableSquaresTest(){
        //: Given
            Shapes shapes= new Shapes();

        String expected1=
                "| 1 |  2 |  3 |  4 |  5 |  6 |\n" +
                "| 2 |  4 |  6 |  8 | 10 | 12 |\n" +
                "| 3 |  6 |  9 | 12 | 15 | 18 |\n" +
                "| 4 |  8 | 12 | 16 | 20 | 24 |\n" +
                "| 5 | 10 | 15 | 20 | 25 | 30 |\n" +
                "| 6 | 12 | 18 | 24 | 30 | 36 |";
        //: When

            String actual1= shapes.tableSquares(6);

        //: Then
            //Assert.assertEquals("Sucess1",expected,actual);
            Assert.assertEquals("Sucess2",expected1,actual1);
    }
    @Test
    public void  tableSquareTest(){

        Shapes shapes= new Shapes();
        String expected=
                "| 1 | 2 |  3 |  4 |\n" +
                "| 2 | 4 |  6 |  8 |\n" +
                "| 3 | 6 |  9 | 12 |\n" +
                "| 4 | 8 | 12 | 16 |";
        String actual= shapes.tableSquare();
        Assert.assertEquals("Sucess",expected,actual);
    }
}
