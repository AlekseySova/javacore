package main.java.com.alekseysova.app.homework.lesson12;

/**
 * Created by AlekseySova on 5/3/2017.
 */
public class BicycleWithRing extends CustomBicycle implements BicycleWithRingInterface {
    public BicycleWithRing(int Speed, int Gear) {
        super(Speed, Gear);
    }

    @Override
    public void ring() {
        System.out.println("Di-ling!");
    }
}
