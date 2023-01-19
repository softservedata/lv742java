package com.softserve.homework7;

import java.util.Arrays;
import java.util.Comparator;

public class EmployeeService {

    public Employee[] createEmployees() {
        Employee salariedEmployee1 = new SalariedEmployee(7, "Rebecca",
                "Wilson", 4435, 33, "designer");
        Employee salariedEmployee2 = new SalariedEmployee(9, "Jerry",
                "Hawking", 1111, 33, "designer");
        Employee contractEmployee1 = new ContractEmployee(5, "Oksana",
                "Baron", "designer", 33, 99, false);
        Employee contractEmployee2 = new ContractEmployee(6, "Maria",
                "Miles", "designer", 33, 433, false);
        return new Employee[] {salariedEmployee1, salariedEmployee2, contractEmployee1, contractEmployee2};
    }


    public void sortBySalary(Employee[] employees) {
        Arrays.sort(employees, new Comparator<Employee>() {
            @Override
            public int compare(Employee o1, Employee o2) {
               if(o1 instanceof Payment && o2 instanceof Payment) {
                   return Double.compare(((Payment) o2).calculatePay(), ((Payment) o1).calculatePay());
               }
                return 0;
            }
        });
    }

    public void output() {
        Employee[] employees = createEmployees();
        sortBySalary(employees);
        for (Employee employee : employees) {
            if(employee instanceof ContractEmployee) {
                long employeeId = employee.getEmployeeId();
                System.out.println("Employee: id "
                        + employeeId
                        + ", name "
                        + ((ContractEmployee) employee).getFirstName()
                        + " "
                        + ((ContractEmployee) employee).getLastName()
                        + ", average monthly payment: "
                        + ((ContractEmployee) employee).calculatePay()) ;
            }
            if(employee instanceof SalariedEmployee) {
                long employeeId = employee.getEmployeeId();
                System.out.println("Employee: id "
                        + employeeId
                        + ", name "
                        + ((SalariedEmployee) employee).getFirstName()
                        + " "
                        + ((SalariedEmployee) employee).getLastName()
                        + ", average monthly payment: "
                        + ((SalariedEmployee) employee).calculatePay()) ;
            }
        }
    }


}
