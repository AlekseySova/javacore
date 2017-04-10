package main.java.com.alekseysova.app.homework.lesson9;

import java.util.Scanner;

/**
 * Created by AlekseySova on 4/8/2017.
 */
public class HomeTask1 {
    public String homeTask1Method(int selectNum, String stringPal){

        String resString = "";
        stringPal = stringPal.toLowerCase();

        switch(selectNum){
            case 1:
                System.out.println("Method #1");
                boolean isPalindrome = true;
                //Compare first part of string with second.
                for(int i = 0; i < stringPal.length()/2; i++){
                    isPalindrome = isPalindrome && (stringPal.charAt(i) ==
                            stringPal.charAt(stringPal.length()-i-1));
                }
                //If first part with second part are equal then string is Palindrome
                if(isPalindrome){
                    resString = "Palindrome";
                }
                else{
                    resString = "Not Palindrome";
                }
                break;
            case 2:
                System.out.println("Method #2");
                StringBuilder stringBuilder = new StringBuilder(stringPal);
                // Reverse origin string
                stringBuilder.reverse();
                // If reversed string equal with original then string is Palindrome
                if(stringPal.equals(stringBuilder.toString())){
                    resString = "Palindrome";
                }
                else{
                    resString = "Not Palindrome";
                }
                break;
            case 3:
                System.out.println("Method #3");
                stringPal = stringPal.replaceAll("\\s+","");
                // Reverse origin string
                String reverse = new StringBuffer(stringPal).reverse().toString();
                // If reversed string equal with original then string is Palindrome
                if(stringPal.equals(reverse)){
                    resString = "Palindrome";
                }
                else{
                    resString = "Not Palindrome";
                }
                break;
            default:
                System.out.println("You enter" + selectNum + ".");

        }

        return resString;
    }
}
