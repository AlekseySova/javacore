package main.java.com.alekseysova.runners.lesson13;

import main.java.com.alekseysova.app.homework.lesson13.Human;

/**
 * Created by AlekseySova on 5/3/2017.
 */
public class HW13Task1Runner {
    public static void main(String[] args) {
        //Create object human
        Human man1 = new Human("Alex", 28);

        System.out.println("Human name = " + man1.getName());

        System.out.println("Human age = " + man1.getAge());
    }

}
