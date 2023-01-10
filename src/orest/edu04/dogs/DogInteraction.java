package orest.edu04.dogs;

public class DogInteraction {

    public void interaction() {
        Dog charlie = new Dog("Charlie", Breed.SHEPHERD, 8);
        Dog hudson = new Dog("Hudson", Breed.MASTIFF, 12);
        Dog goldie = new Dog("Goldie", Breed.GOLDEN_RETRIEVER, 3);

        if (charlie.getName().equals(hudson.getName()) | goldie.getName().equals(charlie.getName())) {
            System.out.println("Some dogs have same name.");
        } else {
            System.out.println("Dogs have different names.");
        }

        if (charlie.getAge() > hudson.getAge() && charlie.getAge() > goldie.getAge()) {
            System.out.println("The oldest dog " + charlie.getName() + ", the breed " + charlie.getBreed() + ".");
        } else if (hudson.getAge() > goldie.getAge()) {
            System.out.println("The oldest dog " + hudson.getName() + ", the breed " + hudson.getBreed() + ".");
        } else {
            System.out.println("The oldest dog " + goldie.getName() + ", the breed " + goldie.getBreed() + ".");
        }
    }
}
