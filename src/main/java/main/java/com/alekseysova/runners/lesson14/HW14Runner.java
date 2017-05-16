package main.java.com.alekseysova.runners.lesson14;

import main.java.com.alekseysova.app.homework.lesson14.Daisy;
import main.java.com.alekseysova.app.homework.lesson14.Rose;
import main.java.com.alekseysova.app.homework.lesson14.Tulip;

import javax.xml.bind.SchemaOutputResolver;

/**
 * Created by AlekseySova 5/9/2017.
 */
public class HW14Runner {
    public static void main(String[] args) {

        //Create object of flowers
        Daisy daisy = new Daisy("Daisy",1,
                "Yellow");
        Rose rose = new Rose("Rose",4,
                "Red");
        Tulip tulip = new Tulip("Tulip",4,
                "Red");
        // count number of flowers
        int countOfBouquet = daisy.getCountOfFlowers() +
                tulip.getCountOfFlowers() + rose.getCountOfFlowers();

        //Count of flowers
        System.out.println("Count of Flowers in bouquet " + countOfBouquet);
        //Print what flowers we have in bouquet
        System.out.println("Bouquet consist of" + daisy.addToBouquet() +
        rose.addToBouquet() + tulip.addToBouquet());

    }
}
