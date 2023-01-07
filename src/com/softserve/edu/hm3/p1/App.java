package com.softserve.edu.hm3.p1;

import java.util.Scanner;

public class App {
    static public void main(String[] str) {
        Scanner sc = new Scanner(System.in);

        Person[] massOfPerson = new Person[5];

        for (int i = 0; i < 5; i++) {
            massOfPerson[i] = new Person();
            massOfPerson[i].input(sc);
        }

        for (Person el : massOfPerson) {
            el.output();
        }

        sc.close();
    }
}
