package main.java.com.alekseysova.runners.lesson10;

import com.sun.org.apache.xpath.internal.SourceTree;
import main.java.com.alekseysova.app.homework.lesson10.HomeTask5Caesar;

import java.util.Scanner;

/**
 * Created by pc on 4/15/2017.
 */
public class HW10Task5CaesarRunner {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        HomeTask5Caesar cipher = new HomeTask5Caesar();
        int cipherKey = 0;

        System.out.println("Please enter what you want to cipher");
        System.out.print(" = ");

        String userCipher = scanner.nextLine();

        System.out.println("");

        System.out.println("Please enter integer value of displacement(from 1 to 36)");
        System.out.print(" = ");

        do {
            while (scanner.hasNext() && !scanner.hasNextInt()) {
                System.out.printf("Please enter an int, %s is not an int. Please enter again.%n", scanner.next());
                System.out.println("Please enter integer value of displacement");
                System.out.print(" = ");
            }
            cipherKey = scanner.nextInt();

            if (cipherKey < 0 || cipherKey >= 37){
                System.out.println("Please enter correct integer value(from 1 to 36)");
            }
        }while(cipherKey < 0 || cipherKey >= 37);


        System.out.println("");

        String resCode = cipher.cipherCaeser(userCipher, cipherKey, true);

        System.out.print("This is your cipher string = " + resCode);

        System.out.println("");
        resCode = cipher.cipherCaeser(resCode, cipherKey, false);

        System.out.print("This is your decoded string = " + resCode);

        System.out.println("");

    }
}
