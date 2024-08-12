package com.sipriano.streams;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class StreamGroupingByDemo {

    public static void main(String[] args) {

        List<Product> productList = Arrays.asList(new Product("Apple", 1200),
                new Product("Samsung", 1000), new Product("Nokia", 600),
                new Product("BlackBerry", 1000), new Product("Apple Pro Max", 1500),
                new Product("Mi", 800), new Product("OnePlus", 1000));

        Map<String, List<Product>> groupingByName = productList.stream()
                .collect(Collectors.groupingBy(Product::getName));

        System.out.println(groupingByName);

    }

}
