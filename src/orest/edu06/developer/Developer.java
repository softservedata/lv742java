package orest.edu06.developer;

import orest.edu06.employee.Employee;

public class Developer extends Employee {
    private String position;

    public Developer(String name, int age, double salary, String position) {
        super(name, age, salary);
        this.position = position;
    }

    @Override
    public String report() {
        return String.format("Name: %s, Age: %d, Position: %s, Salary: $%.2f",
                getName(), getAge(), position, getSalary());
    }
}
