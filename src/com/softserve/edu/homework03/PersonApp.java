package src.com.softserve.edu.homework03;
import src.com.softserve.edu.homework03.Person;

public class PersonApp {


    public static void main(String[] args) {
        Person p1 = new Person("Ivan", "Ivanov");
        p1.setBirthYear(1999);
        src.com.softserve.edu.homework03.Person p2 = new Person("Petro", "Petrov");
        p2.setBirthYear(2002);
        Person p3 = new Person("Adriana", "Fedoriv");
        p3.setBirthYear(1995);
        Person p4 = new Person("Svitlana", "Gavrylyuk");
        p4.setBirthYear(2000);
        Person p5 = new Person("Vasyl", "Kostiv");
        p5.setBirthYear(1983);

        Person[] persons = {p1, p2, p3, p4, p5};
        for (Person p : persons) {
             p.output();
        }
    }
}