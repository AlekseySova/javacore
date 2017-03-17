package main.java.com.alekseysova.app.homework.lesson3;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by pc on 3/16/2017.
 */
public class HWMathFuncTest {
    //Testing (the value of the first argument raised to the power
    // of the second argument).
    @Test
    public void powTest(){
        int a = 2;
        int b = 3;
        double actualResult = Math.pow(a,b);
        double expectedResult = 8.0d;
        double powDelta = 0.1d;
        Assert.assertEquals(expectedResult,actualResult,powDelta);
    }
    //Testing (Returns the smaller of two int values).
    @Test
    public void minTest(){
        int a = 5;
        int b = 4;
        int actualResult = Math.min(a,b);
        int expectedResult = 4;
        Assert.assertEquals(expectedResult,actualResult);
    }
    //Testing (Returns the greater of two int values).
    @Test
    public void maxTest(){
        int a = 10;
        int b = 7;
        int actualResult = Math.max(a,b);
        int expectedResult = 10;
        Assert.assertEquals(expectedResult,actualResult);
    }
    //Testing (Compare two string).
    @Test
    public void stringCompareTest(){
        String string1 = "Ok";
        String string2 = "Ok";

        HWMathFunc HWMathFunc = new HWMathFunc();
        boolean actualResult = HWMathFunc.stringCompare(string1,string2);
        boolean expectedResult = true;
        Assert.assertEquals(expectedResult,actualResult);
    }
    //Testing (Compare lenth of two strings).
    @Test
    public void stringLenth() {
        String string1 = "OK";
        String string2 = "On";

        HWMathFunc HWMathFunc = new HWMathFunc();
        boolean actualResult = HWMathFunc.stringLenth(string1,string2);
        boolean expectedResult = true;
        Assert.assertEquals(expectedResult,actualResult);
    }
    @Test
    // Testing (Return rendom walue for 0 to 1).
    public void rendomTest(){
        int a = 0;
        int b = 1;
        double random1 = Math.random();
        boolean expectedResult = true;
        boolean actualResult = false;
        if ((random1 >= a) && (random1 <= b)){
            actualResult = true;
        }
        Assert.assertEquals(expectedResult,actualResult);
    }
    // Testing (Return double value closest to integer).
    @Test
    public void rintTest(){
        double a = 1.2d;
        double actualResult = Math.rint(a);
        double expectedResult = 1;
        double deltaDouble = 0;
        Assert.assertEquals(expectedResult,actualResult, deltaDouble);

    }
    // Testing (Returns the signum function of the argument; zero if the argument is zero, 1.0
    // if the argument is greater than zero,
    // -1.0 if the argument is less than zero).
    @Test
    public void signumTest(){
        float a = 0.5f;
        float actualResult = Math.signum(a);
        float deltaFloat = 0f;
        float expectedResult = 1f;
        Assert.assertEquals(expectedResult,actualResult,deltaFloat);
    }
    // Testing (Returns the absolute value of an int value).
    @Test
    public void absTest(){
        int a = -2;

        int actualResult = Math.abs(a);
        int expectedResult = 2;
        Assert.assertEquals(expectedResult, actualResult);
    }
    // Testing (Returns the closest long to the argument,
    // with ties rounding to positive infinity).
    @Test
    public void roundFloatTest(){
        float float1 = 2.1f;

        long actualResult = Math.round(float1);
        long expectedResult = 2;
        Assert.assertEquals(expectedResult, actualResult);
    }
    // Testing(Returns the largest (closest to positive infinity) double value
    // that is less than or equal to the argument
    // and is equal to a mathematical integer).
    @Test
    public void floorTest(){
        double double1 = 1.9;

        double actualResult = Math.floor( double1);
        double expectedResult = 1;
        double deltaDouble = 0;

        Assert.assertEquals(expectedResult, actualResult, deltaDouble);

    }
    // Testing (Compare to float arguments).
    @Test
    public void floatCompareTest(){
        float float1 = 2.2f;
        float float2 = 2.2f;

        boolean actualResult = float1 == float2;
        boolean expectedResult = true;

        Assert.assertEquals(expectedResult, actualResult);

    }
    // Testing (Returns sqrt(x2 +y2) without
    // intermediate overflow or underflow).
    @Test
    public void hypotTest(){
        double a = 4d;
        double b = 4d;
        double doubleDelta = 0.01d;

        double actualResult = Math.hypot(a,b);
        double expectedResult = 5.65d;

        Assert.assertEquals(expectedResult, actualResult, doubleDelta);
    }
    // Testing (Returns the natural logarithm (base e) of a double value).
    @Test
    public void logTest(){
        double a = 8.1d;
        double doubleDelta = 0.01d;

        double actualResult = Math.log(a);
        double expectedResult = 2.09d;

        Assert.assertEquals(expectedResult, actualResult, doubleDelta);
    }
    // Testing (Returns the trigonometric cosine of an angle).
    @Test
    public void cosTest(){
        double a = 1d;
        double doubleDelta = 0.01d;

        double actualResult = Math.cos(a);
        double expectedResult = 0.54d;

        Assert.assertEquals(expectedResult, actualResult, doubleDelta);


    }
    // Testing (Converts an angle measured
    // in degrees to an approximately equivalent angle
    // measured in radians).
    @Test
    public void toRedianTest() {
        double a = 6d;
        double doubleDelta = 0.01d;

        double actualResult = Math.toRadians(a);
        double expectedResult = 0.10d;

        Assert.assertEquals(expectedResult, actualResult, doubleDelta);
    }
    // Testing (Returns the correctly rounded positive square root
    // of a double value).
    @Test
    public void sqrtTest(){
        double a = 49d;
        double doubleDelta = 0d;

        double actualResult = Math.sqrt(a);
        double expectedResult = 7d;

        Assert.assertEquals(expectedResult, actualResult, doubleDelta);

    }
    // Testing (Returns the unbiased exponent used
    // in the representation of a double).
    @Test
    public void getExponent(){
        float float1 = 4.7f;
        float floatDelta = 0.01f;

        float actualResult = Math.getExponent(float1);
        float expectedResult = 2.0f;

        Assert.assertEquals(expectedResult, actualResult, floatDelta);
    }
    // Testing (Returns the arc sine of a value).
    @Test
    public void asinTest(){
        double a = 0.9d;
        double doubleDelta = 0.01d;

        double actualResult = Math.asin(a);
        double expectedResult = 1.12d;

        Assert.assertEquals(expectedResult, actualResult, doubleDelta);

    }
    // Testing (Returns the hyperbolic tangent of a double value).
    @Test
    public void tanhTest(){
        double a = 0.4d;
        double doubleDelta = 0.01d;

        double actualResult = Math.tanh(a);
        double expectedResult = 0.37d;

        Assert.assertEquals(expectedResult, actualResult, doubleDelta);

    }
}
