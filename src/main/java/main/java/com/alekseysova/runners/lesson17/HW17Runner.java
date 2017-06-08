package main.java.com.alekseysova.runners.lesson17;

import main.java.com.alekseysova.app.homework.lesson17.GuessGameData;

import java.util.Random;
import java.util.Scanner;

/**
 * Created by AlekseySova on 6/5/2017.
 */
public class HW17Runner {

    private static final Random random = new Random();

    public static <T extends Enum<?>> T randomEnum(Class<T> clazz) {
        int x = random.nextInt(clazz.getEnumConstants().length);
        return clazz.getEnumConstants()[x];
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        Enum enEnum;

        String line;

        int age;
        int counter = 0;

        while (counter < 3) {

            enEnum = randomEnum(GuessGameData.class);

            line = enEnum.toString();

            System.out.println("What the age of this person = \"" + line + "\"");

            age = scanner.nextInt();

            for (GuessGameData guess : GuessGameData.values()) {

                if (line.equals(guess.toString())) {

                    if (age == guess.getAge()) {

                        System.out.println("Your guess is right!!!");
                        counter += 1;
                    } else {

                        System.out.println("You guess is wrong");
                    }
                }
            }

            if (counter >= 3) {

                System.out.println("You win!!!");
            }
        }
    }
}
