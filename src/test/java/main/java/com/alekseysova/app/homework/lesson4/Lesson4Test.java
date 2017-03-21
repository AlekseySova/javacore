package main.java.com.alekseysova.app.homework.lesson4;

import main.java.com.alekseysova.app.classwork.lesson4.BiggerNumber;
import main.java.com.alekseysova.app.classwork.lesson4.CircleArea;
import main.java.com.alekseysova.app.classwork.lesson4.EvenOrOdd;
import main.java.com.alekseysova.app.classwork.lesson4.RightAngeledTriangle;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;

/**
 * Created by AlekseySova on 3/20/2017.
 */
public class Lesson4Test {

    @Test
    public void rightAngeledTriangelTest(){
        double a = 5;
        double b = 5;
        double c = 7.075;
        double delta = 0.1d;

        boolean actualResult = RightAngeledTriangle.rigthAngleSide(a,b,c, delta);
        boolean expectedResult = true;
        Assert.assertEquals(expectedResult,actualResult);
    }

    @Test
    public void circleAreaTest(){
        double area1 = 34.1;
        double area2 = 33.5;

        String actualResult = CircleArea.calculateBigger(area1, area2);
        String expectedResult = "Result: Area1 is bigger";
        Assert.assertEquals(expectedResult, actualResult);
    }

    @Test
    public void biggerNumberTest(){
        double a = 7;
        double b = 5;

        int actualResult = BiggerNumber.calculateBigger(a,b);
        int expectedResult = 1;
        Assert.assertEquals(expectedResult,actualResult);
    }
    @Test
    public void evenOrOddTest() {
        int a = 4;

        boolean actualResult = EvenOrOdd.defineEvenOrOdd(a);
        boolean expectedResult = true;
        Assert.assertEquals(expectedResult,actualResult);
    }

}
