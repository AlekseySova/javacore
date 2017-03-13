package main.java.com.alekseysova.app.utils.convertors;

/**
 * Created by AlekseySova on 3/11/2017.
 */
public class PrimitiveConvertor {

    char char1 = 'w';
    int int1 = 45;
    float float1 = 66.3f;


    public void floatToChar(){
        char1 = (char) float1;
        System.out.println("Input float value is " + float1 );
        System.out.println("Output char value is " + char1 );
    }
    public void intToChar(){
        char1 = (char) int1;
        System.out.println("Inpit int value is " + int1 );
        System.out.println("Output char value is " + char1);
    }
    public void charToint(){
        int1 = char1;
        System.out.println("Input char value is " + char1);
        System.out.println("Output integer value is " + int1);
    }

}
