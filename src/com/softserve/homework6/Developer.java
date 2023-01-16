package com.softserve.homework6;

public class Developer extends Employee{

    private String position;

    public Developer(String position, String name, int age, double salary) {
        super(name, age, salary);
        this.position = position;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    @Override
    public String report() {
        return String.format("Name: %s, Position: %s, Age: %d, Salary: \u20B4 %.2f",
                getName(), position, getAge(), getSalary());
    }
}
