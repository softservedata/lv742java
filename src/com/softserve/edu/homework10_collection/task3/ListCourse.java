package com.softserve.edu.homework10_collection.task3;

import java.util.Comparator;

public class ListCourse implements Comparator<Student> {
    @Override
    public int compare(Student student1, Student student2) {
        return student1.getCourse() - student2.getCourse();
    }

}
