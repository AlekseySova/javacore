package main.java.com.alekseysova.runners.lesson10;

import main.java.com.alekseysova.app.homework.lesson10.HomeTask1;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by pc on 4/12/2017.
 */
public class HW10Task1Runner {
    public static void main(String[] args) {
        HomeTask1 homeWork = new HomeTask1();
        Scanner scanner = new Scanner(System.in);
        boolean isDelim = false;
        String delim = "";
        //input deliminer (;,:,#,@,!)
        do {
            System.out.print("Pleas input delimiter(;,:,#,@,!) = ");

            delim = scanner.nextLine();

            System.out.println("");

            if(delim.matches("[;,:,#,@,!]{1}")) {

                if (delim.length() == 1) {
                    isDelim = true;
                }
            }
            System.out.println(delim);
        }while(isDelim == false);

        System.out.println("Please input integer array splited by \"" + delim + "\"");
        System.out.println("example(1" + delim + "2" + delim + "3" +delim + "4" + delim + "...)");
        System.out.print("Integer array = ");

        String userInput = scanner.next();
        //Use method that convert string ot integer or float array
        Object[] resObject = homeWork.homeTask1Method(userInput,delim);

        int selectResult = (int)resObject[1];

        if(selectResult == 0){
            Integer[] resArray = (Integer[])resObject[0];
            System.out.println("Sorted array = " + Arrays.toString(resArray) );
        }
        if(selectResult == 1){
            Float[] resArray = (Float[])resObject[0];
            System.out.println("Sorted array = " + Arrays.toString(resArray) );
        }

        System.out.println("");
    }
}
