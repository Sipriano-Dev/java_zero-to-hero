package com.sipriano.marvel.hero;

public interface Person {

    public static void main(String[] args) {
        //Yes you can do that in an interface
    }

    default String walk() {
        return "Walking";
    }


}
