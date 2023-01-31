package com.softserve.homework7.practicaltask2;

public class Teacher extends Staff {

    private final String TYPE_PERSON = "Teacher";

    public Teacher() {
        System.out.println(TYPE_PERSON);
    }

    @Override
    public void print() {
        System.out.print("I am a teacher");
    }

    @Override
    public double salary() {
        return 5000;
    }

    @Override
    public int compareTo(Person o) {
        return getName().compareTo(o.getName());
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Teacher)) return false;
        if (!super.equals(o)) return false;

        Teacher teacher = (Teacher) o;

        return TYPE_PERSON != null ? TYPE_PERSON.equals(teacher.TYPE_PERSON) : teacher.TYPE_PERSON == null;
    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + (TYPE_PERSON != null ? TYPE_PERSON.hashCode() : 0);
        return result;
    }


}
