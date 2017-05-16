package main.java.com.alekseysova.runners.lesson13;

import main.java.com.alekseysova.app.homework.lesson13.WhiteCollar;

/**
 * Created by AlekseySova on 5/3/2017.
 */
public class HW13Task2Runner {
    public static void main(String[] args) {
        //Create object white collar
        WhiteCollar man2 = new WhiteCollar("Robbert", 48, "HP");

        System.out.println("White Collar name = " + man2.getName());

        System.out.println("White Collar age = " + man2.getAge());

        System.out.println("White Collar company before change = " + man2.getCompanyName());
        // Change company
        man2.setCompany("intel");

        System.out.println("White Collar company after change = " + man2.getCompanyName());


    }
}
