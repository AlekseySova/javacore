package main.java.com.alekseysova.runners;

import java.util.Scanner;

/**
 * Created by AlekseySova on 4/10/2017.
 */
public class Lesson9HWRunner {
    public static void main(String[] args) {
        HomeTask1Runner homeWork1 = new HomeTask1Runner();
        HomeTask2Runner homeWork2 = new HomeTask2Runner();

        Scanner scanner = new Scanner(System.in);

        System.out.println("Select HomeWork (number 1 or 2) = ");

        while (scanner.hasNext() && !scanner.hasNextInt()) {
            System.out.printf("Please enter an int, %s is not an int. Please enter again.%n", scanner.next());
            System.out.println("Select a task = ");
        }

        int selectTask = scanner.nextInt();


        switch(selectTask) {
            case 1:
                homeWork1.main(null);
            case 2:
                homeWork2.main(null);
        }
    }
}
