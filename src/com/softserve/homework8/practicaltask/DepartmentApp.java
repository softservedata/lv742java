package com.softserve.homework8.practicaltask;

import java.util.ArrayList;
import java.util.List;

public class DepartmentApp {

    public static void main(String[] args) throws CloneNotSupportedException {

        Department ifDept = new Department("Math", new Department.Address(
                "Ivano-Frankivsk",
                "Hrushevskoho",
                4));
        Department lvivDept = (Department) ifDept.clone();
        lvivDept.getAddress().setCity("Lviv");

        List<Department> departments = new ArrayList<>();
        departments.add(ifDept);
        departments.add(lvivDept);

        for (Department department : departments) {
            System.out.println(department);
        }
    }
}
