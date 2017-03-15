package main.java.com.alekseysova.app.classwork.lesson3;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by pc on 3/15/2017.
 */
public class MathFuncTest {
    @Test
    public void multiplyTest(){
        int a = 1;
        int b = 2;
        MathFunc mathFunc = new MathFunc();
        int actualResult = mathFunc.multyply(a,b);
        int expectedResult = 2;
        Assert.assertEquals(expectedResult, actualResult );
    }
    @Test
    public void sumTest(){
        int a = 1;
        int b = 1;
        MathFunc mathFunc = new MathFunc();
        int actualResult = mathFunc.sum(a,b);
        int expectedResult = 2;
        Assert.assertEquals(expectedResult,actualResult);
    }
}