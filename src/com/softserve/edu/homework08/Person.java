package com.softserve.edu.homework08;
//Создайте абстрактный класс Person с полем fullName типа FullName и age типа int.
abstract class Person {
    private FullName fullName;
    private int age;

    public Person(FullName fullName, int age){
        this.fullName=fullName;
        this.age=age;
    }
    public String info(){
        return "First name: " + fullName.getFirstName() + ", Last name: "
                + fullName.getLastName() + ", Age: " + age;
    }
    abstract public String activity();
}
