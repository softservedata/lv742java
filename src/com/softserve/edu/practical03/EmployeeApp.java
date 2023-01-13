package com.softserve.edu.practical03;

import com.softserve.edu.practical03.model.Employee;
import com.softserve.edu.practical03.service.EmployeeService;
import com.softserve.edu.practical03.utils.*;

import java.util.Scanner;

public class EmployeeApp {

    static double salary1;
    static double salary2;
    static double salary3;
    static double[] salaryArr;

    static String roundTotalSum;
    static double totalSum;

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        EmployeeService employeeService = new EmployeeService();

        Employee employee1 = new Employee();
        setInfoEmployee(employee1, scan);
        salary1 = getEmployeeSalary(employeeService, employee1);

        Employee employee2 = new Employee();
        setInfoEmployee(employee2, scan);
        salary2 = getEmployeeSalary(employeeService, employee2);

        Employee employee3 = new Employee();
        setInfoEmployee(employee3, scan);
        salary3 = getEmployeeSalary(employeeService, employee3);

        salaryArr = new double[]{salary1, salary2, salary3};
        processData(employeeService, salaryArr);
        showInfo();
        scan.close();
    }

    private static void setInfoEmployee(Employee employee, Scanner scan) {
        System.out.print(Constants.NAME_INPUT_MSG);
        employee.setName(ValidatorName.validateName(scan));
        System.out.print(Constants.RATE_INPUT_MSG);
        employee.setRate(ValidatorRate.validateRate(scan));
        System.out.print(Constants.HOURS_INPUT_MSG);
        employee.setHours(ValidatorHours.validateHours(scan));
        System.out.println(Constants.LINE);
    }

    private static double getEmployeeSalary(EmployeeService employeeService, Employee employee) {
        double salary = employeeService.getSalary(employee.getRate(), employee.getHours());
        return salary;
    }

    private static String processData(EmployeeService employeeService, double[] salaryArr) {
        Employee.setTotalSum(employeeService.calcTotalSum(salaryArr));
        totalSum = Employee.getTotalSum();
        roundTotalSum = Rounder.roundValue(totalSum);
        return roundTotalSum;
    }

    private static void showInfo() {
        System.out.println(Constants.SHOW_INFO_MSG + roundTotalSum);
    }
}
