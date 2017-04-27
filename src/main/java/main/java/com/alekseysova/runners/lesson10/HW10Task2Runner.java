package main.java.com.alekseysova.runners.lesson10;

import main.java.com.alekseysova.app.homework.lesson10.HomeTask2;

import java.util.Scanner;

/**
 * Created by AlekseySova on 4/13/2017.
 */
public class HW10Task2Runner {
    public static void main(String[] args) {
        HomeTask2 homeWork = new HomeTask2();
        Scanner scanner = new Scanner(System.in);
        boolean isDelim = false;
        //default delimiter
        String delim = ";";

        System.out.println("Delimiter is \""+ delim + " \"");

        System.out.println("If you want to change delimiter enter \"Y\" if not \"N\" ");

        String delimChoose = scanner.next();
        // Enter another delimiter
        if(delimChoose.equals("Y")) {

            do {
                System.out.print("Pleas input delimiter(:,#,@,!) = ");

                delim = scanner.next();

                System.out.println("");

                if (delim.matches("[:,#,@,!]{1}")) {

                    if (delim.length() == 1) {
                        isDelim = true;
                    }
                }
                System.out.println(delim);
            } while (isDelim == false);

        }

        System.out.println("Please enter data sequence splitted by \"" + delim + "\"");
        System.out.println("example(@" + delim + "A" + delim + "C" +delim + "4" + delim + "...)");
        System.out.print("Array = ");

        String userInput = scanner.next();

        System.out.println("");
        //Return array with only alphabetical signs
        String resString = homeWork.homeTask2Method(userInput, delim);

        System.out.println("Result arrray = ");

        System.out.println(resString);
        System.out.println("");
    }
}
