package main.java.com.alekseysova.app.homework.lesson11;

import javax.swing.*;
import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Created by AlekseySova on 4/28/2017.
 */
public class UserInputInFile {
    public void UserFile(){
        //Choose file from window
        Scanner scanner = new Scanner(System.in);
        JFileChooser jfc = new JFileChooser();
        String line = null;
        boolean isWrite = false;
        jfc.showDialog(null,"Please choose a file");
        jfc.setVisible(true);
        //get file path
        String fileName = String.valueOf(jfc.getSelectedFile());
        fileName = fileName.replace("\\","\\\\");

        File file = new File(fileName);

        try {
            // Write data in String type ArrayList
            ArrayList<String> list = new ArrayList<String>();
            BufferedWriter writer = new BufferedWriter(new FileWriter(file));

            // Write data in ArrayList line by line
            // if user enter "exit" store data from ArrayList
            // to writeTask3.txt
            while(isWrite == false){
                System.out.println("Please enter next line");
                System.out.println("If you want to save data type \"exit\"");
                line = scanner.nextLine();
                list.add(line);

                if(line.equals("exit") ){
                    for(String s: list){
                        writer.write(s,0,s.length());
                        writer.newLine();
                    }
                    isWrite = true;
                }
            }

            writer.close();

            System.out.println("Task3 complete");

        }catch(FileNotFoundException e){
            e.printStackTrace();
            System.out.println("File not found.");
        }catch(IOException e){
            e.printStackTrace();
        }
    }
}
