package main.java.com.alekseysova.app.homework.lesson11;

import java.io.*;
import java.util.Arrays;

/**
 * Created by AlekseySova 4/21/2017.
 */
public class FileInputOutput {
    public void fileIO(){
        //Read data from file "read.txt" and write to "write.txt"
        try {
            BufferedReader buffer = new BufferedReader(new FileReader("c:\\Users\\pc\\javacore\\src\\main\\resources\\read.txt"));
            BufferedWriter writer = new BufferedWriter(new FileWriter("c:\\Users\\pc\\javacore\\src\\main\\resources\\write.txt"));
            String line;

            //write data to file line by line
            while ((line = buffer.readLine()) != null) {
                int[] resultArray = convertToArrayMethod(line);

                String writeString = sortMethod(resultArray);
                writer.write(writeString, 0, writeString.length());
                writer.newLine();
            }


            buffer.close();
            writer.close();

            System.out.println("Task complete");

        }catch(FileNotFoundException e){
            e.printStackTrace();
            System.out.println("File not found.");
        }catch(IOException e){
            e.printStackTrace();
        }
    }
    private int[] convertToArrayMethod(String line){
        //read one line of date
        String[] new_line = line.split(",");

        int[] readArray = new int[new_line.length];

        for(int i = 0; i < new_line.length; i++){
            readArray[i] = Integer.parseInt((new_line[i]));
        }

        return readArray;

    }

    private String sortMethod(int[] writeArray){
        // Sorting array to write to file
        Arrays.sort(writeArray);

        String line = Arrays.toString(writeArray);

        line = line.replace("[","").replace("]","");

        return line;
    }
}
