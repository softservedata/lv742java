package orest.edu04;

import orest.edu04.dogs.DogInteraction;
import orest.edu04.numbers.NumberInteraction;

public class Main {

    public static void main(String[] args) {
        new NumberInteraction().interaction();
        new DogInteraction().interaction();
    }
}
