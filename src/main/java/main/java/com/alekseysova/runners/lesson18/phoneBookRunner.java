package main.java.com.alekseysova.runners.lesson18;

import main.java.com.alekseysova.app.homework.lesson18.PhoneBook;

import java.util.HashMap;
import java.util.Scanner;

/**
 * Created by AlekseySova on 5/29/2017.
 */
public class phoneBookRunner {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String category, mapData;
        String switchCase;
        boolean isExit = false;
        PhoneBook book1 = new PhoneBook();

        HashMap<String,HashMap<String,String>> hashMapBook = new HashMap<>();

        hashMapBook = book1.readFromPhoneBook();

        book1.printCategoreInfo("1",null,null,hashMapBook);

        //Program menu
        do{
        System.out.println("Enter 1 - Print all categories ||   Enter 2 - Print all info\n"+
                           "Enter 3 - Find category        ||   Enter 4 - Find Name\n" +
                           "Enter 5 - Find phone number    ||   Enter 6 - Create new category\n" +
                           "Enter 7 - Create new record    ||   Enter 8 - Change Name\n" +
                           "Enter 9 - Change PhoneNumber   ||   Enter 10 - Save Phone Book and exit" );

        switchCase = scanner.nextLine();

        switch(switchCase) {

            case "1":
                // Print only name of Categorys
                System.out.println("List of categorys");

                book1.printCategoreInfo(switchCase,null,null,hashMapBook);

                break;

            case "2":
                // Print all info
                book1.printCategoreInfo(switchCase, null,null,hashMapBook);
                break;

            case "3":
                // Find category
                System.out.println("Enter category");

                category = scanner.nextLine().toUpperCase();

                if(hashMapBook.containsKey(category) == true) {

                    book1.printCategoreInfo(switchCase, category, null, hashMapBook);
                }else{
                    System.out.println("Categoty not found");
                }
                break;

            case "4":
                // Find name

                System.out.println("Enter Name");

                mapData = scanner.nextLine();

                book1.printCategoreInfo(switchCase, null, mapData, hashMapBook);

                break;

            case "5":
                // Find Phone Number

                System.out.println("Enter Value");

                mapData = scanner.nextLine();

                book1.printCategoreInfo(switchCase, null,mapData,hashMapBook);

                break;

            case "6":
                // Create new category
                System.out.println("Choose category");

                category = scanner.nextLine().toUpperCase();

                book1.changeData(switchCase,category, hashMapBook);

                break;

            case "7":
                // Create new record
                System.out.println("Choose category");

                category = scanner.nextLine().toUpperCase();

                if(hashMapBook.containsKey(category) == true) {

                    hashMapBook = book1.changeData(switchCase, category, hashMapBook);

                }

                break;

            case "8":
                // Change name(key)
                System.out.println("Choose category");

                category = scanner.nextLine().toUpperCase();

                hashMapBook = book1.changeData(switchCase,category,hashMapBook);
                break;

            case "9":
                // Change phone number(value)
                System.out.println("Choose category");

                category = scanner.nextLine().toUpperCase();

                if(hashMapBook.containsKey(category) == true) {

                    hashMapBook = book1.changeData(switchCase,category,hashMapBook);

                }

                break;

            case "10":
                // save data to file and exit
                isExit = true;
                break;

            default:

                System.out.println("Wrong enter. Try again.");

                break;
            }
        }while(isExit == false);

        book1.savePhoneBook(hashMapBook);

    }
}
