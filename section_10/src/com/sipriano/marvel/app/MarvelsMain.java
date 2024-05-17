package com.sipriano.marvel.app;

import com.sipriano.marvel.heroes.IronMan;

public class MarvelsMain {

    public static void main(String[] args) {

        IronMan ironMan = new IronMan();
        ironMan.walk();
        ironMan.eat("Popcorn");
        ironMan.sleep();
        ironMan.usePower();

    }

}
