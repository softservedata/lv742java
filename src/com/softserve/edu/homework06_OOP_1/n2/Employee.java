package com.softserve.edu.homework06_OOP_1.n2;
class Employee {
    private String name;
    private int age;
    private String PosAtWork;
    private double salary;
    public Employee(String name, int age,String  PosAtWork, double salary){
        this.name=name;
        this.age=age;
        this.salary=salary;
        this.PosAtWork=PosAtWork;
    }

    public String getName() {
        return name;
    }

    public String getPosAtWork() {
        return PosAtWork;
    }

    public void setPosAtWork(String posAtWork) {
        PosAtWork = posAtWork;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String report(){
        return String.format("Name: "+name+"; Age: "+age+
                "; Position at work: "+PosAtWork+"; Salary: "+salary);
    }
}
