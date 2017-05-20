package main.java.com.alekseysova.app.homework.lesson16;

/**
 * Created by AlekseySova on 5/16/2017.
 */
public class Crawler extends Tractor {
    public Crawler(String name, double currentSpeed) {
        super(name, currentSpeed);
    }

    public void printTransportName(String name){
        System.out.println("Name of Wheeled transport = " + name);
    }

    @Override
    public void speedOfTransport(double currentSpeed) {
        if((currentSpeed <= MAXSPEED) && (currentSpeed >= MINSPEED)) {
            System.out.println("Current speed of transport = " + currentSpeed);
        }
        else{
            System.out.println("Wrong value of speed");
        }
    }

    @Override
    public void weightOfTransport(double weight) {
        System.out.println("Weight of Transport = " + weight + " kg");

    }

    @Override
    public void countOfPassenger(int countOfPassenger) {

        if((countOfPassenger <= MAXPASSANGER) && (countOfPassenger >= MINPASSANGER)) {
            System.out.println("Count of passenger = " + countOfPassenger);
        }
        else{
            System.out.println("Wrong count of passenger");
        }
    }

    @Override
    public void countOfWheel(int countOfWheel) {
        System.out.println("Count of сaterpillars = " + countOfWheel);
    }
}
