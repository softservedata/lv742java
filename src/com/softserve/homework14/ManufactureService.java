package com.softserve.homework14;

import java.time.LocalDateTime;
import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ManufactureService {

    public static Optional<String> mostPopularName(Stream<Employee> employeeStream) {
        Map<String, Long> map = employeeStream
                .map(Employee::getFirstName)
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        return map.entrySet()
                .parallelStream()
                .max(Comparator.comparing(Map.Entry::getValue))
                .map(Map.Entry::getKey);
    }

    public List<Product> createProducts() {
        List<Product> products = List.of(
                new Product(ManufactureCategory.PHONE, LocalDateTime.now().minusYears(3), 1000.0),
                new Product(ManufactureCategory.PHONE, LocalDateTime.now().minusYears(3), 2000.0),
                new Product(ManufactureCategory.PHONE, LocalDateTime.now().minusYears(3), 3000.0),
                new Product(ManufactureCategory.PHONE, LocalDateTime.now().minusYears(6), 89000.0),
                new Product(ManufactureCategory.PHONE, LocalDateTime.now().minusYears(2), 31000.0),
                new Product(ManufactureCategory.PHONE, LocalDateTime.now().minusYears(3), 65000.0),
                new Product(ManufactureCategory.PHONE, LocalDateTime.now().minusYears(3), 4000.0),
                new Product(ManufactureCategory.PHONE, LocalDateTime.now().minusYears(1), 21000.0),
                new Product(ManufactureCategory.PHONE, LocalDateTime.now(), 8000.0),
                new Product(ManufactureCategory.PHONE, LocalDateTime.now(), 55555.0),
                new Product(ManufactureCategory.BEVERAGE, LocalDateTime.now(), 1.0),
                new Product(ManufactureCategory.BEVERAGE, LocalDateTime.now(), 1.0),
                new Product(ManufactureCategory.BEVERAGE, LocalDateTime.now(), 1.0),
                new Product(ManufactureCategory.BEVERAGE, LocalDateTime.now(), 1.0),
                new Product(ManufactureCategory.BEVERAGE, LocalDateTime.now(), 1.0),
                new Product(ManufactureCategory.BEVERAGE, LocalDateTime.now(), 1.0),
                new Product(ManufactureCategory.BEVERAGE, LocalDateTime.now(), 1.0),
                new Product(ManufactureCategory.BEVERAGE, LocalDateTime.now(), 1.0),
                new Product(ManufactureCategory.BEVERAGE, LocalDateTime.now(), 1.0),
                new Product(ManufactureCategory.FOOD, LocalDateTime.now(), 1.0));
        return new ArrayList<>(products);
    }

    public Stream<Employee> addEmployees() {
        List<Employee> employees = List.of(
                new Employee("Tetiana", "Divnych"),
                new Employee("Yurii", "Divnych"),
                new Employee("Dima", "Divnych"),
                new Employee("Yurii", "Divnych"),
                new Employee("Volodymyr", "Divnych"));
        List<Employee> list = new ArrayList<>(employees);
        return list.stream();
    }

    public List<Product> sortPhoneCategoryByPrice(List<Product> products) {
        return products.stream()
                .filter(product -> product.getManufactureCategory().getName().equals("Phone"))
                .filter(product -> product.getPrice() >= 3000)
                .filter(product -> product.getManufactureDate().isBefore(LocalDateTime.now().minusYears(1)))
                .sorted(Comparator.comparing(Product::getPrice))
                .collect(Collectors.toList());
    }

    public void output() {
        ManufactureService manufactureService = new ManufactureService();
        Stream<Employee> employees = manufactureService.addEmployees();
        System.out.println("\nThe most popular name is: " + mostPopularName(employees));
        List<Product> products = manufactureService.createProducts();
        System.out.println("\nOriginal list: " + products);
        List<Product> sortedProducts = sortPhoneCategoryByPrice(products);
        System.out.println("\nPhone category list sorted by price" + sortedProducts);
    }
}
