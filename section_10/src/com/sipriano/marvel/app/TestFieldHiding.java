package com.sipriano.marvel.app;

import com.sipriano.marvel.base.Vehicle;
import com.sipriano.marvel.vehicle.Car;

public class TestFieldHiding {

    public static void main(String[] args) {

        Car car = new Car();
        System.out.println(car.color); //Print what is in car
        System.out.println(car.horsePower);
        System.out.println(car.turningRadius);
        System.out.println(car.isAutomatic);

        System.out.println("--------------------");
        Vehicle vehicle = car;
        System.out.println(vehicle.color); //Print what is in vehicle
        System.out.println(vehicle.horsePower);
        System.out.println(vehicle.turningRadius);

    }

}
