package com.softserve.PracticalTask_03;

public class Employee {
    private String name;
    private double rate;
    private double hours;
    private static double totalSum;

    //Getters:
    public String getName() {
        return name;
    }

    public double getRate() {
        return rate;
    }

    public double getHours() {
        return hours;
    }

    public static double getTotalSum() {
        return totalSum;
    }

    //Constructors:
    public Employee() {
    }

    public Employee(double rate, double hours) {
        this.rate = rate;
        this.hours = hours;
        totalSum = totalSum + getSalary();
    }

    public Employee(String name, double rate, double hours) {
        this.name = name;
        this.rate = rate;
        this.hours = hours;
        totalSum = totalSum + getSalary();
    }

    //Methods:
    public double getSalary() {
        return rate * hours;
    }

    @Override
    public String toString() {
        return "Employee: " +
                "name - " + name +
                ", rate - " + rate +
                ", hours - " + hours + "";
    }

    public double getBonuses() {
        return getSalary() * 0.1;
    }

    public static void main(String[] args) {
        Employee ivan = new Employee("Ivan", 20, 100);
        Employee igor = new Employee("Igor", 50, 45);
        Employee stepan = new Employee("Stepan", 30, 75);
        System.out.println(Employee.getTotalSum());
    }
}
