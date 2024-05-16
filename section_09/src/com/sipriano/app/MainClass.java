package com.sipriano.app;

import com.sipriano.model.Class1;
import com.sipriano.model.Employee;
import com.sipriano.model.Person;
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

        Class1 c1 = new Class1();
        com.sipriano.service.Class1 c2 = new com.sipriano.service.Class1(); //same name, complete qualified name is needed

        MyOuterClass.MyInnerClass myInnerClass = new MyOuterClass.MyInnerClass();
        myInnerClass.display();

        AccessModifiersDemo amd = new AccessModifiersDemo();

        Person person = new Person();
        person.firstName = "John";
        person.lastName = "Doe";
        person.age = 35;
        person.salary = 10000.00;

    }

}
