package main.java.com.alekseysova.app.homework.lesson18;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;


/**
 * Created by AlekseySova on 5/29/2017.
 */
public class PhoneBook {

    Scanner scanner = new Scanner(System.in);

    //Print info
    public void printCategoreInfo(String switchInfo, String category, String mapKey, HashMap<String, HashMap<String, String>> categoryMap) {

        HashMap<String, String> entryMap = new HashMap<>();

        if (categoryMap.isEmpty() == false) {

            if(switchInfo.equals("1") || switchInfo.equals("2") || switchInfo.equals("4") || switchInfo.equals("5")) {

                for (Map.Entry<String, HashMap<String, String>> categoryEntry : categoryMap.entrySet()) {
                    //Print all exist category
                    if(switchInfo.equals("1") || switchInfo.equals("2")) {
                        System.out.println(categoryEntry.getKey().toUpperCase());
                    }

                    entryMap = (HashMap<String, String>) categoryEntry.getValue();
                    // if "2" - print all keys and values
                    // if "4" - Find category and value by Name
                    // if "5" - Find category and name by value
                     if (switchInfo.equals("2") || switchInfo.equals("4") || switchInfo.equals("5")) {
                        for (Map.Entry<String, String> entry : entryMap.entrySet()) {
                             if(switchInfo.equals("2")) {
                                System.out.println("Name = " + entry.getKey() + "|| Phone Number = " + entry.getValue());
                            }
                            // Find category and value by Name
                            if(switchInfo.equals("4")){
                                String line = entry.getKey();

                                if(line.toLowerCase().equals(mapKey.toLowerCase()) ||
                                        line.toLowerCase().contains(mapKey.toLowerCase())){
                                    // if Name contains part of user input Name
                                    if(line.toLowerCase().contains(mapKey.toLowerCase())){
                                        System.out.println("Partial match");
                                    }
                                    System.out.println("Category = " + categoryEntry.getKey());
                                    System.out.println("Name = " + entry.getKey() + "|| PhoneNumber = " + entry.getValue());
                                }
                            }
                            // Find Category and Name by Value
                            if(switchInfo.equals("5")) {

                                String line = entry.getValue();

                                if (line.toLowerCase().equals(mapKey.toLowerCase()) ||
                                        line.contains(mapKey.toLowerCase())) {
                                    // if Value contains part of user input Value
                                    if(line.toLowerCase().contains(mapKey.toLowerCase())){
                                        System.out.println("Partial match");
                                    }
                                    System.out.println("Category = " + categoryEntry.getKey());
                                    System.out.println("Name = " + entry.getKey() + "|| PhoneNumber = " + entry.getValue());
                                }
                            }
                        }
                    }
                }
            }
            //creaty new category
            if(switchInfo.equals("3")) {

                if(categoryMap.containsKey(category) ) {

                    entryMap = categoryMap.get(category);

                    for (Map.Entry<String, String> entry : entryMap.entrySet()) {

                        System.out.println("Name = " + entry.getKey() + "|| Phone Number = " + entry.getValue());

                    }
                }
                else{

                    System.out.println("There is no such category");

                }

            }
        }
        else{

            System.out.println("Catalog is empty");
        }
    }

    public HashMap<String, HashMap<String, String>> changeData
            (String switchInfo,String category, HashMap<String, HashMap<String, String>> hashBook){


        String mapKey;
        String mapValue;

        HashMap<String, String> entryMap = new HashMap<>();

        if(hashBook.isEmpty() == false) {

            if (hashBook.containsKey(category)) {

                entryMap = hashBook.get(category);

                // Create new record

                if (switchInfo.equals("7")) {

                    System.out.print("Choose Name of contact = ");

                    mapKey = scanner.nextLine();

                    System.out.println("");

                    System.out.print("Choose phoneNumber");

                    mapValue = scanner.nextLine();

                    entryMap.put(mapKey, mapValue);

                    hashBook.put(category, entryMap);

                }

                // Change name of record

                if(switchInfo.equals("8")){

                    entryMap = hashBook.get(category);

                    System.out.println("Choose Old Name");

                    mapKey = scanner.nextLine();

                    if(entryMap.containsKey(mapKey)) {

                        mapValue = entryMap.get(mapKey);

                        entryMap.remove(mapKey);

                        System.out.println("Choose new Name");

                        mapKey = scanner.nextLine();

                        entryMap.put(mapKey, mapValue);

                        hashBook.put(category, entryMap);
                    }
                    else{
                        System.out.println("Name not found");
                    }
                }

                // Change value of record

                if(switchInfo.equals("9")){

                    System.out.println("Choose name");

                    mapKey = scanner.nextLine();

                    if(hashBook.containsKey(mapKey)){

                        System.out.println("This name already exist");

                        System.out.println("If you want to rewrite it enter \"Yes\"");

                        if(scanner.nextLine() == "Yes") {

                            System.out.println("Choose number");

                            mapValue = scanner.nextLine();

                            entryMap.put(mapKey, mapValue);

                            hashBook.put(category, entryMap);

                        }
                    }
                    else{

                        System.out.println("Choose number");

                        mapValue = scanner.nextLine();

                        entryMap.put(mapKey, mapValue);

                        hashBook.put(category, entryMap);

                    }

                }

            }else{
                if(switchInfo.equals("6")) {

                    hashBook.put(category, entryMap);

                    System.out.println("New category \"" + category + "\" created");
                }
                else{

                    System.out.println("Category not found");

                }
            }
        }else{
            System.out.println("Catalog is empty");
        }

        return hashBook;
    }


    public void savePhoneBook(HashMap<String, HashMap<String, String>> saveMap) {

        ReadWritePhoneBook rwBook = new ReadWritePhoneBook();

        rwBook.saveToFile(saveMap);

    }

    public HashMap<String, HashMap<String, String>> readFromPhoneBook() {

        ReadWritePhoneBook rwBook = new ReadWritePhoneBook();

        HashMap<String, HashMap<String, String>> readMap = new HashMap<>();

        readMap = rwBook.readFromFile();

        return readMap;
    }


}
