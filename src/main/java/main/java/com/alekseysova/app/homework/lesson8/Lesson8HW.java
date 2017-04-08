package main.java.com.alekseysova.app.homework.lesson8;

import java.util.Arrays;
import java.util.Random;

/**
 * Created by AlekseySova on 3/31/2017.
 */
    // Return integer array sorted by buble method from minimal to maximal value
public class Lesson8HW {
    public int[] bubleSortUpMethod(int [] bubleArray){
        int intTemp = 0;
        System.out.println("Sort array from minimal to maximal value");
        for(int i = 0; i < bubleArray.length; i++ ){
            for(int j = 0; j < bubleArray.length - 1; j++){
                if(bubleArray[j] > bubleArray[j+1] ){
                    intTemp = bubleArray[j+1];
                    bubleArray[j+1] = bubleArray[j];
                    bubleArray[j] = intTemp;
                }
            }
        }
        return bubleArray;
    }

    //Return integer array sorted by buble method from maximal to minimal value
    public int[] bubleSortDownMethod(int [] bubleArray){
        int intTemp = 0;
        for(int i = 0; i < bubleArray.length; i++ ){
            for(int j = 0; j < bubleArray.length - 1; j++){
                if(bubleArray[j] < bubleArray[j+1] ){
                    intTemp = bubleArray[j+1];
                    bubleArray[j+1] = bubleArray[j];
                    bubleArray[j] = intTemp;
                }
            }
        }
        return bubleArray;
    }
    //Return integer array sorted from minimal to maximal by Class Arrays sort method
    public int[] selectionSortMethod(int[] arraySort){

        Arrays.sort(arraySort);

        return arraySort;
    }

    //Return rendom 2D array from -99 to 99 and minimal and maximal value in array
    public Object[] randomArrayFrom99To99(int stroke, int column, int min, int max){
        Random random = new Random();
        int minArrayValue = max;
        int maxArrayValue = min;

        //Fill 2D array with random data from -99 to 99.
        int [][] randomArray99 = new int[stroke][column];
        System.out.println("Data 2D array = ");
        for(int i = 0; i < randomArray99.length; i++){
            for(int j = 0; j < randomArray99[i].length; j++ ) {
                randomArray99[i][j] = random.nextInt(max - min) + min;

                System.out.print(randomArray99[i][j]);

                //Check for minimal value in array elements
                if (randomArray99[i][j] < minArrayValue) {
                    minArrayValue = randomArray99[i][j];
                }
                //Check for maximal value in array elements
                if (randomArray99[i][j] > maxArrayValue) {
                    maxArrayValue = randomArray99[i][j];
                }
            }
            System.out.println(" ");
        }

        return new Object[] {maxArrayValue,minArrayValue, randomArray99};
    }

    /* Return 2D array with date for multiple operation
       and 1D array with result of multiple operation
    */
    public Object multipleTask(int arrayLength,int minValue, int maxValue){
        Random rand = new Random();
        boolean ifTrue = true;
        boolean ifCompare = false;
        int [][] logArray = new int[2][arrayLength];
        int []  resultArray = new int[arrayLength];
        int row1;
        int row2;

        for(int i = 0; i < arrayLength; i++){
            /*Write to random data if multiple data
            don't equal with data wrote in 2D array
            If date compare do it all again
            * */
            while(ifTrue == false) {
                row1 = rand.nextInt(maxValue - minValue) + minValue ;
                row2 = rand.nextInt(maxValue - minValue) + minValue ;
                // Compare new data with data in 2D array
                for(int j = 0; j < arrayLength; j++ ){
                    if(logArray[0] [j] != 0){
                        if (row1 == logArray[0][j] && row2 == logArray[1][j] ){
                            ifCompare = true;
                            }
                        else if(row1 == logArray[1][j] && row2 == logArray[0][j]){
                            ifCompare = true;
                            }
                        }
                    }
                    // If not equal - write data in 2D array
                    if(ifCompare == false){
                        logArray[0][i] = row1;
                        logArray[1][i] = row2;
                        resultArray[i] = row1 * row2;
                        ifTrue = true;
                    }
                    ifCompare = false;
                }
            //First cycle simple write data to 2D array and do multiple operation
            if (i == 0) {
                row1 = rand.nextInt(maxValue - minValue) + minValue;
                row2 = rand.nextInt(maxValue - minValue) + minValue;
                logArray[0][i] = row1;
                logArray[1][i] = row2;

                resultArray[i] = logArray[0][i]* logArray[1][i];
                }
                ifTrue = false;
            }

        return new Object[]{logArray, resultArray};
        }
    }

