package com.softserve.HomeWork_14;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

public class Product implements Cloneable, Comparable<Product> {
    private String manufactureCategory;
    private LocalDate dateOfManufacture;
    private double price;

    public Product(String manufactureCategory, LocalDate dateOfManufacture, double price) {
        this.manufactureCategory = manufactureCategory.toUpperCase();
        this.dateOfManufacture = dateOfManufacture;
        this.price = price;
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

    static class ByPrice implements Comparator<Product> {
        @Override
        public int compare(Product o1, Product o2) {
            return Double.compare(o1.getPrice(), o2.getPrice());
        }
    }

    @Override
    public String toString() {
        return "\n\tProduct: " +
                "manufactureCategory = " + manufactureCategory +
                ", dateOfManufacture = " + dateOfManufacture +
                ", price = " + price;
    }

    public static void main(String[] args) {
        List<Product> productList = new ArrayList<>();
        productList.add(new Product("phone", LocalDate.of(2022, 3, 5), 31000));
        productList.add(new Product("backpack", LocalDate.of(2021, 2, 3), 1030));
        productList.add(new Product("vacuum cleaner", LocalDate.of(2023, 1, 5), 17050));
        productList.add(new Product("phone", LocalDate.of(2021, 3, 5), 3500));
        productList.add(new Product("suit", LocalDate.of(2022, 4, 4), 5000));
        productList.add(new Product("phone", LocalDate.of(2023, 1, 23), 30000));
        productList.add(new Product("shoes", LocalDate.of(2022, 12, 12), 4300));
        productList.add(new Product("phone", LocalDate.of(2020, 6, 15), 2900));
        productList.add(new Product("table", LocalDate.of(2019, 5, 3), 9900));
        productList.add(new Product("phone", LocalDate.of(2020, 11, 17), 17000));
        productList.add(new Product("glasses", LocalDate.of(2022, 12, 1), 1900));
        productList.add(new Product("phone", LocalDate.of(2018, 2, 18), 19000));
        productList.add(new Product("chair", LocalDate.of(2021, 10, 11), 1100));
        productList.add(new Product("phone", LocalDate.of(2017, 3, 13), 3999));
        productList.add(new Product("copybook", LocalDate.of(2022, 11, 5), 60));
        productList.add(new Product("copybook", LocalDate.of(2022, 11, 4), 50));
        productList.add(new Product("shoes", LocalDate.of(2021, 8, 5), 6700));
        productList.add(new Product("jeans", LocalDate.of(2019, 1, 1), 4500));
        productList.add(new Product("suit", LocalDate.of(2022, 3, 14), 9900));
        productList.add(new Product("pencil", LocalDate.of(2022, 12, 28), 25));
        productList.add(new Product("pen", LocalDate.of(2023, 2, 5), 30));

        System.out.println("Original list: " + productList);
        List<Product> sortedProductList = productList.stream()
                .filter(e -> Objects.equals(e.getManufactureCategory(), "PHONE"))
                .filter(e -> e.getPrice() > 3000)
                .filter(e -> LocalDate.now().isAfter(e.getDateOfManufacture().plusYears(1)))
//                .sorted(Comparator.comparingDouble(Product::getPrice))
                .sorted(new Product.ByPrice())
                .collect(Collectors.toList());

        System.out.println("New  sorted list: " + sortedProductList);
    }
}

