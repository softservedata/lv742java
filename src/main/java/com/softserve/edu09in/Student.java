package com.softserve.edu09in;

class Student {
    private String name;
    private int age;

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return name + " " + age;
    }

    public String getName() {
        return name;
    }


    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public static void main(String[] args) {
        Student student = new Student("Ostap", 22);
        System.out.println(student);
        Student student1 = new Student("Oles'", 19) {
            @Override
            public String toString() {
                return "name = " + getName() + ", age = " + getAge();
            }
        };
        System.out.println(student1);


    }
}