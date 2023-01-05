package orest.edu03;


public class Main {
    public static void main(String[] args) {

        new PersonService().
                personConfigure().
                forEach(p -> System.out.println(p.output()));

    }
}
