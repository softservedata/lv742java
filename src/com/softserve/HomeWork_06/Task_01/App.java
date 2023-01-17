package com.softserve.HomeWork_06.Task_01;

public class App {
    public static void main(String[] args) {
        FlyingBird eagle = new Eagle(true, true);
        FlyingBird swallow = new Swallow(true, true);
        NonFlyingBird penguin = new Penguin(true, true);
        NonFlyingBird chicken = new Chicken(true, true);
        Bird[] bird = {eagle, swallow, penguin, chicken};

        System.out.println("Eagle can fly = " + eagle.fly() + ".");
        System.out.println("Swallow can fly = " + swallow.fly() + ".");
        System.out.println("Penguin can fly = " + penguin.fly() + ".");
        System.out.println("Chicken can fly = " + chicken.fly() + ".\n");
        for (Bird value: bird) {
            System.out.println(value);
        }
    }
}
