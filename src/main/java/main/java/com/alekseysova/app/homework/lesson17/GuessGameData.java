package main.java.com.alekseysova.app.homework.lesson17;

/**
 * Created by AlekseySova on 6/4/2017.
 */
public enum GuessGameData {

    HUGH_JACKMAN(48), BARAC_OBAMA(55), DONALD_TRUMP(70), RIHANNA(29),
    DAVID_BECKHAM(42), CRISTIANO_RONALDO(32), OPRAH_WINFREY(63),
    STEVEN_SPIELBERG(70), BILL_CLINTON(70), JENNIFER_LOPEZ(47),
    EMINEM(44), WILL_SMITH(48), TOM_CRUISE(54), MICK_JAGGER(73),
    GEORGE_LUCAS(73), ROBERT_DE_NIRO(73), NICOLE_KIDMAN(49), JAY_Z(47),
    PARIS_HILTON(36), BRITNEY_SPEARS(35), TIGER_WOODS(41), MICHAEL_JORDAN(54),
    MADONNA(58);

    private int Age;

    GuessGameData(int age) {
        Age = age;
    }

    public int getAge() {
        return Age;
    }
}

