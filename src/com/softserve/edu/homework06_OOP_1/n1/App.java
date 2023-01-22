package com.softserve.edu.homework06_OOP_1.n1;

public class App {

    public static void main(String[] args) {
      Bird[] birds = {new Eagle(), new Swallow(), new Penguin(), new Chicken()};
        for (Bird bird : birds) {
                bird.fly();

                System.out.println(": says "+bird);

            if(bird.feathers==false) {
                System.out.println("Without feathers :"+bird+" ''BUT IT'S NOT CORRECT''");
            }

        }
    }
}
