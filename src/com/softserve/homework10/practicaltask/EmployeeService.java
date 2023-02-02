package com.softserve.homework10.practicaltask;

import java.util.*;

public class EmployeeService {

    public List<Employee> createEmployees() {
        List<Employee> employees = List.of(
                new Employee("John", 33),
                new Employee("Inna", 5),
                new Employee("Rebecca", 5534),
                new Employee("Michael", 133),
                new Employee("Lina", 235),
                new Employee("Inna", 65),
                new Employee("Roman", 74));
        return new ArrayList<>(employees);
    }

    public Map<Integer, String> employeeMap(List<Employee> employees) {
        Map<Integer, String> map = new HashMap<>();
        for (Employee employee : employees) {
            map.put(employee.getId(), employee.getName());
        }
        return map;
    }

    public String findEmployeeNameById(Map<Integer, String> employees, Integer id) {
        String result = "";
        if (employees.containsKey(id)) {
            for (Map.Entry<Integer, String> entry : employees.entrySet()) {
                if (entry.getKey().equals(id)) {
                    result = "Employee with id " + id + " is " + entry.getValue();
                }
            }
        }
        if (!employees.containsKey(id)) {
            result = "Employee with id " + id + " is not found";
        }
        return result;
    }

    public String findEmployeeIdByName(Map<Integer, String> employees, String name) {
        String result = null;
        Set<Integer> keys = new HashSet<>();
        if (employees.containsValue(name)) {
            for (Map.Entry<Integer, String> entry : employees.entrySet()) {
                if (entry.getValue().equalsIgnoreCase(name)) {
                    Integer key = entry.getKey();
                    keys.add(key);
                }
            }
        }
        if (!employees.containsValue(name)) {
            result = "Employee with name " + name + " is not found";
        }
        if (!keys.isEmpty()) {
            result = "Employee id(s) with name " + name + " :" + keys;
        }
        return result;
    }

    public void output() {
        List<Employee> employees = createEmployees();
        Map<Integer, String> map = employeeMap(employees);
        System.out.println("The map is: " + map);
        System.out.println(findEmployeeNameById(map, 5534));
        System.out.println(findEmployeeIdByName(map, "Inna"));
    }


}
