package main.java.com.alekseysova.app.homework.lesson12;

/**
 * Created by AlekseySova on 5/3/2017.
 */
public class Bicycle {
    int Speed;
    int Gear;

    public int getSpeed() {
        return Speed;
    }

    public void setSpeed(int speed) {
        Speed = speed;
    }

    public int getGear() {
        return Gear;
    }

    public void setGear(int gear) {
        Gear = gear;
    }

    public void ride(){
        System.out.println("Wroom");
    }
}
