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

}
