package main.java.com.alekseysova.app.homework.lesson13;

/**
 * Created by AlekseySova on 5/3/2017.
 */
public class Human {
    //Create class Human
    //With variable name and age
    private String name;
    private int Age;

    public Human(String name, int age) {
        this.name = name;
        Age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return Age;
    }

    public void setAge(int age) {
        if(age < 0 && age <= 120 ){
            System.out.println("New age satted");
        }
        else{
            System.out.println("Age invalid");
        }
    }
}
