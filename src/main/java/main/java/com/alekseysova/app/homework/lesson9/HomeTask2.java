package main.java.com.alekseysova.app.homework.lesson9;

import java.util.Arrays;

/**
 * Created by AlekseySova on 4/10/2017.
 */
public class HomeTask2 {
    public String homeTask2Method(int selectNum, String stringPal){
        HomeTask1 homeWork = new HomeTask1();
        String resString = "";
        stringPal = stringPal.toLowerCase();

        switch(selectNum){
            case 1:
                resString = homeWork.homeTask1Method(1,stringPal);
                break;
            case 2:
                resString = homeWork.homeTask1Method(2,stringPal);
                break;
            case 3:
                resString = homeWork.homeTask1Method(3,stringPal);
                break;
            case 4:
                char []  charPal4= stringPal.toCharArray();
                char []  charRevers = new char[charPal4.length];
                int k = charPal4.length - 1;
                System.out.println("Method #4");
                //Reverse origin string
                for (int i = 0; i < charPal4.length; i++){
                    charRevers[i] = charPal4[k];
                    k--;
                }
                // If reversed string equal with original then string is Palindrome
                if(Arrays.equals(charPal4,charRevers)){
                    resString = "Palindrome";

                }
                else{
                    resString = "Not Palindrome";
                }

                break;
            case 5:
                char[] charPal5 = stringPal.toCharArray();

                int low = 0;
                int high = charPal5.length - 1;

                System.out.println("Method #5");
                //Reverse origin string by XOR operation
                while (low < high) {
                    charPal5[low] = (char) (charPal5[low] ^ charPal5[high]);
                    charPal5[high] = (char) (charPal5[low] ^ charPal5[high]);
                    charPal5[low] = (char) (charPal5[low] ^ charPal5[high]);
                    low++;
                    high--;
                }
                // If reversed string equal with original then string is Palindrome
                if(Arrays.equals(stringPal.toCharArray(),charPal5)){
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
