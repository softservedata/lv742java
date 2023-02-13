package com.softserve.edu.homework10_collection.task3;

import java.util.Comparator;

public class ListName implements Comparator<Student> {
    @Override
    public int compare(Student student1, Student student2){
        return student1.getName().compareTo(student2.getName());
    }
}
