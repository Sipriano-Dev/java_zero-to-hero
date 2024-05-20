package com.sipriano.marvel.hero;

public interface Hero {

    default String walk() {
        return "Walking";
    };

}
