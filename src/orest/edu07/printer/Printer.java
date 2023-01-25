package orest.edu07.printer;

import orest.edu07.employee.ContractEmployee;
import orest.edu07.employee.Employee;
import orest.edu07.employee.SalariedEmployee;
import orest.edu07.vehicle.*;

import java.util.Arrays;

public class Printer {

    public void print() {
        Employee[] salariedEmployees = {
                new SalariedEmployee("emp01", "Jason", "10", 40, 160),
                new SalariedEmployee("emp02", "Harry", "20", 65, 140),
                new SalariedEmployee("emp03", "Larry", "30", 34, 150),
        };

        Employee[] contractEmployees = {
                new ContractEmployee("emp11", "Marshal", 8000, "fedTax34"),
                new ContractEmployee("emp12", "Marrie-Ann", 4800, "fedTax147"),
                new ContractEmployee("emp13", "Helen", 5300, "fedTax245")
        };

        Arrays.sort(salariedEmployees);
        Arrays.sort(contractEmployees);

        for (Employee employee : salariedEmployees) {
            System.out.println(employee + "\n");
        }

        for (Employee employee : contractEmployees) {
            System.out.println(employee + "\n");
        }

        Plane plane = new Plane(30, 500);
        plane.fly();
        plane.land();

        Helicopter helicopter = new Helicopter(6, 2, 2500);
        helicopter.fly();
        helicopter.land();

        Liner liner = new Liner(400, 8);
        liner.isSailing();

        Boat boat = new Boat(10, 43);
        boat.isSailing();

        Bus bus = new Bus(60, "Svobody avenue - Pivnichna street");
        bus.drive();

        Motorcycle motorcycle = new Motorcycle(1, 320);
        motorcycle.drive();

        Car car = new Car(4, "Audi A4");
        car.drive();


    }
}
