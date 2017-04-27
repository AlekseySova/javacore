package main.java.com.alekseysova.runners.lesson10;

import main.java.com.alekseysova.app.homework.lesson10.HomeTask3;

import java.util.Scanner;

/**
 * Created by AlekseySova on 4/14/2017.
 */
public class HW10Task3Runner {
    public static void main(String[] args) {
        // Split array by user keyword
        HomeTask3 homeWork = new HomeTask3();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter keyword thar will be delimit string");
        System.out.print("KeyWord = ");

        String keyWord = scanner.nextLine();

        System.out.println("");

        System.out.println("Please enter word sequansis with keywords");
        System.out.print("Array = ");

        String userInput = scanner.nextLine();

        if(userInput.contains(keyWord)){
            String[] resString = homeWork.homeTask3Method(userInput, keyWord);

            for (int i = 0; i < resString.length; i++) {
                System.out.println(resString[i]);
            }
        }
        else {
            System.out.println("Ther is no keyWord in this string");
        }
        System.out.println("");
    }
}
