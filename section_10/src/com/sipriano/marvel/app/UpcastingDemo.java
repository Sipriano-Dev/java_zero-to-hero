package com.sipriano.marvel.app;

import com.sipriano.marvel.animals.Cat;
import com.sipriano.marvel.animals.Dog;
import com.sipriano.marvel.base.Animal;

public class UpcastingDemo {

    public static void main(String[] args) {

        Animal animal = new Animal();
        animal.setName("Lobinho");
        AnimalUtility.printName(animal);

        System.out.println("---------------------------");
        Animal animal2 = new Dog(); //Upcast manually
        animal2.setName("Pretinho");
        AnimalUtility.printName(animal2);

        System.out.println("---------------------------");
        Cat cat = new Cat();
        cat.setName("Inho");
        AnimalUtility.printName(cat); //Java upcast automatically

    }

}
