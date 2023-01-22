package com.softserve.edu.homework06_OOP_1.n2;
class Developer extends Employee{
    Developer(String name, int age, String PosAtWork, double salary){
        super(name, age, PosAtWork,salary);
    }
    @Override
    public String report() {
        return "Name: " + getName() + "; Age: " + getAge() +
                "; years, Position: " + getPosAtWork() + "; Salary: " + getSalary();
    }

    @Override
    public String getName() {
        return super.getName();
    }

    @Override
    public String getPosAtWork() {
        return super.getPosAtWork();
    }

    @Override
    public int getAge() {
        return super.getAge();
    }

    @Override
    public double getSalary() {
        return super.getSalary();
    }
}
