package com.softserve.edu04.part2;

public class Appl {
    public static void main(String[] args) {
        Dog d1 = new Dog("Richi", Breed.KANECORSO, 1);
        Dog d2 = new Dog("Kira", Breed.LABRADOR, 2);
        Dog d3 = new Dog("Kira", Breed.DOBERMAN, 5);

        if (d1.equals(d2)){
            System.out.println("Dog1 and Dog2 have the same name: " + d1.getName());
        } else if (d1.equals(d3)) {
            System.out.println("Dog1 and Dog3 have the same name: " + d1.getName());
        } else if (d2.equals(d3)) {
            System.out.println("Dog2 and Dog3 have the same name: " + d2.getName());
        }

        if (d1.getAge() > d2.getAge() && d1.getAge() > d3.getAge()){
            System.out.println("The oldest " + d1);
        } else if (d2.getAge() > d1.getAge() && d2.getAge() > d3.getAge()) {
            System.out.println("The oldest " + d2);
        } else if (d3.getAge() > d1.getAge() && d3.getAge() > d2.getAge()) {
            System.out.println("The oldest " + d3);
        }
    }
}
