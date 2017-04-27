package main.java.com.alekseysova.app.homework.lesson10;

import java.util.Scanner;

/**
 * Created by pc on 4/15/2017.
 */
public class HomeTask5Caesar {
    // Coding and decoding of massage by Caesar method
    public String cipherCaeser(String cipherString, int cipherKey, boolean isEncode) {
        String enCode1 = "ABCDEFGHIJKLMNOPQRSTUVWXYZ ?@$^()[]<~ABCDEFGHIJKLMNOPQRSTUVWXYZ ?@$^()[]<~";
        String enCode2 = "abcdefghijklmnopqrstuvwxyz=!#%&*{}'>~abcdefghijklmnopqrstuvwxyz=!#%&*{}'>~";
        StringBuilder stringBuilder = new StringBuilder();
        String resCode = "";

        if (isEncode == true) {
            for (int i = 0; i < cipherString.length(); i++) {
                for (int j = 0; j < enCode1.length()/2; j++) {
                    if (cipherString.charAt(i) == enCode1.charAt(j)) {
                        stringBuilder.append(enCode1.charAt(j + cipherKey));
                    }
                    if (cipherString.charAt(i) == enCode2.charAt(j)) {
                        stringBuilder.append(enCode2.charAt(j + cipherKey));
                    }
                }
            }
            resCode = stringBuilder.toString();
        }

        if (isEncode == false) {
            int start = enCode1.length()/2;
            for (int i = 0; i < cipherString.length(); i++) {
                for (int j = start; j < enCode1.length(); j++) {
                    if (cipherString.charAt(i) == enCode1.charAt(j)) {
                        stringBuilder.append(enCode1.charAt(j - cipherKey));
                    }
                    if (cipherString.charAt(i) == enCode2.charAt(j)) {
                        stringBuilder.append(enCode2.charAt(j - cipherKey));
                    }
                }
            }
            resCode = stringBuilder.toString();

        }
        return resCode;
    }
}