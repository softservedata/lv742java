package com.softserve.edu.hm4.p1;

public enum Breed {
    UNKNOWN("Unknown"),
    AFADOR("Afador"),
    AFFENSPANIEL("Afen spaniel"),
    AFGHANCOLLIE("Afghan collie"),
    TEST("test");

    private String name;

    private Breed(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "'" + name + "'";
    }
}
