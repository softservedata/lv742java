package src.com.softserve.edu.homework03;

import java.time.LocalDate;
import java.util.Scanner;

public class Person {
    private String firstName;
    private String lastName;
    private int birthYear;

    public Person() {
    }

    public Person(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getBirthYear() {
        return birthYear;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setBirthYear(int birthYear) {
        this.birthYear = birthYear;
    }

    public int getAge(int birthYear) {
        return LocalDate.now().getYear() - birthYear;
    }

    @Override
    public String toString() {
        return "Person{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", age=" + getAge(birthYear) +
                '}';
    }

    public void input() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your firstname: ");
        setFirstName(scan.nextLine());
        System.out.println("Enter your lastname: ");
        setLastName(scan.nextLine());
        System.out.println("Enter your birth year: ");
        setBirthYear(scan.nextInt());
        scan.close();
    }

    public void output() {
        System.out.println(toString());
    }

    public void changeName(String fn, String ln) {
        setLastName(ln);
        setFirstName(fn);
    }

}
