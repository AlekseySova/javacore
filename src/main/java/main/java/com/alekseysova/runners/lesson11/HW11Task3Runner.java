package main.java.com.alekseysova.runners.lesson11;

import main.java.com.alekseysova.app.homework.lesson11.UserInputInFile;

/**
 * Created by AlekseySova on 4/28/2017.
 */
    public class HW11Task3Runner {
    public static void main(String[] args) {
        //Select file and write to in
        //line by line
        //if enter "exit" to write to file
        UserInputInFile file = new UserInputInFile();
        System.out.println("Select file and write to it\n" +
                "line by line\n");
        file.UserFile();
    }
}
