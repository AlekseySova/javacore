package main.java.com.alekseysova.app.homework.lesson5;

import junitparams.FileParameters;
import junitparams.JUnitParamsRunner;
import junitparams.Parameters;
import junitparams.mappers.CsvWithHeaderMapper;
import main.java.com.alekseysova.app.homework.lesson3.HWMathFunc;
import main.java.com.alekseysova.app.homework.lesson4.BiggerNumber;
import main.java.com.alekseysova.app.homework.lesson4.CircleArea;
import main.java.com.alekseysova.app.homework.lesson4.EvenOrOdd;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;

/**
 * Created by AlekseySova on 3/23/2017.
 */
@RunWith(JUnitParamsRunner.class)
public class Lesson5HWTest {
    //testing (return absolute value of double value)
    @Test
    @FileParameters(value = "src/test/resources/abs.csv",
            mapper = CsvWithHeaderMapper.class)
    public void mathAbsTest(int a, int expOut) {
        Assert.assertEquals(expOut, Math.abs(a));
    }

    //testing (input to double value)
    // (return biggest of two value)
    @Test
    @FileParameters(value = "src/test/resources/bignumber.csv",
            mapper = CsvWithHeaderMapper.class)
    public void BiggerNumberTest(double a, double b, double delta, int expOut) {
        Assert.assertEquals(expOut, BiggerNumber.calculateBigger(a, b), delta);
    }

    //input radius value
    //return square value
    @Test
    @FileParameters(value = "src/test/resources/circleradius.csv",
            mapper = CsvWithHeaderMapper.class)
    public void circleRadiusTest(double a, double delta, double expOut) {
        Assert.assertEquals(expOut, CircleArea.calculateRadius(a), delta);
    }

    //return biggest value of two square
    @Test
    @FileParameters(value = "src/test/resources/calculatebigger.csv",
            mapper = CsvWithHeaderMapper.class)
    public void circleAreaTest(double areaA, double areaB, String expOut) {
        Assert.assertEquals(expOut, CircleArea.calculateBigger(areaA, areaB));
    }

    //return boolean value
    //if true then value is odd
    //if false then value is even
    @Test
    @FileParameters(value = "src/test/resources/evenorodd.csv",
            mapper = CsvWithHeaderMapper.class)
    public void evenofoddTest(int a, boolean expOut) {
        Assert.assertEquals(expOut, EvenOrOdd.defineEvenOrOdd(a));
    }

    //return double value a pow in b
    @Test
    @FileParameters(value = "src/test/resources/mathpow.csv",
            mapper = CsvWithHeaderMapper.class)
    public void powTest(double a, double b, double delta, double expOut) {
        Assert.assertEquals(expOut, Math.pow(a, b), delta);
    }

    //return lowest value
    @Test
    @FileParameters(value = "src/test/resources/min.csv",
            mapper = CsvWithHeaderMapper.class)
    public void minTest(int a, int b, int expOut) {
        Assert.assertEquals(expOut, Math.min(a, b));
    }

    //return highest value
    @Test
    @FileParameters(value = "src/test/resources/max.csv",
            mapper = CsvWithHeaderMapper.class)
    public void maxTest(int a, int b, int expOut) {
        Assert.assertEquals(expOut, Math.max(a, b));
    }

    //compare length of two string
    @Test
    @FileParameters(value = "src/test/resources/stringlenthcompare.csv",
            mapper = CsvWithHeaderMapper.class)
    public void lenthComper(String a, String b, boolean expOut) {
        Assert.assertEquals(expOut, HWMathFunc.stringLenth(a, b));
    }

    //return double value closest to integer
    @Test
    @FileParameters(value = "src/test/resources/rint.csv",
            mapper = CsvWithHeaderMapper.class)
    public void rIntTest(double a, double delta, int expOut) {
        Assert.assertEquals(expOut, Math.rint(a), delta);
    }

    //return the sign of value
    //if value zero then 0
    //if value is greater then zero then 0
    //if value is less then zero then -1
    @Test
    @FileParameters(value = "src/test/resources/signum.csv",
            mapper = CsvWithHeaderMapper.class)
    public void signumTest(double a, double delta, int expOut) {
        Assert.assertEquals(expOut, Math.signum(a), delta);
    }

    //return double value closest to integer
    @Test
    @FileParameters(value = "src/test/resources/floor.csv",
            mapper = CsvWithHeaderMapper.class)
    public void floorTest(double a, double delta, int expOut) {
        Assert.assertEquals(expOut, Math.floor(a), delta);
    }

    //Returns sqrt(x2 +y2)
    @Test
    @FileParameters(value = "src/test/resources/hypotTest.csv",
            mapper = CsvWithHeaderMapper.class)
    public void hypotTest(double a,double b,double delta, double expOut) {
        Assert.assertEquals(expOut, Math.hypot(a,b), delta);
    }

    //return natural logarithm
    @Test
    @FileParameters(value = "src/test/resources/log.csv",
            mapper = CsvWithHeaderMapper.class)
    public void logTest(double a,double delta, double expOut) {
        Assert.assertEquals(expOut, Math.log(a), delta);
    }

    //returns the closest int to the argument
    @Test
    @FileParameters(value = "src/test/resources/roundfloat.csv",
            mapper = CsvWithHeaderMapper.class)
    public void roundfloatTest(double a,double delta, int expOut){
        Assert.assertEquals(expOut,Math.round(a),delta);
    }

    //return sqrt of input
    @Test
    @FileParameters(value = "src/test/resources/sqrt.csv",
        mapper = CsvWithHeaderMapper.class)
    public void sqrtTest(double a , double delta, double expOut ) {
        Assert.assertEquals(expOut, Math.sqrt(a), delta);
    }

    //return cosine of angel
    @Test
    @FileParameters(value = "src/test/resources/cos.csv",
            mapper = CsvWithHeaderMapper.class)
    public void cosTest(double a, double delta, double expOut){
        Assert.assertEquals(expOut, Math.cos(a),delta);
    }

    //return Converts an angle measured in degrees to radians.
    @Test
    @FileParameters(value = "src/test/resources/toradian.csv",
            mapper = CsvWithHeaderMapper.class)
    public void toRadianTest(double a, double delta, double expOut){
        Assert.assertEquals(expOut, Math.toRadians(a),delta);
    }

    //return hyperbolic sine
    @Test
    @FileParameters(value = "src/test/resources/sinh.csv",
            mapper = CsvWithHeaderMapper.class)
    public void sinhTest(double a, double delta, double expOut){
        Assert.assertEquals(expOut, Math.sinh(a), delta);
    }

    //return arc tangent of a value
    @Test
    @FileParameters(value = "src/test/resources/arctan.csv",
            mapper = CsvWithHeaderMapper.class)
    public void atanTest(double a, double delta, double expOut){
        Assert.assertEquals(expOut, Math.atan(a), delta);
    }
}