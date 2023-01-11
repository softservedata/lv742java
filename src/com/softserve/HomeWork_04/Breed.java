package com.softserve.HomeWork_04;

public enum Breed {
    bulldog("bulldog"),
    yorkshireTerrier("yorkshire terrier"),
    doberman("doberman"),
    dachshund("dachshund");

    private String breed;

    Breed(String breed) {
        this.breed = breed;
    }

    @Override
    public String toString() {
        return breed;
    }
}
