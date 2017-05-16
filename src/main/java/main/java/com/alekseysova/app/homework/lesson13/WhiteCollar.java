package main.java.com.alekseysova.app.homework.lesson13;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by AlekseySova on 5/3/2017.
 */
public class WhiteCollar extends Human {
    String companyName;
    public WhiteCollar(String name, int age, String company) {
        super(name, age);
        this.companyName = company;
    }

    public void setCompany(String company) {
        Pattern p = Pattern.compile("[A-za-z -,]");
        Matcher m = p.matcher(company);
        if(m.find()) {
            this.companyName = company;
        }
        else{
            System.out.println("Invalid name of Company");
        }
    }

    public String getCompanyName() {
        return companyName;
    }
}
