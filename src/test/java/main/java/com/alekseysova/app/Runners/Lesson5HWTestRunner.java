package main.java.com.alekseysova.app.Runners;

import main.java.com.alekseysova.app.homework.lesson5.Lesson5HWTest;
import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

/**
 * Created by pc on 3/22/2017.
 */
public class Lesson5HWTestRunner {
    public static void main(String[] args) {
        Result result = JUnitCore.runClasses(Lesson5HWTest.class);

        for(Failure failure : result.getFailures()){
            System.out.println(failure.toString());
        }
        System.out.println(result.wasSuccessful());
    }

}
