package main.java.com.alekseysova.app.homework.lesson12;

/**
 * Created by AlekseySova on 5/3/2017.
 */
public class CustomBicycle extends Bicycle {
    public CustomBicycle(int Speed, int Gear) {
        super.Speed = Speed;
        super.Gear = Gear;
    }
    @Override
    public void ride(){
        System.out.println("Wshhhh!");
    }
}
