package com.sipriano.marvel.app;

import com.sipriano.marvel.animals.Cat;
import com.sipriano.marvel.animals.Dog;
import com.sipriano.marvel.base.Animal;

public class AnimalUtility {

    public static void printName(Animal animal) {
        System.out.println(animal.getName());
        animal.eat();
    }

    public static void performAction(Animal animal) {
        animal.eat();
        if (animal instanceof Dog) {
            Dog dog = (Dog) animal;
            dog.bark();
        } else if (animal instanceof Cat){
            Cat cat = (Cat) animal;
            cat.meow();
        }
    }

}
