package com.sipriano.marvel.app;

import com.sipriano.marvel.base.Vehicle;
import com.sipriano.marvel.vehicle.Car;

public class TestMethodHiding {

    public static void main(String[] args) {

        Vehicle vehicle = new Car();
        Car car = new Car();

        Vehicle.start(); //Vehicle starting
        vehicle.start(); //Vehicle starting, static poly, will not see the object only reference

        Car.start(); //Car starting
        car.start(); //Car starting
        ((Vehicle)car).start(); //Vehicle starting (UppCasting)

        vehicle = car;
        vehicle.start(); //Vehicle starting

        ((Car)vehicle).start(); //Car starting (DownCasting)

    }

}
