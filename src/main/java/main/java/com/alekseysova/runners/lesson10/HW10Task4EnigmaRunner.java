package main.java.com.alekseysova.runners.lesson10;

import main.java.com.alekseysova.app.homework.lesson10.HomeTask4Enigma;

import java.util.Scanner;

/**
 * Created by AlekseySova on 4/14/2017.
 */
public class HW10Task4EnigmaRunner {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String userInput = "";

        HomeTask4Enigma enigma = new HomeTask4Enigma();

        String resEncode = enigma.enCode(userInput);

        System.out.println("Coded string");
        System.out.print(" = " + resEncode);
        System.out.println("");

        String resDecode = enigma.deCode(resEncode);

        System.out.println("Decoded string");
        System.out.println(" = " + resDecode);
    }

}

