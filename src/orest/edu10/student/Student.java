package orest.edu10.student;

import java.util.*;

public class Student implements Comparable<Student> {
    private String name;
    private Integer course;

    public Student(String name, Integer course) {
        this.name = name;
        this.course = course;
    }

    public Student() {
    }

    public String getName() {
        return name;
    }
    public Integer getCourse() {
        return course;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setCourse(Integer course) {
        this.course = course;
    }
    @Override
    public int hashCode() {
        return Objects.hash(course, name);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Student)) {
            return false;
        }
        Student other = (Student) obj;
        return Objects.equals(course, other.course) && Objects.equals(name, other.name);
    }


    public List<Student> printStudents(List<Student> studentList, Integer course) {
        ListIterator<Student> iterator = studentList.listIterator();
        List<Student> list = new ArrayList<>();

        boolean noStudentFound = false;

        while (iterator.hasNext()){
            Student student = iterator.next();
            if(Objects.equals(student.getCourse(), course)) {
                list.add(student);
                noStudentFound = true;
            }
        }

        if (!noStudentFound) {
            System.out.println("No student was found on course " + course + ".");
        }
        return list;
    }


    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", course=" + course +
                '}';
    }

    @Override
    public int compareTo(Student anotherStudent) {
        return this.course.compareTo(anotherStudent.course);
    }
}