package com.softserve.homework8;

public class Student extends Person {

    private int courseId;

    public Student(FullName fullName, int age, int courseId) {
        super(fullName, age);
        this.courseId = courseId;
    }

    public int getCourseId() {
        return courseId;
    }

    public void setCourseId(int courseId) {
        this.courseId = courseId;
    }

    @Override
    public String activity() {
        return "I study at university";
    }

    @Override
    public int compareTo(Person o) {
            return getFullName().getLastName().compareTo(o.getFullName().getLastName());
    }

    @Override
    public String info(){
        return "Student info: " + getFullName() + ", course id: " + getCourseId();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Student)) return false;
        if (!super.equals(o)) return false;

        Student student = (Student) o;

        return getCourseId() == student.getCourseId();
    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + getCourseId();
        return result;
    }

    @Override
    public String toString() {
        return "Student{" +
                "fullName=" + getFullName() + ", " +
                "age=" + getAge() + ", " +
                "courseId=" + courseId +
                '}';
    }
}
