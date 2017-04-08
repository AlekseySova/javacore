package main.java.com.alekseysova.app.homework.lesson8;

import java.util.Arrays;

/**
 * Created by pc on 3/31/2017.
 */
public class ArrayPrint {
    public String printArea(int [] arrayToPrint){
        String printString = "Array = " + Arrays.toString(arrayToPrint);
        System.out.println(printString);
        return printString;
    }
}
