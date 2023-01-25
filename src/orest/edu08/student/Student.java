package orest.edu08.student;

import orest.edu08.person.Person;

public class Student extends Person implements Cloneable {
    private int course;
    private String activity;

    public String getActivity() {
        return activity;
    }

    public void setActivity(String activity) {
        this.activity = activity;
    }

    public Student(FullName fullName, int age, int course) {
        super(fullName, age);
        setCourse(course);
    }

    public int getCourse() {
        return course;
    }

    public void setCourse(int course) {
        switch (course) {
            case 1:
                this.course = course;
                break;
            case 2:
                this.course = course;
                break;
            case 3:
                this.course = course;
                break;
            case 4:
                this.course = course;
                break;
            case 5:
                this.course = course;
                break;

            default:
                this.course = 0;
        }
    }

    @Override
    public String info() {
        return super.info() + ", Course: " + course + ".";
    }

    @Override
    public String activity() {
        return activity;
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
