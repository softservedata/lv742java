package com.softserve.edu.homework14.task1;

import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ProductService {

    public static void main(String[] args) {
        List<Product> productList = Arrays.asList(
                new Product("Phone", LocalDateTime.of(2019, 3, 21, 15, 30), 6776),
                new Product("b", LocalDateTime.of(2010, 6, 12, 15, 30), 4000),
                new Product("Phone", LocalDateTime.of(2022, 8, 25, 19, 30), 68),
                new Product("Phone", LocalDateTime.of(2023, 2, 25, 14, 30), 96),
                new Product("Car", LocalDateTime.of(2017, 6, 9, 10, 30), 6116),
                new Product("Food", LocalDateTime.of(2019, 3, 21, 15, 30), 6776),
                new Product("b", LocalDateTime.of(2010, 6, 12, 15, 30), 4000),
                new Product("Food", LocalDateTime.of(2022, 8, 25, 19, 30), 68),
                new Product("Car", LocalDateTime.of(2012, 2, 25, 14, 30), 96),
                new Product("Phone", LocalDateTime.of(2019, 6, 9, 10, 30), 6116)

        );

        Product.ByPriceName comparator = new Product.ByPriceName();
        productList.stream()
                .filter(product -> (product.getManufactureCategory() == "Phone"))
                .filter(product -> product.getPrice() > 3000)
                .filter(product -> (product.getDateOfManufacture().isBefore(LocalDateTime.now().minusYears(1))))
                .sorted(comparator)
                .collect(Collectors.toList())
                .forEach(System.out::println);

    }
}
