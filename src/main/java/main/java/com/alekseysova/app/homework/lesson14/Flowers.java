package main.java.com.alekseysova.app.homework.lesson14;

import java.util.ArrayList;

/**
 * Created by AlekseySova on 5/9/2017.
 */
public class Flowers {

    private int countOfFlowers;
    private String color;
    private String name;


    public Flowers(String name ,int countOfFlowers, String color ) {
        this.countOfFlowers = countOfFlowers;
        this.color = color;
        this.name = name;
    }

    public int getCountOfFlowers() {
        return countOfFlowers;
    }

    public void setCountOfFlowers(int countOfFlowers) {
        this.countOfFlowers = countOfFlowers;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String addToBouquet(){

        String flowerInfo = "A bunch of flowers";
        System.out.println(flowerInfo);

        return flowerInfo;
    }

}
