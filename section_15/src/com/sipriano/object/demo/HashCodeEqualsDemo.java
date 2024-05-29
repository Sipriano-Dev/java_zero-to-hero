package com.sipriano.object.demo;

public class HashCodeEqualsDemo {

    public static void main(String[] args) {

        Person p1 = new Person("John", 35, 'M', 3564646);
        Person p2 = new Person("John", 35, 'M', 3564646);

        System.out.println(p1.hashCode()); //Based on address memory location
        System.out.println(p2.hashCode());

        System.out.println(p1.equals(p2)); //False, because it compares the address memory location
    }

}
