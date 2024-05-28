package com.sipriano.object.demo;

public class GetClassDemo {

    public static void main(String[] args) {

        Person person = new Person();
        System.out.println(person.getClass().getName());
        System.out.println(person.getClass().getSimpleName());
        System.out.println(person.getClass().getPackageName());

        System.out.println("----------------------");

        Class personClass = person.getClass();
        System.out.println(personClass.getName());
        System.out.println(personClass.getSimpleName());
        System.out.println(personClass.getPackageName());

    }

}
