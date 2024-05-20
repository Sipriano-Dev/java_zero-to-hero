package com.sipriano.marvel.hero.impl;

import com.sipriano.marvel.hero.SuperHero;

public class CaptainAmerica implements SuperHero {
    @Override
    public String usePower() {
        return "Captain America uses his power";
    }

    @Override
    public String StopVillain(char c) {
        if (c == 'S') {
            return "Captain America killed the villain";
        } else {
            return "Captain America stopped the villain";
        }
    }
}
