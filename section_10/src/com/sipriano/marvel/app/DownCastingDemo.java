package com.sipriano.marvel.app;

import com.sipriano.marvel.animals.Cat;
import com.sipriano.marvel.animals.Dog;
import com.sipriano.marvel.base.Animal;

public class DownCastingDemo {

    public static void main(String[] args) {

        Animal animal;
        Dog dog = new Dog();
        animal = dog; //Upcasting

        dog = (Dog) animal; //DownCasting

        //Cat cat = (Cat) animal; //Error, animal is not a cat

    }

}
