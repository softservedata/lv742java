package com.softserve.edu.homework14.task2;

import java.util.Comparator;

public class Employee implements Comparable<Employee> {

    private String name;
    private int id;

    public Employee(String name) {
        this.name = name;
    }

    public Employee(String name, int id) {
        this.name = name;
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if ((o == null) || (getClass() != o.getClass())) {
            return false;
        }
        Employee other = null;
        if (o instanceof Employee) {
            other = (Employee) o;
        }
        if ((other == null) || (id != other.id)
                || ((name == null) && (other.name != null))
                || ((name != null) && (other.name == null))) {
            return false;
        }
        if ((name == null) && (other.name == null)) {
            return true;
        }
        return name.equals(other.name);
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + id;
        result = prime * result + ((name == null) ? 0 : name.hashCode());
        return result;
    }

    @Override
    public int compareTo(Employee o) {
        return this.getId() - o.getId();
    }


    public static class ByNameId implements Comparator<Employee> {
        @Override
        public int compare(Employee o1, Employee o2) {
            if (o1 == null && o2 == null) {
                return 0;
            } else if (o1 == null) {
                return -1;
            } else if (o2 == null) {
                return 1;
            }
            int byName = o1.getName().compareTo(o2.getName());

            return byName == 0 ? o1.getId() - o2.getId() : byName;
        }
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", id=" + id +
                '}';
    }
}
