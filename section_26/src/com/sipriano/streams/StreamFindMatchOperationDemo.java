package com.sipriano.streams;

import java.util.List;
import java.util.Optional;

public class StreamFindMatchOperationDemo {

    public static void main(String[] args) {

        List<Item> items = getItems();

        boolean allInStock = items.stream().allMatch(Item::isInStock);//false cause there is one that are not in stock
        System.out.println(allInStock);

        boolean anyOnSale = items.stream().anyMatch(Item::isOnSale);//true cause at least one are on sale
        System.out.println(anyOnSale);

        boolean anyOutOfStock = items.stream().anyMatch(item -> !item.isInStock());//will see if has any out of stock
        System.out.println(anyOutOfStock);

        boolean anyGreaterThan5000 = items.stream().noneMatch(item -> item.getPrice() > 5000);//false cause there is one that are not in stock
        System.out.println(anyGreaterThan5000);

        Optional<Item> randomItemOptional = items.stream().filter(item -> item.getPrice() > 1000).findAny();
        System.out.println(randomItemOptional);

        //Will find the first element that matches and will return a Optional to avoid null exception
        Optional<Item> firstItemOptional = items.stream().filter(item -> item.getPrice() > 1000).findFirst();
        System.out.println(firstItemOptional);

    }

    private static List<Item> getItems() {
        return List.of(
                new Item("Laptop", 1200, true, false),
                new Item("Smartphone", 800, true, true),
                new Item("Headphones", 150, false, true),
                new Item("Camera", 2000, true, true),
                new Item("Smartwatch", 300, true, false)
        );
    }
}
