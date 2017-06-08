package main.java.com.alekseysova.app.homework.lesson18;

import java.io.*;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * Created by AlekseySova on 5/29/2017.
 */
public class ReadWritePhoneBook {
    // Method for reading phone book from file
    public HashMap<String, HashMap<String, String>> readFromFile() {

        HashMap<String, HashMap<String,String>> hashBook = new HashMap<>();

        String  mapName, line, subLine;
        String mapCategory = null;
        int mapIndexFirst;
        int mapIndexLast;
        String mapValue;

        File file;

        BufferedReader reader = null;

        try {
            //Finding type of OS
            String osName = System.getProperty("os.name");
            String homeDir = System.getProperty("user.dir");
            if(osName.contains("win")){

                homeDir += "\\src\\main\\resources\\lesson18\\phoneBook.txt";

            }
            else{

                homeDir += "/src/main/resources/lesson18/phoneBook.txt";

            }
            //Loading file
            file = new File(homeDir);
            reader = new BufferedReader(new FileReader(file));

            while((line = reader.readLine()) != null){

                HashMap<String, String> entryBook = new HashMap<>();

                if(line.contains("Category=")) {

                    mapIndexFirst = line.indexOf("=");
                    mapIndexFirst += 1;
                    mapCategory = line.substring(mapIndexFirst);

                    while((line = reader.readLine()).matches("") == false) {

                        if (line.contains("Phone data :")) {
                            mapIndexFirst = line.indexOf(":");
                            mapIndexFirst += 1;

                            mapIndexLast = line.lastIndexOf("=");

                            mapName = line.substring(mapIndexFirst, mapIndexLast);

                            mapIndexFirst = mapIndexLast + 1;

                            subLine = line.substring(mapIndexFirst);

                            mapValue = subLine;

                            entryBook.put(mapName, mapValue);


                        }

                    }

                    hashBook.put(mapCategory, entryBook);
                }

            }

            reader.close();

        }catch (IOException io) {
            io.printStackTrace();
        } finally {
            if (reader != null) {
                try {
                    reader.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }

        return hashBook;
    }

    public void saveToFile(HashMap<String, HashMap<String, String>> saveMap) {
        //Method for writing phone book to file
        HashMap<String, String> entryBook = new HashMap<>();

        String  mapName, line;
        String mapCategory = null;
        String mapValue;

        File file;

        BufferedWriter writer = null;

        try {
            //Finding type of OS
            String osName = System.getProperty("os.name");
            String homeDir = System.getProperty("user.dir");
            if(osName.contains("win")){

                homeDir += "\\src\\main\\resources\\lesson18\\phoneBook.txt";

            }
            else{

                homeDir += "/src/main/resources/lesson18/phoneBook.txt";

            }
            //Loading file
            file = new File(homeDir);
            writer = new BufferedWriter(new FileWriter(file));

            writer.write("");
            writer.flush();
            writer.close();

            writer = new BufferedWriter(new FileWriter(file));

            for(Map.Entry<String, HashMap<String, String>> entryCategory: saveMap.entrySet()) {

                mapCategory = entryCategory.getKey();
                entryBook = entryCategory.getValue();

                line = "Category=" + mapCategory;

                writer.write(line, 0, line.length());
                writer.newLine();

                for(Map.Entry<String, String> entryPhone: entryBook.entrySet()){

                    mapName = entryPhone.getKey();
                    mapValue = entryPhone.getValue();

                    line = "Phone data :" + mapName + "=" + mapValue;

                    writer.write(line, 0, line.length());
                    writer.newLine();

                }

                writer.write("");
                writer.newLine();
            }


            writer.close();

        }catch (IOException io) {
            io.printStackTrace();
        } finally {
            if (writer != null) {
                try {
                    writer.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }

    }
}
