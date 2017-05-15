package main.java.com.alekseysova.runners.lesson12;

import main.java.com.alekseysova.app.homework.lesson12.BicycleWithRing;

/**
 * Created by AlekseySova on 5/3/2017.
 */
public class HW12Runner {
    public static void main(String[] args) {
        //create object of class BicycleWithRing
        //implement interface BicycleWithRingInterface
        //that inherit class CustomBicycle that inherit class Bicycle
        BicycleWithRing bicycle1 = new BicycleWithRing(34,6);

        System.out.println("Bicycle speed before changing = " + bicycle1.getSpeed());

        System.out.println("Bicycle gear before changing = " + bicycle1.getGear());
        //Change Speed and Gear of Bicycle1
        bicycle1.setGear(3);
        bicycle1.setSpeed(110);

        System.out.println("Bicycle speed after changing = " + bicycle1.getSpeed());

        System.out.println("Bicycle gear after changing = " + bicycle1.getGear());

        //run method ride that overrided in class CustomBicycle
        bicycle1.ride();
        //run method ring that overrided in class BicycleWithRing
        bicycle1.ring();
    }
}
