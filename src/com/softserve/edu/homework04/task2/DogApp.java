package com.softserve.edu.homework04.task2;

import com.softserve.edu.homework04.task2.model.Breed;
import com.softserve.edu.homework04.task2.model.Dog;
import com.softserve.edu.homework04.task2.service.DogCheck;
import com.softserve.edu.homework04.task2.utils.Constants;

import java.util.Scanner;

public class DogApp {
    static Dog[] dogs;

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        dogs = createDogs(scan);

        if (DogCheck.checkNames(dogs)) {
            System.out.println(Constants.SAME_NAME_MSG);
        } else System.out.println(Constants.DIFF_NAME_MSG);

        System.out.println(Constants.OLDEST_DOG_OUT_MSG);
        DogCheck.showOldestDog(dogs);
    }


    static Dog[] createDogs(Scanner scan) {
        System.out.println(Constants.DOG_QNT_MSG);
        int count = scan.nextInt();

        dogs = new Dog[count];

        for (int i = 0; i < dogs.length; i++) {
            dogs[i] = new Dog();

            System.out.print((i + 1) + ")" + Constants.NAME_INPUT_MSG);
            dogs[i].setName(scan.next());
            System.out.print(Constants.AGE_INPUT_MSG);
            dogs[i].setAge(scan.nextInt());
            System.out.print(Constants.BREED_CHOOSE_MSG);
            System.out.print("\t");
            dogs[i].setBreed(chooseBreed(scan.nextInt()));

        }
        return dogs;
    }

    static Breed chooseBreed(int i) {
        Breed breed;
        switch (i) {
            case 1:
                breed = Breed.BEAGLE;
                break;
            case 2:
                breed = Breed.LABRADOR;
                break;
            case 3:
                breed = Breed.GERMAN_SHEPHERD;
                break;
            case 4:
                breed = Breed.BULLDOG;
                break;
            default:
                breed = Breed.ROTTWEILER;
        }

        return breed;
    }

}
