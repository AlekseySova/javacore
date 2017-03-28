package main.java.com.alekseysova.runners;

import main.java.com.alekseysova.app.homework.lesson6.Lesson6HW;

/**
 * Created by pc on 3/25/2017.
 */
public class Lesson6Runner {
    public static void main(String[] args) {
        Lesson6HW simpleArray = new Lesson6HW();
        System.out.println("#1 array with only odd integer value from 2 to 20");
        simpleArray.simpleArray();
        System.out.println("");
        System.out.println("#2 array with only even integer value from 1 to 99");
        simpleArray.simpleArray2();
        System.out.println("");
        System.out.println("#3 array with 15 random integer value from 0 to 99" );
        System.out.println("Print count of odd element in array");
        simpleArray.randomFrom0To9();
        System.out.println("");
        System.out.println("#4 array with 15 random integer value from 0 to 999");
        System.out.println("Print maximal and minimal value of array");
        simpleArray.randomArrayFrom0To999();
        System.out.println("");
        System.out.println("#5 two-dimension array with 8 strokes and 5 column");
        System.out.println("With integer value from 10 to 99");
        simpleArray.twoDimenArray();
        System.out.println("");
        System.out.println("***#6 two-dimension array with 8 strokes and 5 column");
        System.out.println("Print array with RightAlign of all elements");
        simpleArray.twoDimenRightAlign();
        System.out.println("");
        System.out.println("***Array with input from user.");
        simpleArray.userInputSum();
    }
}
