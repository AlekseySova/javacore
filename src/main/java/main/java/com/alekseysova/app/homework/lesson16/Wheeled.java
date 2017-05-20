package main.java.com.alekseysova.app.homework.lesson16;

/**
 * Created by AlekseySova on 5/16/2017.
 */
public class Wheeled extends Tractor {
    public Wheeled(String name, double currentSpeed) {
        super(name, currentSpeed);
    }
    //Print name of wheeled transport
    public void printTransportName(String name){
        System.out.println("Name of Wheeled transport = " + name);
    }

    //Print current speed of wheeled transport
    @Override
    public void speedOfTransport(double currentSpeed) {
        if((currentSpeed <= MAXSPEED) && (currentSpeed >= MINSPEED)) {
            System.out.println("Current speed of transport = " + currentSpeed);
        }
        else{
            System.out.println("Wrong value of speed");
        }
    }

    //Print weight of wheeled transport
    @Override
    public void weightOfTransport(double weight) {
        System.out.println("Weight of Transport = " + weight + " kg");

    }

    //Print count of passenger of wheeled transport
    @Override
    public void countOfPassenger(int countOfPassenger) {
        //Use constant to verify
        if((countOfPassenger <= MAXPASSANGER) && (countOfPassenger >= MINPASSANGER)) {
            System.out.println("Count of passenger = " + countOfPassenger);
        }
        else{
            System.out.println("Wrong count of passenger");
        }
    }

    //Print count of wheels of wheeled transport
    @Override
    public void countOfWheel(int countOfWheel) {
        System.out.println("Count of wheel = " + countOfWheel);
    }

}
