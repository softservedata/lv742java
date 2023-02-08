package com.softserve.edu06.part2;

import java.util.Objects;

public class Developer extends Employee{
    private String position;

    public Developer(String name, int age, String position, double salary){
        super(name, age, salary);
        this.position = position;
    }

    public Developer(){
        super();
        position = "";
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    @Override
    public String report(){
        return String.format("Name: %s, Age: %d, Position: %s, Salary: $ %.2f.", getName(), getAge(),getPosition(), getSalary());
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Developer developer = (Developer) o;
        return Objects.equals(position, developer.position);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), position);
    }
}
