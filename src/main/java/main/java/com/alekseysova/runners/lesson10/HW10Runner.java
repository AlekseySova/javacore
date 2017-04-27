package main.java.com.alekseysova.runners.lesson10;

/**
 * Created by pc on 4/15/2017.
 */
public class HW10Runner {

    public static void main(String[] args) {
        System.out.println("#1 Sorted input user array with delimiter");
        System.out.println("");
        HW10Task1Runner.main(null);

        System.out.println("#2 Return only alphabetical sings form user input");
        System.out.println("");

        HW10Task2Runner.main(null);

        System.out.println("#3 Return string array splitted by keyword");
        System.out.println("");

        HW10Task3Runner.main(null);

        System.out.println("#4 Return coded and decoded data by enigma method");
        System.out.println("");

        HW10Task4EnigmaRunner.main(null);

        System.out.println("#5 Return coded and decoded data by caesar method");

        HW10Task5CaesarRunner.main(null);
    }
}
