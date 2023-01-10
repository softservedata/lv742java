package orest.edu04.dogs;

public enum Breed {
    SHEPHERD("Shepherd"),
    MASTIFF("Mastiff"),
    GOLDEN_RETRIEVER("Golden Retriever");

    final String breed;

    Breed(String breed) {
        this.breed = breed;
    }
    @Override
    public String toString() {
        return breed;
    }
}
