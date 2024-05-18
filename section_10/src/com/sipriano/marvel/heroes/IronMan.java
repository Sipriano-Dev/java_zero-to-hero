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

    public void callOverriddenEatMethod() {
        super.eat("Pasta");
    }

}
