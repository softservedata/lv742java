package com.softserve.homework14;

import java.time.LocalDateTime;

public class Product implements Comparable<Product>, Cloneable {

    private ManufactureCategory manufactureCategory;
    private LocalDateTime manufactureDate;
    private Double price;


    public Product(ManufactureCategory manufactureCategory, LocalDateTime manufactureDate, Double price) {
        this.manufactureCategory = manufactureCategory;
        this.manufactureDate = manufactureDate;
        this.price = price;
    }

    public Product(ManufactureCategory manufactureCategory, LocalDateTime manufactureDate) {
        this.manufactureCategory = manufactureCategory;
        this.manufactureDate = manufactureDate;
    }

    public ManufactureCategory getManufactureCategory() {
        return manufactureCategory;
    }

    public void setManufactureCategory(ManufactureCategory manufactureCategory) {
        this.manufactureCategory = manufactureCategory;
    }

    public LocalDateTime getManufactureDate() {
        return manufactureDate;
    }

    public void setManufactureDate(LocalDateTime manufactureDate) {
        this.manufactureDate = manufactureDate;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Product)) return false;

        Product product = (Product) o;

        if (getManufactureCategory() != product.getManufactureCategory()) return false;
        if (getManufactureDate() != null ? !getManufactureDate().equals(product.getManufactureDate()) : product.getManufactureDate() != null)
            return false;
        return getPrice() != null ? getPrice().equals(product.getPrice()) : product.getPrice() == null;
    }

    @Override
    public int hashCode() {
        int result = getManufactureCategory() != null ? getManufactureCategory().hashCode() : 0;
        result = 31 * result + (getManufactureDate() != null ? getManufactureDate().hashCode() : 0);
        result = 31 * result + (getPrice() != null ? getPrice().hashCode() : 0);
        return result;
    }

    @Override
    public int compareTo(Product o) {
        return getManufactureDate().compareTo(o.getManufactureDate());
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    @Override
    public String toString() {
        return "\nProduct{" +
                "manufactureCategory=" + manufactureCategory +
                ", manufactureDate=" + manufactureDate +
                ", price=" + price +
                '}';
    }
}
