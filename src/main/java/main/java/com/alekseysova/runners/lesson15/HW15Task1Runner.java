package main.java.com.alekseysova.runners.lesson15;

import main.java.com.alekseysova.app.homework.lesson15.FootballClub;

/**
 * Created by AlekseySova on 5/10/2017.
 */
public class HW15Task1Runner {
    public static void main(String[] args) {
        //Create object football club
        FootballClub club1 = new FootballClub("Barcelona",
                "Barcelona.Avda. Del Sol s / n 08970 Sant Joan Despi",
                26,4);

        FootballClub club2 = new FootballClub("Real Madrid",
                "SANTIAGO BERNABÉU STADIUM Avenida Concha Espina",
                26,4);

        FootballClub club3 = new FootballClub("Manchaster United",
                "Manchester",35,9);

        //Print names of football clubs
        club1.showName();

        club2.showName();

        club3.showName();

        //Print locations of football clubs
        club1.showLocation();

        club2.showLocation();

        club3.showLocation();

        //Print statistic of each football club
        club1.showStatistic();

        club2.showStatistic();

        club3.showStatistic();
    }
}
