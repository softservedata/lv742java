package com.softserve.edu.hm14.p1;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class App {
    public static void main(String[] args) {
        List<Product> list = Product.init();
        System.out.println("\nBefore\n" + list);

        List<Product> res = list.stream().
                sorted(new Product.ByPrice()).
                filter(el -> el.getPrice() > 3000).
                filter(el -> {
                    return (LocalDate.now().minusYears(1).compareTo(el.getDateOfManufacture()) > 0) ? true : false;
                }).
                filter(el -> el.getManufactureCategory().equals(Product.PHONE_CATEGORY)).
                collect(Collectors.toList());

        System.out.println("\nAfter\n" + res);
    }
}
