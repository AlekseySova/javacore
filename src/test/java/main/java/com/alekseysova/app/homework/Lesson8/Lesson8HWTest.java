package main.java.com.alekseysova.app.homework.Lesson8;

import main.java.com.alekseysova.app.homework.lesson8.ArrayPrint;
import main.java.com.alekseysova.app.homework.lesson8.Lesson8HW;
import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;

/**
 * Created by AlekseySova on 4/3/2017.
 */
public class Lesson8HWTest {
    Lesson8HW lesson8 = new Lesson8HW();
    ArrayPrint arrayP1 = new ArrayPrint();

    @Test
    /* Testing proper work of sorting method - must be
    * from lower to bigger value
    */
    public void bubleSort1Test(){
        int[] arrayLength = {23,56,2,78,29,32};

        int[] actualResult = lesson8.bubleSortUpMethod(arrayLength);

        int[] expectedResult = {2,23,29,32,56,78};

        Assert.assertArrayEquals(expectedResult, actualResult);
    }
    @Test
    /* Testing proper work of sorting method - must be
    * from bigger to lower value
    */
    public void bublesSort2Test(){
        int[] arrayLength = {45,90,25,12,78,33};

        int[] actualResult = lesson8.bubleSortDownMethod(arrayLength);

        int[] expectedResult = {90,78,45,33,25,12};

        Assert.assertArrayEquals(expectedResult,actualResult);
    }

    @Test
        /* Testing proper work of Arrays.sort method - must be
    * from lower to bigger value
    */
    public void arrraysSortTest(){
        int[] arraySort = {45,89,21,65,39,23,99,206};

        int[] actualResult = lesson8.selectionSortMethod(arraySort);

        int[] expectedResult = {21,23,39,45,65,89,99,206};

        Assert.assertArrayEquals(expectedResult, actualResult);
    }

    @Test
    /* Testing proper result of maximal
    * value of array*/
    public void multiDimentionMaxArrayTest(){
        int strokeArray = 5;
        int columnArray = 8;
        int minValue = -99;
        int maxValue = 99;

        int maxArrayValue = minValue;

        Object[] actualArray = lesson8.randomArrayFrom99To99(strokeArray, columnArray, minValue, maxValue );
        int[][] randArray = (int[][])actualArray[2];

        int actualResult = (int) actualArray[0];
        for(int i = 0; i < randArray.length; i++){
            for(int j = 0; j < randArray[i].length; j++){
                if(maxArrayValue < randArray[i][j]){
                    maxArrayValue = randArray[i][j];
                }
            }
        }
        int expectedResult = maxArrayValue;

        Assert.assertEquals(expectedResult,actualResult);
    }

    @Test
    /* Testing proper result of minimal
    * value of array*/
    public void multiDimentionMinArrayTest(){
        int strokeArray = 5;
        int columnArray = 8;
        int minValue = -99;
        int maxValue = 99;
        int minArrayValue = maxValue;

        Object[] actualArray = lesson8.randomArrayFrom99To99(strokeArray, columnArray, minValue, maxValue);
        int[][] randArray = (int[][]) actualArray[2];

        int actualResult = (int)actualArray[1];
        for(int i = 0; i < randArray.length; i++){
            for(int j = 0; j < randArray[i].length; j++){
                if(minArrayValue > randArray[i][j]){
                    minArrayValue = randArray[i][j];
                }
            }
        }
        int expectedResult = minArrayValue;

        Assert.assertEquals(expectedResult,actualResult);

    }

    @Test
    /* Testing that arrays value for multiple operation
    * don't compare*/
    public void multipleTaskLogCompereTest(){
        int arrayLength = 15;
        int min = 2;
        int max = 9;
        int row1 = 0;
        int row2 = 0;
        boolean ifCompare = false;

        Object[] actualArray = (Object[]) lesson8.multipleTask(arrayLength,min,max);

        int[][] actualLogArray = (int[][]) actualArray[0];

        for(int i = 0; i < arrayLength; i++){
            row1 = actualLogArray[0][i];
            row2 = actualLogArray[1][i];
            for(int j = 0; j < actualArray.length; j++){
                if (i!=j){
                    if((row1 == actualLogArray[0][j]) && (row2 == actualLogArray[1][j])){
                        ifCompare = true;
                    }
                    if((row1 == actualLogArray[1][j]) && (row2 == actualLogArray[0][j])){
                        ifCompare = true;
                    }
                }
            }
        }

        boolean actualResult = ifCompare;
        boolean expectedResult = false;

        Assert.assertEquals(expectedResult,actualResult);

    }
    @Test
    /*Testing proper multiple operation
    with array data.
    * */
    public void multipleTaskTest(){
        int arrayLength = 15;
        int min = 2;
        int max = 9;
        int[] expectedResult = new int[arrayLength];

        Object[] actualArray = (Object[]) lesson8.multipleTask(arrayLength,min,max);

        int[][] actualLogArray = (int[][]) actualArray[0];

        int[] actualResult = (int[]) actualArray[1];

        for(int i =0; i < arrayLength; i++){
            expectedResult[i] = actualLogArray[0][i] * actualLogArray[1][i];
        }

        Assert.assertArrayEquals(expectedResult,actualResult);
    }
    @Test
    /*Testing proper printing of date.
    * */
    public void arrayPrintTest(){
        int[] testArray = {1,2,3,4,5};
        String actualResult = arrayP1.printArea(testArray);
        String expectedResult = "Array = " + Arrays.toString(testArray);

        Assert.assertEquals(expectedResult,actualResult);
    }
}
