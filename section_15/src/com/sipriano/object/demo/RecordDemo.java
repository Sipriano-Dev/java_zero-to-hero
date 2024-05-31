package com.sipriano.object.demo;

/**
 * 1) making the class as final
 * 2) make the fields as final and private
 * 3) generate the getter methods without any get prefix
 * 4) Generate a constructor with the fields mentioned inside the record header
 * 5) toString, equals and hashcode
 * @param name
 * @param occupation
 */

public class RecordDemo {

    public static void main(String[] args) {

        PersonRecord person = new PersonRecord("Anderson", "Programmer");

        System.out.println(person.name());
        System.out.println(person.occupation());

    }

}
