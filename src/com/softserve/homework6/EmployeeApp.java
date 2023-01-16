package com.softserve.homework6;

public class EmployeeApp {

    public static void main(String[] args) {
        Employee[] employees = createObj();
        output(employees);
    }

    private static void output(Employee[] employees) {
        for (Employee employee : employees) {
            System.out.println(employee.report());
        }
    }

    private static Employee[] createObj() {
        Employee liam = new Employee("Liam", 33, 11558999.434443);
        Employee jacob = new Developer("Java developer", "Jacob", 33, 4543345);
        return new Employee[] {liam, jacob};
    }
}
