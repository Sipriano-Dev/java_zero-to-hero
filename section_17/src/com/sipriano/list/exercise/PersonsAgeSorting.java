package com.sipriano.list.exercise;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class PersonsAgeSorting {

    public static List<Person> sortPersonsUsingAge() {
        var persons = new ArrayList<Person>();
        persons.add(new Person("Sneha", 34));
        persons.add(new Person("James", 65));
        persons.add(new Person("Jenna", 30));
        persons.add(new Person("Harry", 29));

        persons.sort(Comparator.naturalOrder());
        return persons;
    }

    public static void main(String[] args) {
        System.out.println(PersonsAgeSorting.sortPersonsUsingAge());
    }

}
