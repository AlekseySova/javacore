package main.java.com.alekseysova.app.homework.lesson16;

import java.util.Objects;

/**
 * Created by AlekseySova on 5/16/2017.
 */
public abstract class Mashine implements Run {
    //constant for data verification
    public static final int MAXSPEED = 180 ;
    public static final int MINSPEED = 5;
    public static final int MAXPASSANGER = 4;
    public static final int MINPASSANGER = 1;

    private String name;

    private double currentSpeed;

    public String getName() {
        return name;
    }

    public double getCurrentSpeed() {
        return currentSpeed;
    }

    public Mashine(String name, double currentSpeed) {
        this.name = name;
        this.currentSpeed = currentSpeed;
    }


    @Override
    public void printTransportName(String name) {
        System.out.println("Name of transport = " + name);
    }

    @Override
    public void speedOfTransport(double currentSpeed) {

    }

    @Override
    public void weightOfTransport(double weight) {

    }

    @Override
    public void countOfPassenger(int countOfPassenger) {

    }

    @Override
    public void countOfWheel(int countOfWheel) {

    }
}
