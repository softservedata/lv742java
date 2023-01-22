package com.softserve.edu.hm7;

import java.util.Arrays;

public class App {
    public static void main(String[] arg) {
        AEmployee[] arrayEmployee = new AEmployee[4];
        arrayEmployee[0] = new ContractEmployee("Kostya", "asdfasd2452354", 20000);
        arrayEmployee[1] = new ContractEmployee("Svitlana", "dfasfga34987987", 30000);
        arrayEmployee[2] = new SalariedEmployee("Ivan", "5239752037529237458", 500.0, 150.0);
        arrayEmployee[3] = new SalariedEmployee("Olga", "3452305823905829375", 600.0, 200.0);

        System.out.println("Basic array: ");
        System.out.println(Arrays.toString(arrayEmployee));

        System.out.println("\nSort by salary (desc): ");
        Arrays.sort(arrayEmployee);
        System.out.println(Arrays.toString(arrayEmployee));

        System.out.println("\nSort by name: ");
        Arrays.sort(arrayEmployee, new AEmployee.ByName());
        System.out.println(Arrays.toString(arrayEmployee));
    }
}
