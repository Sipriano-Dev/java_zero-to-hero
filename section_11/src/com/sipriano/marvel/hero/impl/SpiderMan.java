package com.sipriano.marvel.hero.impl;

import com.sipriano.marvel.hero.SuperHero;

public class SpiderMan implements SuperHero {
    @Override
    public String usePower() {
        return "SpiderMan uses his power";
    }

    @Override
    public String StopVillain(char c) {
        if (c == 'S') {
            return "SpiderMan killed the villain";
        } else {
            return "SpiderMan stopped the villain";
        }
    }

    @Override
    public String trackLiveLocation() {
        String liveLocation = "London";
        System.out.println("I am in " + liveLocation);
        return liveLocation;
    }

}
