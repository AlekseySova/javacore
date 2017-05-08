package main.java.com.alekseysova.app.homework.lesson11;

import javax.swing.*;
import java.io.*;
import java.util.Enumeration;
import java.util.Properties;
import java.util.Scanner;

/**
 * Created by AlekseySova on 5/7/2017.
 */
public class PropertiesFileEditor {
    //Create properties file and write data to it
    public Properties setProperties(Properties prop) {

        Enumeration enuKeys;

        boolean isNotUniqueKey = false;

        String propKey;

        String propValue;

        Scanner scanner = new Scanner(System.in);

        OutputStream output = null;

        try {
            //Finding type of OS
            String osName = System.getProperty("os.name");
            String homeDir = System.getProperty("user.dir");
            if(osName.contains("win")){

                homeDir += "\\src\\main\\resources\\DBname.properties";

            }
            else{

                homeDir += "/src/main/resources/DBname.properties";

            }
            //Loading file
            output = new FileOutputStream(homeDir);

            do {

                enuKeys = prop.keys();

                System.out.println("Please enter Property key = ");

                propKey = scanner.nextLine();
                //Searching for same keys in properties file
                while(enuKeys.hasMoreElements()){
                    if(propKey.equals((String) enuKeys.nextElement())){
                        //if properties file have same key
                        //then not write data in file
                        isNotUniqueKey = true;
                    }
                }

                if(isNotUniqueKey == false) {
                    // if user enter empty key
                    // then save data to file and exit program
                    if (propKey.isEmpty() == true) {

                        prop.store(output, "dbname, localhost");


                    } else {
                        // if line don't empty enter key Value
                        System.out.println("Please enter property value = ");

                        propValue = scanner.nextLine();

                        prop.setProperty(propKey, propValue);
                    }
                }
                else{
                    //Ask user to enter another key
                    System.out.println("This Key already exist");
                    System.out.println("Please Enter unique key");
                    isNotUniqueKey = false;
                }
            } while (propKey.isEmpty() == false);

        }catch (IOException io) {
            io.printStackTrace();
        } finally {
            if (output != null) {
                try {
                    output.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }

        return prop;
    }

    public void loadProperties(Properties prop) {
            // Load and print properties file keys and values
            Enumeration enuKeys = prop.keys();

            while(enuKeys.hasMoreElements()){
                String propKey = (String) enuKeys.nextElement();
                String propValue = prop.getProperty(propKey);
                System.out.println(propKey + "=" + propValue);
            }
        System.out.println("Task complete");

    }
}
