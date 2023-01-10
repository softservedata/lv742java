package com.softserve.edu.homework03;
import java.time.LocalDate;
public class person {
    //3 private fields
    private String lastName;
    private String firstName;
    private int bdy;
        //default constructor and constructor with 2 parameters (first and last names)
    public person() {
        }
    public person(String lastName, String firstName) {
            this.lastName = lastName;
            this.firstName = firstName;
        }
    //methods:getAge, input, output, changeName;
    public int getAge () {
        int bdy=getBdy();
        return LocalDate.now().getYear() - bdy;
        }
        public void input(String firstName, String lastName, int bdy) {
            this.firstName = firstName;
            this.lastName = lastName;
            this.bdy = bdy;
        }
        public void output() {
            System.out.println("Firstname: " + firstName + "\nLastname: " + lastName + "\nThe birthday year: " + bdy + "\n");
        }
        public void changeName(String fn, String ln) {
            this.firstName = fn;
            this.lastName = ln;
        }
        //getters and setters;
        public String getLastName () {
            return lastName;
        }
        public void setLastName (String lastName){
            this.lastName = lastName;
        }
        public String getFirstName () {
            return firstName;
        }
        public void setFirstName (String firstName){
            this.firstName = firstName;
        }
        public int getBdy () {
            return bdy;
        }
        public void setBdy ( int bdy){
            this.bdy = bdy;
        }
        @Override
        public String toString() {
            return "Name is " + firstName +   '.'
                    + " Surname is " + lastName + '.'
                    + " Year of birth-" + bdy + '.'
                    + " Age=" + getAge() ;
        }
}