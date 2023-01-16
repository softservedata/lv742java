package com.softserve.edu.homework04.task2.service;

import com.softserve.edu.homework04.task2.model.Dog;

public class DogCheck {

    public static boolean checkNames(Dog[] dogs) {

        for (int i = 0; i < dogs.length; i++) {
            for (int j = 0; j < i; j++) {
                if (dogs[i].equals(dogs[j])) return true;
            }
        }
        return false;
    }

    public static void showOldestDog(Dog[] dogs) {
        Dog dogMaxAge = dogs[0];
        for (int i = 0; i < dogs.length; i++) {
            if (dogs[i].getAge() > dogMaxAge.getAge()) {
                dogMaxAge = dogs[i];
            }
        }
        System.out.println(dogMaxAge.toString());
    }
}
