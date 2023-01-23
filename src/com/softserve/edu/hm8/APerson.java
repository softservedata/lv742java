package com.softserve.edu.hm8;

public abstract class APerson {
    private FullName fullName;
    private int age;

    public class FullName implements Cloneable {
        private String firstName;
        private String lastName;

        public FullName(String firstName, String lastName) {
            this.firstName = firstName;
            this.lastName = lastName;
        }

        public FullName() {
            this.firstName = "";
            this.lastName = "";
        }

        public String getFirstName() {
            return firstName;
        }

        public void setFirstName(String firstName) {
            this.firstName = firstName;
        }

        public String getLastName() {
            return lastName;
        }

        public void setLastName(String lastName) {
            this.lastName = lastName;
        }

        @Override
        protected Object clone() throws CloneNotSupportedException {
            return super.clone();
        }
    }

    public APerson(FullName fullName, int age) {
        this.fullName = fullName;
        this.age = age;
    }

    public APerson() {
        this.fullName = new FullName();
        this.age = 0;
    }

    public FullName getFullName() {
        return fullName;
    }

    public void setFullName(FullName fullName) {
        this.fullName = fullName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public abstract String activity();

    public String info() {
        return "First name: " + fullName.getFirstName() + ", Last name: " + fullName.getLastName() + ", Age: " + getAge();
    }
}
