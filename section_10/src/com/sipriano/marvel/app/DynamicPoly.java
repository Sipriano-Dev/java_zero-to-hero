package com.sipriano.marvel.app;

import com.sipriano.marvel.base.Person;
import com.sipriano.marvel.heroes.IronMan;

public class DynamicPoly {

    public static void main(String[] args) {
        Person person = new IronMan(); //Upcasting
        person.walk(); //IronMan method will be invoked
        person.eat("Ice Cream");

        IronMan ironMan = new IronMan();
        ironMan.callOverriddenEatMethod();
    }

}
