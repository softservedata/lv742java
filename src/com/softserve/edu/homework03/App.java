package com.softserve.edu.homework03;

public class App {

    public static void main(String[] args) {
        //In the main() create 5 objects of Person type and input information about them
        person olek = new person();
        olek.input("Oleksandr", "Bolt",1996);

        person ser = new person();
        ser.input("Serhii", "Bolt", 2005);

        person ir = new person();
        ir.input("Irena", "Maksymova", 1998);

        person kt = new person();
        kt.input("Katya", "Hoffman", 1996);

        person yn = new person();
        yn.input("Yana", "Shcherbakova", 1999);

        System.out.println("Person 1 = " + ir);
        System.out.println("Person 2 = " + yn);
        System.out.println("Person 3 = " + olek);
        System.out.println("Person 4 = " + kt);
        System.out.println("Person 5 = " + ser);
    }
}
