package main.java.com.alekseysova.app.classwork.lesson4;

import java.util.Scanner;

/**
 * Created by AlekseySova on 3/19/2017.
 */
public class RightAngeledTriangle {
    public static boolean rigthAngleSide(double a, double b, double c, double delta){
        boolean isRigth = false;
        // If this formala c*c = (a*a)+(b*b) true - then triangle is right-angeled.

        c = c*c;

        double rigthc = (a*a)+(b*b);

        if (Math.abs(rigthc-c) <= delta){
            System.out.println("This triangle is right-angeled triangel");
            isRigth = true;
        }
        else {
            System.out.println("This triangle is not right-angeled triangel");
        }
        return isRigth;
    }
}
