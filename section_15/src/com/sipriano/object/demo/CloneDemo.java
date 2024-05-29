package com.sipriano.object.demo;

public class CloneDemo {

    public static void main(String[] args) throws CloneNotSupportedException {

        Person p1 = new Person("Anderson", 35, 'M', 3463445);
        Person p2 =(Person) p1.clone();

        p2.setName("John");

        System.out.println(p1);
        System.out.println(p2);
    }

}
