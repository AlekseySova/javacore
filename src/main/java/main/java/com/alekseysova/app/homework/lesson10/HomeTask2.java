package main.java.com.alekseysova.app.homework.lesson10;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by pc on 4/13/2017.
 */
public class HomeTask2 {
    //Form user data extract only alphabetical sign
    public String homeTask2Method(String input, String delim) {
        StringBuilder stringBuilder = new StringBuilder();

        String[] userString = input.split(delim);

        for(int i= 0; i < userString.length;i++){
            if(userString[i].matches("[A-Za-z]")){
                stringBuilder.append(userString[i]);
            }
        }

        String resString = stringBuilder.toString();
        return resString;
    }
}
