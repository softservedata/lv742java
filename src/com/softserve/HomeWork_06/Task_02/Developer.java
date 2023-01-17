package com.softserve.HomeWork_06.Task_02;

public class Developer extends Employee {
    private String position;

    public Developer(String name, int age, String position, double salary) {
        super(name, age, salary);
        this.position = position;
    }

    @Override
    public String report() {
        return "Developer -> name = " + getName() + ", age = " + getAge() + ", position = " + position + ", salary = " + getSalary() + ".";
    }
}
