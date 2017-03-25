package main.java.com.alekseysova.app.homework.lesson4;

import java.util.Scanner;

/**
 * Created by AlekseySova on 3/20/2017.
 */
public class EvenOrOdd {
    public static boolean defineEvenOrOdd(int a){
        boolean isEven;
        if ((a & 1) == 0){
            System.out.println("Integer is odd");
            isEven = true;
        }
        else{
            System.out.println("Integer is even");
            isEven = false;
        }
        return isEven;
    }
}
