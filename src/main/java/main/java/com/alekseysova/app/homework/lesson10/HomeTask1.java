package main.java.com.alekseysova.app.homework.lesson10;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Scanner;

/**
 * Created by AlekseySova on 4/12/2017.
 */
public class HomeTask1 {
    //Enter numeral data separated with delimiter
    //Return sorted array of data
    public Object[] homeTask1Method(String input, String delim) {
        Scanner scanner = new Scanner(System.in);

        Boolean ifFloat = true;
        //Enter delimiter
        String[] userString = input.split(delim);

        for (int i = 0; i < userString.length; i++) {
            if (Float.valueOf(userString[i]) == Math.round(Float.valueOf(userString[i]))) {
                ifFloat = false;
            }
        }
        /* If one of element of array has a non integer data then
           create float type array
        */
        if(ifFloat == false){

            Integer[] sortArray = new Integer[userString.length];

            for (int i = 0; i < userString.length; i++) {
                sortArray[i] = Integer.parseInt(userString[i]);
            }

            System.out.println("Enter way of sorting(1 - from small to large ),");
            System.out.print("2 - from large to small) = ");
            while (scanner.hasNext() && !scanner.hasNextInt()) {
                System.out.printf("Please enter an int, %s is not an int. Please enter again.%n", scanner.next());
                System.out.println("Enter way of sorting(1 - from small to large ),");
                System.out.print("2 - from large to small) = ");
            }

            int selectSort = scanner.nextInt();

            if (selectSort == 1) {
                Arrays.sort(sortArray);
            }
            if (selectSort == 2) {
                Arrays.sort(sortArray, Collections.reverseOrder());
            }
            Object[] resultObj = {sortArray, 0};
            return resultObj;
        }
         /* If all elements of array has integer data then
           create integer type array
        */
        else{
            Float[] sortArray = new Float[userString.length];

            for(int i = 0; i < userString.length; i++){
                sortArray[i] = Float.valueOf(userString[i]);
            }
            System.out.println("Enter way of sorting(1 - from small to large ),");
            System.out.print("2 - from large to small) = ");
            while (scanner.hasNext() && !scanner.hasNextInt()) {
                System.out.printf("Please enter an int, %s is not an int. Please enter again.%n", scanner.next());
                System.out.println("Enter way of sorting(1 - from small to large ),");
                System.out.print("2 - from large to small) = ");
            }

            int selectSort = scanner.nextInt();

            if (selectSort == 1) {
                Arrays.sort(sortArray);
            }
            if (selectSort == 2) {
                Arrays.sort(sortArray, Collections.reverseOrder());
            }

            Object[] resultObj = {sortArray,1};
            return resultObj;

        }

    }

}
