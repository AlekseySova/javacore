package main.java.com.alekseysova.app.utils.runners;

import main.java.com.alekseysova.app.utils.convertors.PrimitiveConvertor;

/**
 * Created by pc on 3/11/2017.
 */
public class Lesson3Runner {
    public static void main(String[] args) {
        PrimitiveConvertor convertor = new PrimitiveConvertor();
        convertor.floatToChar();
        convertor.charToint();
        convertor.intToChar();
    }
}
