package main.java.com.alekseysova.runners.lesson15;

import main.java.com.alekseysova.app.homework.lesson15.*;

/**
 * Created by AlekseySova on 5/15/2017.
 */
public class HW15Task2Runner {
    public static void main(String[] args) {

        Door door1 = new Door();
        Couch couch1 = new Couch("Living Room", "Red");
        Couch couch2 = new Couch("Bed Room" , "White");
        TV tv1 = new TV("LED" , 40);
        Flat flat = new Flat(34,3,door1);
        House house1 = new House("Peremoge street", 5, 5, flat );

        System.out.println("House info:");
        house1.
                showLocationAndNum(house1.getLocation(),house1.getHouseNum(),house1.getCountOfLevel());

        System.out.println("Flat info:");
        house1.
                getFlat()
                .pringFlatInfo(flat.getFlatNumber(), flat.getCountOfRooms());

        System.out.println("Door info before change: ");
        house1.
                getFlat().
                getEnterDoor().
                printDoorState(door1.getIsDoorLock());

        System.out.println("Open the door");
        house1.
                getFlat().
                getEnterDoor().
                setIsDoorLock(false);

        System.out.println("Door info after change: ");
        house1.
                getFlat().
                getEnterDoor().
                printDoorState(door1.getIsDoorLock());

        System.out.println("Buy bedroom couch");
        house1.
                getFlat().
                setBedRoomCouch(couch2);

        System.out.println("Bedroom couch info:");
        house1.
                getFlat().
                getBedRoomCouch().
                pringInfo(couch2.getName(),couch2.getColor());

        System.out.println("Buy livingroom couch");
        house1.
                getFlat().
                setLivingRoomCouch(couch1);

        System.out.println("Livingroom couch info: ");
        house1.
                getFlat().
                getLivingRoomCouch().
                pringInfo(couch1.getName(),couch1.getColor());

        System.out.println("Buy TV");
        house1.
                getFlat().
                setTv(tv1);

        System.out.println("Tv info:");
        house1.
                getFlat().
                getTv().
                printTVInfo(tv1.getType(), tv1.getDimension());

    }
}
