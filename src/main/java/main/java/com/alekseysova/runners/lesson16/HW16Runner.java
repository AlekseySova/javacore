package main.java.com.alekseysova.runners.lesson16;

import main.java.com.alekseysova.app.homework.lesson16.Crawler;
import main.java.com.alekseysova.app.homework.lesson16.Run;
import main.java.com.alekseysova.app.homework.lesson16.Tractor;
import main.java.com.alekseysova.app.homework.lesson16.Wheeled;

/**
 * Created by AlekseySova on 5/16/2017.
 */
public class HW16Runner {
    public static void main(String[] args) {
        //Create objects of classes Crawler and Wheeled
        Crawler crawler1 = new Crawler("Crawler1", 30);

        // Run method that override from interface Run
        crawler1.printTransportName(crawler1.getName());
        crawler1.speedOfTransport(crawler1.getCurrentSpeed());
        crawler1.weightOfTransport(1000);
        crawler1.countOfPassenger(4);
        crawler1.countOfWheel(2);

        Wheeled wheeled1 = new Wheeled("Wheeled1" , 50);
        // Run method that override from interface Run
        wheeled1.printTransportName(wheeled1.getName());
        wheeled1.speedOfTransport(wheeled1.getCurrentSpeed());
        wheeled1.weightOfTransport(1200);
        wheeled1.countOfPassenger(4);
        wheeled1.countOfWheel(4);
        //What will be if wrong data will be entered in method with data verification
        System.out.println("If try to set wrong value of speed");

        wheeled1.speedOfTransport(200);

        System.out.println("If try to set wrong value of passenger");

        crawler1.countOfPassenger(6);

    }
}
