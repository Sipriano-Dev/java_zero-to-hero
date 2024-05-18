package com.sipriano.marvel.vehicle;

import com.sipriano.marvel.base.Engine;
import com.sipriano.marvel.base.Vehicle;

public class Car extends Vehicle {

    public int horsePower = 150;
    public String color = "Black";
    public double turningRadius = 6.23;
    public boolean isAutomatic = true;

    public static void start() {
        System.out.println("Car starting");
    }


}
