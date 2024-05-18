package com.sipriano.marvel.heroes;

import com.sipriano.marvel.base.Person;

public class IronMan extends Person {

    public void usePower() {
        System.out.println("IronMan is using his power");
    }

    @Override
    public void walk() {
        System.out.println("IronMan is walking");
    }

    @Override
    public void eat(String food) {
        super.eat("Pasta");
        System.out.println("IronMan is eating " + food);
    }

    private void eat() {
        System.out.println("Method overloading 1");
    }

    public void eat (String food, int quantity) {
        System.out.println("Method overloading 2");
    }

    public void callOverriddenEatMethod() {
        super.eat("Pasta");
    }

}
