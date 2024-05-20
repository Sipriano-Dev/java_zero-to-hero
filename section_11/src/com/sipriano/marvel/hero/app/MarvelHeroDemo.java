package com.sipriano.marvel.hero.app;

import com.sipriano.marvel.hero.SuperHero;
import com.sipriano.marvel.hero.impl.CaptainAmerica;
import com.sipriano.marvel.hero.impl.IronMan;
import com.sipriano.marvel.hero.impl.SpiderMan;

public class MarvelHeroDemo {

    public static void main(String[] args) {

        SuperHero ironMan = new IronMan();
        invokeSuperHero(ironMan);

        System.out.println("-----------------");
        SuperHero spiderMan = new SpiderMan();
        invokeSuperHero(spiderMan);

        System.out.println("-----------------");
        SuperHero cap = new CaptainAmerica();
        invokeSuperHero(cap);

    }

    private static void invokeSuperHero(SuperHero superHero) {
        System.out.println(superHero.usePower());
        System.out.println(superHero.StopVillain('N'));
    }

}
