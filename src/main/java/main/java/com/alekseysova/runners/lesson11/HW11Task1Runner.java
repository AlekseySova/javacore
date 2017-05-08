package main.java.com.alekseysova.runners.lesson11;

import main.java.com.alekseysova.app.homework.lesson11.FileInputOutput;
import main.java.com.alekseysova.app.homework.lesson11.FileInputOutputColumn;

/**
 * Created by AlekseySova on 4/20/2017.
 */
public class HW11Task1Runner {
    public static void main(String[] args) {
        //read and write in users files
        FileInputOutput file = new FileInputOutput();
        System.out.println("Read integer array from file read.txt\n" +
                "and write sorted data to file write.txt");
        file.fileIO();
    }
}
