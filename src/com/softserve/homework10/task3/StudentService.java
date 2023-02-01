package com.softserve.homework10.task3;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class StudentService {

    public void printStudents(List<Student> students, Integer course) {
        Map<Integer, List<String>> map = new HashMap<>();
        List<String> names = new ArrayList<>();
        for (Student student : students) {
            if (course.equals(student.getCourse())) {
                Integer courseId = student.getCourse();
                String name = student.getName();
                names.add(name);
                map.put(courseId, names);
            }
        }
        if (map.isEmpty()) {
            System.out.println("course " + course + " is not found");
        } else {
            System.out.println(map);
        }

    }

    public List<Student> createStudents() {
        List<Student> list = List.of(
                new Student("Nadia", 4),
                new Student("Olena", 2),
                new Student("Rita", 4),
                new Student("Nina", 2),
                new Student("Roman", 2)
        );
        return new ArrayList<>(list);
    }

}
