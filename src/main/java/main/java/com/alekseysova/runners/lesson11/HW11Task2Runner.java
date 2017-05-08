package main.java.com.alekseysova.runners.lesson11;

import main.java.com.alekseysova.app.homework.lesson11.FileInputOutputColumn;

/**
 * Created by AlekseySova on 4/28/2017.
 */
public class HW11Task2Runner {
    public static void main(String[] args) {
        // Read data from file
        // Write data with definition of Polindrome
        FileInputOutputColumn file = new FileInputOutputColumn();

        System.out.println("Read data from file readforTask2.txt\n" +
                "write to file writeforTask2.txt \n" +
                "with definition of Polindrome");

        file.fileIO();
    }
}
