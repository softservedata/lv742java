package com.softserve.edu.hm13;

import java.time.LocalDate;

public class App4 {
    public static void main(String[] args) {
        LocalDate birthday = LocalDate.now().
                withYear(1987).withMonth(1).withDayOfMonth(28);
        System.out.println("My birthday is " + birthday);
    }
}
