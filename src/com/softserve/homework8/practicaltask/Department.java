package com.softserve.homework8.practicaltask;

public class Department  implements Cloneable, Comparable<Department> {

    private String name;
    private Address address = new Address();


    public Department(String name, Address address) {
        this.name = name;
        this.address = address;
    }

    public Department(String name) {
        this.name = name;
    }

    @Override
    public int compareTo(Department o) {
        return getName().compareTo(o.getName());
    }

    static class Address implements Cloneable {

        private String city = "";
        private String street = "";
        private int building;

        public Address(String city, String street, int building) {
            this.city = city;
            this.street = street;
            this.building = building;
        }

        public Address() {
        }

        public String getCity() {
            return city;
        }

        public void setCity(String city) {
            this.city = city;
        }

        public String getStreet() {
            return street;
        }

        public void setStreet(String street) {
            this.street = street;
        }

        public int getBuilding() {
            return building;
        }

        public void setBuilding(int building) {
            this.building = building;
        }

        @Override
        public Object clone() throws CloneNotSupportedException {
            return super.clone();
        }

        @Override
        public String toString() {
            return "Address{" +
                    "city='" + city + '\'' +
                    ", street='" + street + '\'' +
                    ", building=" + building +
                    '}';
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Department)) return false;

        Department that = (Department) o;

        if (getName() != null ? !getName().equals(that.getName()) : that.getName() != null) return false;
        return getAddress() != null ? getAddress().equals(that.getAddress()) : that.getAddress() == null;
    }

    @Override
    public int hashCode() {
        int result = getName() != null ? getName().hashCode() : 0;
        result = 31 * result + (getAddress() != null ? getAddress().hashCode() : 0);
        return result;
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        Department copyOfDepartment = (Department) super.clone();
        copyOfDepartment.address  = (Address) copyOfDepartment.address.clone();
        return copyOfDepartment;
    }


    @Override
    public String toString() {
        return "Department{" +
                "name='" + name + '\'' +
                ", address=" + address +
                '}';
    }


}

