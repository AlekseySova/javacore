package main.java.com.alekseysova.app.homework.lesson9;

import junitparams.FileParameters;
import junitparams.JUnitParamsRunner;
import junitparams.mappers.CsvWithHeaderMapper;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;

/**
 * Created by AlekseySova on 4/10/2017.
 */
@RunWith(JUnitParamsRunner.class)
public class Lesson9HWTest {
    HomeTask2 homeWork = new HomeTask2();
    @Test
    @FileParameters(value = "src/test/resources/palindrome.csv",
            mapper = CsvWithHeaderMapper.class)
    public void method1Test(String palindrome, String resString){
        Assert.assertEquals(resString, homeWork.homeTask2Method(1,palindrome));
    }
    @Test
    @FileParameters(value = "src/test/resources/palindrome.csv",
            mapper = CsvWithHeaderMapper.class)
    public void method2Test(String palindrome, String resString){
        Assert.assertEquals(resString, homeWork.homeTask2Method(2,palindrome));
    }
    @Test
    @FileParameters(value = "src/test/resources/palindrome.csv",
            mapper = CsvWithHeaderMapper.class)
    public void method3Test(String palindrome, String resString){
        Assert.assertEquals(resString, homeWork.homeTask2Method(3,palindrome));
    }
    @Test
    @FileParameters(value = "src/test/resources/palindrome.csv",
            mapper = CsvWithHeaderMapper.class)
    public void method4Test(String palindrome, String resString){
        Assert.assertEquals(resString, homeWork.homeTask2Method(4,palindrome));
    }
    @Test
    @FileParameters(value = "src/test/resources/palindrome.csv",
            mapper = CsvWithHeaderMapper.class)
    public void method5Test(String palindrome, String resString){
        Assert.assertEquals(resString, homeWork.homeTask2Method(5,palindrome));
    }
}
