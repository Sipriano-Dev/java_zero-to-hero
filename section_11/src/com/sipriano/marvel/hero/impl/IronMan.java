package com.sipriano.marvel.hero.impl;

import com.sipriano.marvel.hero.SuperHero;

public class IronMan implements SuperHero {

    @Override
    public String usePower() {
        return "IronMan uses his power";
    }

    @Override
    public String StopVillain(char c) {
        if (c == 'S') {
            return "IronMan killed the villain";
        } else {
            return "IronMan stopped the villain";
        }
    }
}
