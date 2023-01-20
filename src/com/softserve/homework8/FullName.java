package com.softserve.homework8;

public class FullName implements Comparable<FullName>, Cloneable {

    private String firstName;
    private String lastName;

    public FullName(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
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
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof FullName)) return false;

        FullName fullName = (FullName) o;

        if (getFirstName() != null ? !getFirstName().equals(fullName.getFirstName()) : fullName.getFirstName() != null)
            return false;
        return getLastName() != null ? getLastName().equals(fullName.getLastName()) : fullName.getLastName() == null;
    }

    @Override
    public int hashCode() {
        int result = getFirstName() != null ? getFirstName().hashCode() : 0;
        result = 31 * result + (getLastName() != null ? getLastName().hashCode() : 0);
        return result;
    }

    @Override
    public int compareTo(FullName o) {
        return getLastName().compareTo(o.getLastName());
    }

    @Override
    public String toString() {
        return "FullName{" + "firstName='" + firstName + '\'' + ", lastName='" + lastName + '\'' + '}';
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
