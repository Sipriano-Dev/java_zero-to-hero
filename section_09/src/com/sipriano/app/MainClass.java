package com.sipriano.app;

import com.sipriano.model.Employee;
import com.sipriano.model.Vehicle;

import com.sipriano.utility.MyConstants;
import static java.lang.Math.PI;

public class MainClass {

    public static void main(String[] args) {

        Vehicle vehicle = new Vehicle();
        Employee employee = new Employee();

        String str = new String("Hello"); //all class in java.lang doesn't need import
        Integer num;

        System.out.println(MyConstants.SHIPPING_COST);
        System.out.println(MyConstants.TAX_RATE);

        System.out.println(MyConstants.calculateTotalCost(9.99));

        System.out.println(PI);

    }

}
