package com.sipriano.object.demo;

import java.lang.reflect.RecordComponent;

public class RecordDemo {

    public static void main(String[] args) {

        PersonRecord person = new PersonRecord("Anderson", "Programmer");

        System.out.println(person.name());
        System.out.println(person.occupation());

        System.out.println(person.getClass().isRecord());

        RecordComponent[] recordComponents = person.getClass().getRecordComponents();
        for (RecordComponent r: recordComponents) {
            System.out.println(r.toString());
        }

    }

}
