package main.java.com.alekseysova.app.homework.lesson11;

import java.io.*;
import java.util.Arrays;

/**
 * Created by AlekseySova on 4/20/2017.
 */
public class FileInputOutputColumn {
    public void fileIO(){
        try {
            BufferedReader buffer = new BufferedReader(new FileReader("c:\\Users\\pc\\javacore\\src\\main\\resources\\readforTask2.txt"));
            BufferedWriter writer = new BufferedWriter(new FileWriter("c:\\Users\\pc\\javacore\\src\\main\\resources\\writeforTask2.txt"));
            String line;

            while ((line = buffer.readLine()) != null) {
                line = line.toLowerCase().replace(" ", "");
                String writeString = writeMethod(line);
                writer.write(writeString, 0, writeString.length());
                writer.newLine();
            }


            buffer.close();
            writer.close();

            System.out.println("Task2 complete\t");


        }catch(FileNotFoundException e){
            e.printStackTrace();
            System.out.println("File not found.");
        }catch(IOException e){
            e.printStackTrace();
        }
    }


    public String writeMethod(String line){

        StringBuilder revertLine = new StringBuilder(line);

        revertLine.reverse();

        if(line.equals(revertLine.toString())){

            line += " Polindrome";
        }
        else{
            line += " not Polindrome";
        }

        return line;
    }
}
