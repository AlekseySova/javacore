package main.java.com.alekseysova.app.homework.lesson14;

/**
 * Created by AlekseySova on 5/9/2017.
 */
public class Tulip extends Flowers {
    // Get variable from parent class
    public Tulip(String name, int countOfFlowers, String color) {
        super(name, countOfFlowers, color);
    }

    @Override
    public String addToBouquet(){

        int countOfFlowers = getCountOfFlowers();
        String name = getName();
        String bouquet = " ";
        System.out.println();
        if(countOfFlowers == 1) {
            bouquet = " " + countOfFlowers + " " + name;
        }else{
            bouquet = " " + countOfFlowers + " " + name + "s";
        }

        return bouquet;
    }
}
