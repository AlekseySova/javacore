package main.java.com.alekseysova.runners;

import main.java.com.alekseysova.app.homework.lesson9.HomeTask1;

import java.util.Scanner;

/**
 * Created by AlekseySova on 4/9/2017.
 */
public class HomeTask1Runner {
    public static void main(String[] args) {
        HomeTask1 homeWork = new HomeTask1();

        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter word = ");
        String stringPal = scanner.nextLine();
        stringPal = stringPal.replace("\\s+","");
        //Method#1 With cycle for compare elements of string to find is it Palindrome.
        System.out.println(homeWork.homeTask1Method(1, stringPal));
        //Method#2 Use method reverse() of Class StringBuilder and compare strings.
        System.out.println(homeWork.homeTask1Method(2, stringPal));
        //Method#3 Use method reverse() of Class StringBuffer and copmare strings.
        System.out.println(homeWork.homeTask1Method(3, stringPal));
    }
}
