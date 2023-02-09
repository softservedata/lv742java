package com.softserve.edu.hm10.p3;

import com.softserve.edu.hm8.Student;

import java.util.Comparator;
import java.util.List;

public class StudentE extends Student {

    public StudentE(String firstName, String lastName, int age, int course) {
        super(firstName, lastName, age, course);
    }

    public static class ByFirstName implements Comparator<StudentE> {
        @Override
        public int compare(StudentE o1, StudentE o2) {
            return o1.getFullName().getFirstName().compareTo(o2.getFullName().getFirstName());
        }
    }

    public static class ByCourse implements Comparator<StudentE> {
        @Override
        public int compare(StudentE o1, StudentE o2) {
            return o1.getCourse() - o2.getCourse();
        }
    }

    //method printStudents (List students, Integer course), which receives a list of students
    // and the course number and prints to the console the names of the students from the list,
    // which are taught in this course (use an iterator)
    static void printStudents(List<StudentE> list, int course) {
        for (StudentE el : list) {
            if (el.getCourse() == course) {
                System.out.println(el);
            }
        }
    }
}
