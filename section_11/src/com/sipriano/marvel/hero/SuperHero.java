package com.sipriano.marvel.hero;

public interface SuperHero {

    String usePower(); //public abstract implicit

    /***
     * if Y received kill the vilain
     * if N received stop the vilain
     * @param c indicates Y or N
     * @return return status
     */
    String StopVillain(char c);
}
