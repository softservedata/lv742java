package com.softserve.homework7.practicaltask2;

public class Cleaner extends Staff {

    private final String TYPE_PERSON = "Cleaner";

    public Cleaner() {
        System.out.println(TYPE_PERSON);
    }

    @Override
    public void print() {
        System.out.print("I am a cleaner");
    }

    @Override
    public double salary() {
        return 2000;
    }

    @Override
    public int compareTo(Person o) {
        return getName().compareTo(o.getName());
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Cleaner)) return false;
        if (!super.equals(o)) return false;

        Cleaner cleaner = (Cleaner) o;

        return TYPE_PERSON != null ? TYPE_PERSON.equals(cleaner.TYPE_PERSON) : cleaner.TYPE_PERSON == null;
    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + (TYPE_PERSON != null ? TYPE_PERSON.hashCode() : 0);
        return result;
    }
}
