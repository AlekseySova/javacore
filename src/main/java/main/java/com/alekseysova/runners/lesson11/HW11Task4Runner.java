package main.java.com.alekseysova.runners.lesson11;

import main.java.com.alekseysova.app.homework.lesson11.PropertiesFileEditor;

import java.util.Properties;

/**
 * Created by AlekseySova on 5/7/2017.
 */
public class HW11Task4Runner {
    public static void main(String[] args) {
        //Set properties file with
        // key - DBname
        // value = localhost
        PropertiesFileEditor propertiesFileWriter = new PropertiesFileEditor();

        Properties prop = new Properties();

        System.out.println("Task4 set properties file\n" +
                "with key(DBname) , value(localhost)\n");

        propertiesFileWriter.setProperties(prop);

        propertiesFileWriter.loadProperties(prop);

    }
}
