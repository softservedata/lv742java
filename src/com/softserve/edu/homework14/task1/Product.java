package com.softserve.edu.homework14.task1;

import java.time.LocalDateTime;
import java.util.Comparator;
import java.util.Date;
import java.util.Objects;

public class Product implements Comparable<Product> {

    private String manufactureCategory;
    private LocalDateTime dateOfManufacture;
    private double price;

    public Product(String manufactureCategory, LocalDateTime dateOfManufacture, double price) {
        this.manufactureCategory = manufactureCategory;
        this.dateOfManufacture = dateOfManufacture;
        this.price = price;
    }

    public String getManufactureCategory() {
        return manufactureCategory;
    }

    public void setManufactureCategory(String manufactureCategory) {
        this.manufactureCategory = manufactureCategory;
    }

    public LocalDateTime getDateOfManufacture() {
        return dateOfManufacture;
    }

    public void setDateOfManufacture(LocalDateTime dateOfManufacture) {
        this.dateOfManufacture = dateOfManufacture;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Product{" +
                "manufactureCategory='" + manufactureCategory + '\'' +
                ", dateOfManufacture=" + dateOfManufacture +
                ", price=" + price +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Product product = (Product) o;
        return Double.compare(product.price, price) == 0 && Objects.equals(manufactureCategory, product.manufactureCategory) && Objects.equals(dateOfManufacture, product.dateOfManufacture);
    }

    @Override
    public int hashCode() {
        return Objects.hash(manufactureCategory, dateOfManufacture, price);
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    @Override
    public int compareTo(Product o) {
        return Double.compare(this.getPrice(), o.getPrice());
    }

    public static class ByPriceName implements Comparator<Product> {
        @Override
        public int compare(Product o1, Product o2) {
            if (o1 == null && o2 == null) {
                return 0;
            } else if (o1 == null) {
                return -1;
            } else if (o2 == null) {
                return 1;
            }
            int byPrice = Double.compare(o1.getPrice(), o2.getPrice());
            return byPrice == 0 ? o1.getManufactureCategory().compareTo(o2.getManufactureCategory()) : byPrice;
        }
    }
}
