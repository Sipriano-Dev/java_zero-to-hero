package com.sipriano.marvel.hero;

public interface SuperHero {

    String UNIVERSE_NAME = "Marvel"; //public static final implicit

    String usePower(); //public abstract implicit

    /***
     * if Y received kill the villain
     * if N received stop the villain
     * @param c indicates Y or N
     * @return return status
     */
    String StopVillain(char c);

    default String trackLiveLocation() {
        String liveLocation = "USA";
        System.out.println("I am in " + liveLocation);
        return liveLocation;
    }

    static String commonCharacteristics() {
        return "Super Human abilities, Willingness to sacrifice";
    }


}
