package com.sipriano.marvel.app;

import com.sipriano.marvel.base.Animal;

public class AnimalUtility {

    public static void printName(Animal animal) {
        System.out.println(animal.getName());
        animal.eat();
    }

}
