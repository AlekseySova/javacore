package main.java.com.alekseysova.runners;

import main.java.com.alekseysova.app.homework.lesson9.HomeTask2;

import java.util.Scanner;

/**
 * Created by AlekseySova on 4/10/2017.
 */
public class HomeTask2Runner {
    public static void main(String[] args) {
        // Run 5 methods for checking the polydromy of a string.
        HomeTask2 homeWork = new HomeTask2();

        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter word = ");
        String stringPal = scanner.nextLine();
        stringPal = stringPal.replace("\\s+","");
        //Method#1 With cycle for compare elements of string to find is it Palindrome.
        System.out.println(homeWork.homeTask2Method(1,stringPal));
        //Method#2 Use method reverse() of Class StringBuilder and compare strings.
        System.out.println(homeWork.homeTask2Method(2, stringPal));
        //Method#3 Use method reverse() of Class StringBuffer and copmare strings.
        System.out.println(homeWork.homeTask2Method(3, stringPal));
        //Method#4 Use cycle for to reverse string.
        System.out.println(homeWork.homeTask2Method(4,stringPal));
        //Method#5 Use boolean operation XOR to reverse string.
        System.out.println(homeWork.homeTask2Method(5,stringPal));
    }

}
