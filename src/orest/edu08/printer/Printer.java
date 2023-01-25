package orest.edu08.printer;

import orest.edu08.person.Person;
import orest.edu08.student.Student;

public class Printer {
    public void print() throws CloneNotSupportedException {
        Person.FullName arthur = new Person.FullName("Arthur", "Morgan");
        Student student1 = new Student(arthur, 36, 4);
        student1.setActivity("I like robbing banks and riding horses.");
        System.out.println(student1.info());
        System.out.println(student1.activity());

        Person.FullName vader = new Person.FullName("Darth", "Vader");
        Student student2 = new Student(vader, 48, 5);
        student2.setActivity("I like to blow planets and light saber battles.");
        System.out.println(student2.info());
        System.out.println(student2.activity());

        System.out.println("Cloned student.");
        Student clone = (Student) student1.clone();
        System.out.println(clone.info());
        System.out.println(clone.getActivity());
    }
}
