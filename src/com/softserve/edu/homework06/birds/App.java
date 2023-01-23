package com.softserve.edu.homework06.birds;

public class App {

    public static void main(String[] args) {
        Bird[] birds = {new Chicken(), new Eagle(), new Penguin(), new Swallow()};
        for (Bird obj:birds
             ) {
            System.out.print("I am " + obj + ". ");
            obj.fly();
        }
    }
}
