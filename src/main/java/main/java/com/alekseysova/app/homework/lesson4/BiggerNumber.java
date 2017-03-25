package main.java.com.alekseysova.app.homework.lesson4;

import java.util.Scanner;

/**
 * Created by AlekseySova on 3/20/2017.
 */
public class BiggerNumber {
    public static int calculateBigger(double a, double b){
        int resBigger;
        if (a > b){
            System.out.println("Result: A is bigger then B");
            resBigger = 1;
        }
        else if (a == b){
            System.out.println("Result: A is equal B");
            resBigger = 2;
        }
        else{
            System.out.println("Result: B is bigger then A");
            resBigger = 3;
        }
        return resBigger;
    }
}
