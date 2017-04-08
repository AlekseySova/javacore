package main.java.com.alekseysova.runners;

import main.java.com.alekseysova.app.homework.lesson8.ArrayPrint;
import main.java.com.alekseysova.app.homework.lesson8.Lesson8HW;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by AlekseySova on 3/31/2017.
 */
public class Lesson8HWRunner {
    public static void main(String[] args){
        Lesson8HW sortMethod = new Lesson8HW();
        ArrayPrint printArray = new ArrayPrint();
        Lesson8HW multipleTable = new Lesson8HW();
        Scanner scanner = new Scanner(System.in);
        boolean isExit = false;


        while(isExit == false){
            System.out.println("Please choose one of 5 Task");
            System.out.println("If you want ot \"exit\" type 6;");
            System.out.println("Select a task = ");
            while (scanner.hasNext() && !scanner.hasNextInt()) {
                System.out.printf("Please enter an int, %s is not an int. Please enter again.%n", scanner.next());
                System.out.println("Select a task = ");
            }

            int taskNum = scanner.nextInt();

            switch(taskNum) {
                // #1 Buble sorting array from lower to bigger value.
                case 1:
                    int[] bubleArray1 = {10, 14, 7, 90, 23, 11, 45};
                    System.out.println("Given array = " + Arrays.toString(bubleArray1));

                    int[] resultArray1 = sortMethod.bubleSortUpMethod(bubleArray1);
                    printArray.printArea(resultArray1);
                    System.out.println("");
                    break;
                // #2 Buble sorting array from bigger to lower value.
                case 2:
                    int[] bubleArray2 = {10, 14, 7, 90, 23, 11, 45};
                    System.out.println("Given array = " + Arrays.toString(bubleArray2));
                    System.out.println("Sort array from maximal to mininal value");
                    int[] resultArray2 = sortMethod.bubleSortDownMethod(bubleArray2);
                    System.out.println("");
                    printArray.printArea(resultArray2);
                    System.out.println("");
                    break;
                // #3 Sorting array with Arrays.sort method. Result: sorted array from lower to bigger data.
                case 3:
                    int[] arraySort = {23, 45, 111, 43, 67, 99, 23, 56};
                    System.out.println("Given array = " + Arrays.toString(arraySort));
                    int[] array3 = sortMethod.selectionSortMethod(arraySort);
                    System.out.println("Result array = " + Arrays.toString(array3));
                    break;
                case 4:
                    /*#4 Create 2D array(5 strokes, 8 column) with random integer dara from -99 to 99.
                    * Return maximal and minimal value of array elements*/
                    System.out.println("2D arrays with random integer value = ");
                    Object[] result = (Object[])sortMethod.randomArrayFrom99To99(5, 8, -99, 99);
                    System.out.println("Max value of Array = " + result[0]);
                    System.out.println("Min value of Array = " + result[1]);
                    break;
                case 5:
                    /*#5 Create promgram for multiple operation.
                    * 15 combination of date in range from 2 to 9.
                    * Date of combination can't be equal.
                    * Combination like 3*3(3*2, 2*3) are equal*/
                    Object[] obj = (Object[]) sortMethod.multipleTask(15, 2, 9);
                    System.out.println("");
                    int[][] logArray = (int[][]) obj[0];
                    System.out.println("Data Array = ");
                    for(int i = 0; i < logArray.length; i++){
                        for(int j = 0; j < logArray[i].length; j++) {
                            System.out.print(logArray[i][j] + " ");
                        }
                        System.out.println("");
                    }
                    int[] resultArray = (int[]) obj[1];
                    System.out.println("Result Array = ");
                    System.out.println(Arrays.toString(resultArray));
                    break;
                case  6:
                    System.out.println("Exit");
                    isExit = true;
                    break;
                default:
                    System.out.println("Wrong input. Try again.");

            }
        }


    }


}
