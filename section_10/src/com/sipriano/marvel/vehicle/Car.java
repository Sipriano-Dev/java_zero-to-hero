package com.sipriano.marvel.vehicle;

import com.sipriano.marvel.base.Engine;
import com.sipriano.marvel.base.Vehicle;

public class Car extends Vehicle {

    public int horsePower;
    public String color;
    public double turningRadius;
    public boolean isAutomatic;

    public Car() {
        super("Water");
        System.out.println("Inside car default constructor");
        horsePower = 150;
        color = "Black";
        turningRadius = 6.23;
        isAutomatic = true;
    }

    public static void start() {
        System.out.println("Car starting");
    }


}
