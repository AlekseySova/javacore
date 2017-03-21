package main.java.com.alekseysova.app.classwork.lesson4;

import main.java.com.alekseysova.app.classwork.lesson4.BiggerNumber;
import main.java.com.alekseysova.app.classwork.lesson4.CircleArea;
import main.java.com.alekseysova.app.classwork.lesson4.RightAngeledTriangle;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Created by AlekseySova on 3/20/2017.
 */
public class SelectTask {
    public static void selectTaskInterface() {
        boolean exitProg = false;
        Scanner scanner = new Scanner(System.in);
        //User interface
        //Selection one of three function and then return to this menu
        System.out.println("Hello.");
        while(exitProg == false) {
            System.out.println("Please choose one of function");
            System.out.println("1. to find out whether the triangle is right-angeled");
            System.out.println("2. to determine the area of which circle is larger");
            System.out.println("3. to determine which number is greater");
            System.out.println("4. to exit this program");
            System.out.print("Select a task = ");
            //Input choise of function from keyboard
            while (scanner.hasNext() && !scanner.hasNextInt()) {
                System.out.printf("Please enter an int, %s is not an int. Please enter again.%n", scanner.next());
                System.out.println("Select a task = ");
            }
            int selectNum = scanner.nextInt();
            System.out.println("");
            // Right-angeled triangle function
            if (selectNum == 1) {
                double delta = 0.1d;
                System.out.println("Enter the values of the sides of the triangle");
                System.out.println("Cathetuses A, B and hypotenuse C.");
                System.out.println("Please enter side A value");
                while (scanner.hasNext() && !scanner.hasNextDouble()) {
                    System.out.printf("Please enter an double, %s is not an double. Please enter again.%n", scanner.next());
                    System.out.println("A = ");
                }
                double aSide = scanner.nextDouble();

                System.out.println("Please enter side B value");
                while (scanner.hasNext() && !scanner.hasNextDouble()) {
                    System.out.printf("Please enter an double, %s is not an double. Please enter again.%n", scanner.next());
                    System.out.println("B = ");
                }
                double bSide = scanner.nextDouble();

                System.out.println("Please enter side C value");
                while (scanner.hasNext() && !scanner.hasNextDouble()) {
                    System.out.printf("Please enter an double, %s is not an double. Please enter again.%n", scanner.next());
                    System.out.println("C = ");
                }
                double cSide = scanner.nextDouble();

                RightAngeledTriangle.rigthAngleSide(aSide, bSide, cSide, delta);
            }
            // Determine what CircleArea is bigger
            else if (selectNum == 2) {
                double radius;
                System.out.print("Enter Area1 radius =  ");
                while (scanner.hasNext() && !scanner.hasNextDouble()) {
                    System.out.printf("Please enter an double, %s is not an double. Please enter again.%n", scanner.next());
                }
                radius = scanner.nextDouble();

                double area1 = CircleArea.calculateRadius(radius);
                System.out.println("");
                System.out.println("Area1 area = " + area1);
                System.out.println("Enter Area2 radius = ");

                while (scanner.hasNext() && !scanner.hasNextDouble()) {
                    System.out.printf("Please enter an double, %s is not an double. Please enter again.%n", scanner.next());
                }
                radius = scanner.nextDouble();

                double area2 = CircleArea.calculateRadius(radius);
                System.out.println("");
                System.out.println("Area2 area = " + area2);

                CircleArea.calculateBigger(area1, area2);
            }
            // Determine what number is bigger;
            else if (selectNum == 3) {
                System.out.println("Enter values to compare A and B");
                System.out.print("A = ");
                while (scanner.hasNext() && !scanner.hasNextDouble()) {
                    System.out.printf("Please enter an double, %s is not an double. Please enter again.%n", scanner.next());
                    System.out.println("A = ");
                }
                double a = scanner.nextDouble();
                System.out.println("");
                System.out.print("B = ");
                while (scanner.hasNext() && !scanner.hasNextDouble()) {
                    System.out.printf("Please enter an double, %s is not an double. Please enter again.%n", scanner.next());
                    System.out.println("B = ");
                }
                double b = scanner.nextDouble();

                System.out.println("");
                BiggerNumber.calculateBigger(a, b);
            }
            // Exit program
            else if (selectNum == 4) {
                exitProg = true;

            }
            // if input integer but not 1,2,3 or 4 then do input again
            else
                {
                System.out.println("Wrong input.");
                System.out.println("You type = " + selectNum + " But should have been 1, 2, 3 or 4");
                System.out.println("Please try again");
            }
            System.out.println("");
        }
    }
}
