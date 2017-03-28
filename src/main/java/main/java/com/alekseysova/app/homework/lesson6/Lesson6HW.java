package main.java.com.alekseysova.app.homework.lesson6;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

/**
 * Created by pc on 3/25/2017.
 */

public class Lesson6HW {
    //Create array with only odd integer number from 2 to 20
    public void simpleArray(){
        int [] simpleArrayA = new int[10];
        int iIndex = 0;
        for(int i = 2; i<21; i++){
            if (i%2==0) {
                simpleArrayA[iIndex] = i;
                // Print elements of array in stroke
                System.out.print(simpleArrayA[iIndex] + " ");
                iIndex += 1;
            }
        }
        System.out.println("");
        for(int i = 0; i<simpleArrayA.length; i++){
            //Print elements of array in column
            System.out.println(simpleArrayA[i]);

        }
    }
    //Create array with only even integer value from 1 to 99
    public void simpleArray2(){

        int [] simpleArrayB = new int[50];
        int count = -1;
        for(int i = 0; i<100; i++){
            if(i%2==1) {
                simpleArrayB[++count] = i;
                //Print array in stroke from 1 to 99
                System.out.print(simpleArrayB[count] + " ");
            }
        }
        System.out.println("");
        for(int i = 49; i >-1; i--){
            //Print array from 99 to 1
            System.out.print(simpleArrayB[i] + " ");
        }
    }
    //Create array with 15 random number and count number of odd values
    public void randomFrom0To9(){
        Random random = new Random();
        int min = 0;
        int max = 9;
        int oddNum = 0;

        int [] randomNumArray = new int[15];
        for(int i = 0; i<15; i++){
            randomNumArray[i] = random.nextInt(max - min) + min;
            //Print array with random numbers
            System.out.print(randomNumArray[i] + " ");
            //Check in value is odd
            if(randomNumArray[i]%2==0){
                oddNum +=1;
            }
        }
        System.out.println("");
        //Print count of odd elements of array
        System.out.println("Count of odd num  = " + oddNum);
    }
    //Create array with 15 random integer value from 0 to 999
    //Print maximal and minimal value of array
    public void randomArrayFrom0To999(){
        Random random = new Random();
        int min = 0;
        int max = 999;
        int minArrayValue = max;
        int maxArrayValue = min;
        int [] randomArray999 = new int[15];
        for(int i = 0; i < 15; i++){
            randomArray999[i] = random.nextInt(max - min) + min;
            System.out.print(randomArray999[i] + " ");
            //Check for minimal value in array elements
            if(randomArray999[i] < minArrayValue ){
                minArrayValue = randomArray999[i];
            }
            //Check for maximal value in array elements
            if(randomArray999[i] > maxArrayValue){
                maxArrayValue = randomArray999[i];
            }
        }
        System.out.println("");
        System.out.println("Min value of Array = " + minArrayValue);
        System.out.println("Max value of Array = " + maxArrayValue);
    }
    //two-dimension array (8 strokes & 5 column) with value from 10 to 99
    public void twoDimenArray(){
        Random random = new Random();
        int min = 10;
        int max = 99;
        int [][] twoDArray = new int[8][5];
        for(int i = 0; i < 8; i++){
            for(int j = 0; j < 5; j++){
                twoDArray[i][j] = random.nextInt(max - min) + min;
                System.out.print(twoDArray[i][j] + " ");
            }
            System.out.println("");
        }
    }
    //Create two-dimension array with value from 1 to 999
    //Print array with RightAlign of elements
    public void twoDimenRightAlign(){
        Random random = new Random();
        int min = 1;
        int max = 999;
        int [][] twoRightAlignArray = new int[8][5];
        for(int i = 0; i < 8; i++){
            for(int j = 0; j < 5; j++){
                twoRightAlignArray[i][j] = random.nextInt(max - min) + min;
                //if value bigger then 99 do nothing
                if (twoRightAlignArray[i][j] > 99) {
                    System.out.print(twoRightAlignArray[i][j] + " ");
                }
                //if value less then 99 and begger then 9 add one "Space" before print array element
                if (twoRightAlignArray[i][j] < 99 && twoRightAlignArray[i][j] > 9){
                    System.out.print(" " + twoRightAlignArray[i][j] + " " );
                }
                //if value less then 9 print two "Space" before print array element
                if (twoRightAlignArray[i][j] < 9){
                    System.out.print("  " + twoRightAlignArray[i][j] + " ");
                }
            }
            System.out.println("");
        }
    }
    //Create an array where user input integer value one by one
    public void userInputSum() {
        boolean ifExit = false;
        String nextNum = null;
        int arraySum = 0;
        ArrayList<Integer> userNum = new ArrayList<Integer>();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Hello.");
        System.out.println("Please input integer value and press 'ENTER'");
        //User input elements of array one by one and then type "Exit" - to compute sum of elements
        while (ifExit == false) {
            System.out.println("To compute sum of input date type - Exit");
            System.out.println("Please enter another  integer value = ");
            nextNum = scanner.next();
            System.out.println("");
            //If user type "Exit" then compute summery of user input data and exit program
            if (nextNum.equals("Exit") == true) {
                ifExit = true;
                for(int i = 0; i < userNum.size(); i++){
                        arraySum = arraySum + userNum.get(i);
                    }
                System.out.println("Summery of user input = " + arraySum);
                }
                //If user type integer value put it in array
            else {
                try {
                    userNum.add(Integer.parseInt(nextNum));
                 }
                 catch(NumberFormatException e){
                     System.out.println("Wrong input. Try again.");
                    }
                }

            }
        }
    }

