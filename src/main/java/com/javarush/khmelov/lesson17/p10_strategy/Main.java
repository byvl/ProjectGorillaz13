package com.javarush.khmelov.lesson17.p10_strategy;

import java.io.File;

public class Main {

    public static void main(String[] args) {
        UserChecker userChecker = new UserChecker();
        userChecker.check(new DBAuth("jdbc://etc"));
        userChecker.check(new FileAuth(new File("c:\\file.txt")));
    }
}
