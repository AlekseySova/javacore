package main.java.com.alekseysova.app.homework.lesson4;

import java.io.InputStream;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Created by Aleksey Sova on 3/17/2017.
 */
public class CircleArea{
    // This method return circle squer.
    public static double calculateRadius(double radius) {

        double circleArea = Math.PI * radius * radius;

        return circleArea;
    }
    public static String calculateBigger(double area1, double area2) {
        String compareResult = "";

        if (area1 > area2){
            compareResult = "Result: Area1 is bigger";
            System.out.println(compareResult);
        }
        else if (area1 == area2){
            compareResult = "Result: Area1 equal with Area2";
            System.out.println(compareResult);
        }
        else if (area1 < area2){
            compareResult = "Result: Area2 is bigger";
            System.out.println(compareResult);
        }
        return compareResult;
    }
}
