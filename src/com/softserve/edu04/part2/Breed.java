package com.softserve.edu04.part2;

public enum Breed {
    UNKNOWN ("Unknown"),
    KANECORSO ("Cane Corso"),
    LABRADOR ("Labrador"),
    DOBERMAN ("Doberman");

    private String name;

    private Breed(String name){
        this.name = name;
    }

    @Override
    public String toString() {
        return "'" + name + '\'';
    }
}
