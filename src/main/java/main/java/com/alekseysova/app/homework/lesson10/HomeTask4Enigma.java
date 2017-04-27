package main.java.com.alekseysova.app.homework.lesson10;

import java.util.Scanner;

/**
 * Created by AlekseySova on 4/14/2017.
 */
public class HomeTask4Enigma {
    //Codeing of massage
    public String enCode(String input){
        HomeTask4Enigma cipherWork = new HomeTask4Enigma();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter your word");
        System.out.println(" = ");

        String userString = scanner.nextLine();

        String enCodeString = "1234567890abcdefghijlmnopqrstuvwxyz!@#$%^&*()-+=_{}[] <>,./?|~`ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String deCodeString = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijlmnopqrstuvwxyz1234567890!@#$%^&*()-+=_{}[] <>,./?|~`";

        String resCode = cipherWork.cipher(userString, deCodeString, enCodeString);

        return resCode;
    }
    //Code and decode user massage
    public String cipher(String cipherString, String decodeString,String encodedString){

        StringBuilder stringBuilder = new StringBuilder();

        for(int i =0; i < cipherString.length(); i++){
            for(int j = 0; j < decodeString.length(); j++){
                if(cipherString.charAt(i) == decodeString.charAt(j)){
                    stringBuilder.append(encodedString.charAt(j));
                }
            }
        }

        String resCode = stringBuilder.toString();
        return resCode;
    }
    // Decoding of massage
    public String deCode(String input){
        HomeTask4Enigma cipherWork = new HomeTask4Enigma();


        String deCodeString = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijlmnopqrstuvwxyz1234567890!@#$%^&*()-+=_{}[] <>,./?|~`";
        String enCodeString = "1234567890abcdefghijlmnopqrstuvwxyz!@#$%^&*()-+=_{}[] <>,./?|~`ABCDEFGHIJKLMNOPQRSTUVWXYZ";

        String resCode = cipherWork.cipher(input, enCodeString, deCodeString);

        return resCode;
    }
}
