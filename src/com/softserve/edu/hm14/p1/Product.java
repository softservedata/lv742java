package com.softserve.edu.hm14.p1;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Objects;

public class Product {
    public static final String PHONE_CATEGORY = "Phone";

    private String manufactureCategory;
    private LocalDate dateOfManufacture;
    private double price;

    public Product() {
        manufactureCategory = "";
        dateOfManufacture = LocalDate.of(1, 1, 1);
        price = 0.0;
    }

    public Product(String manufactureCategory, LocalDate dateOfManufacture, double price) {
        this.manufactureCategory = manufactureCategory;
        this.dateOfManufacture = dateOfManufacture;
        this.price = price;
    }

    public static List<Product> init() {
        List<Product> list = new ArrayList<>();
        list.add(new Product(Product.PHONE_CATEGORY, LocalDate.of(2022, 8, 5), 9000.0));
        list.add(new Product("SmartClock", LocalDate.of(2010, 2, 3), 5000.0));
        list.add(new Product("LapTop", LocalDate.of(2012, 10, 3), 25000.0));
        list.add(new Product(Product.PHONE_CATEGORY, LocalDate.of(2020, 8, 5), 9000.0));
        list.add(new Product(Product.PHONE_CATEGORY, LocalDate.of(2019, 1, 15), 3001.0));
        list.add(new Product(Product.PHONE_CATEGORY, LocalDate.of(2015, 8, 13), 2000.0));
        list.add(new Product(Product.PHONE_CATEGORY, LocalDate.of(2014, 5, 25), 4000.0));
        list.add(new Product(Product.PHONE_CATEGORY, LocalDate.of(2013, 8, 5), 7000.0));
        list.add(new Product(Product.PHONE_CATEGORY, LocalDate.of(2012, 8, 15), 9000.0));
        list.add(new Product(Product.PHONE_CATEGORY, LocalDate.of(2011, 7, 5), 8000.0));
        list.add(new Product(Product.PHONE_CATEGORY, LocalDate.of(2010, 8, 7), 9000.0));
        list.add(new Product("SmartClock", LocalDate.of(2010, 2, 3), 5000.0));
        list.add(new Product("LapTop", LocalDate.of(2012, 10, 3), 25000.0));
        list.add(new Product(Product.PHONE_CATEGORY, LocalDate.of(2009, 8, 25), 11000.0));
        list.add(new Product(Product.PHONE_CATEGORY, LocalDate.of(2022, 5, 5), 9000.0));
        list.add(new Product(Product.PHONE_CATEGORY, LocalDate.of(2021, 8, 15), 22000.0));
        list.add(new Product(Product.PHONE_CATEGORY, LocalDate.of(2020, 8, 6), 14000.0));
        list.add(new Product(Product.PHONE_CATEGORY, LocalDate.of(2019, 4, 25), 3000.0));
        list.add(new Product(Product.PHONE_CATEGORY, LocalDate.of(2020, 5, 4), 1000.0));
        list.add(new Product(Product.PHONE_CATEGORY, LocalDate.of(2019, 6, 5), 9000.0));
        return list;
    }

    public String getManufactureCategory() {
        return manufactureCategory;
    }

    public void setManufactureCategory(String manufactureCategory) {
        this.manufactureCategory = manufactureCategory;
    }

    public LocalDate getDateOfManufacture() {
        return dateOfManufacture;
    }

    public void setDateOfManufacture(LocalDate dateOfManufacture) {
        this.dateOfManufacture = dateOfManufacture;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Product product = (Product) o;
        return Double.compare(product.price, price) == 0 &&
                manufactureCategory.equals(product.manufactureCategory) &&
                dateOfManufacture.equals(product.dateOfManufacture);
    }

    @Override
    public int hashCode() {
        return Objects.hash(manufactureCategory, dateOfManufacture, price);
    }

    static class ByPrice implements Comparator<Product> {
        @Override
        public int compare(Product o1, Product o2) {
            return (int) (o1.getPrice() - o2.getPrice());
        }
    }

    @Override
    public String toString() {
        return "\nProduct{" +
                "manufactureCategory='" + manufactureCategory + '\'' +
                ", dateOfManufacture=" + dateOfManufacture +
                ", price=" + price +
                '}';
    }
}
