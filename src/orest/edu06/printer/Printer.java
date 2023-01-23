package orest.edu06.printer;

import orest.edu06.bird.*;
import orest.edu06.developer.Developer;
import orest.edu06.employee.Employee;

import java.util.Arrays;

public class Printer {
    public void print() {
        Bird[] birds = {new Eagle(), new Kiwi(), new Penguin(), new Swallow()};

        System.out.println(Arrays.toString(birds));

        Employee employee = new Employee("Ellison", 26, 2800.43);
        Developer developer = new Developer("Jack", 28, 3400.58, "Average Java developer");

        System.out.println(employee.report());
        System.out.println(developer.report());
    }
}
