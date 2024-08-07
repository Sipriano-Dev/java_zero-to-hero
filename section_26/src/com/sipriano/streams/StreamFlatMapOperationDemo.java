package com.sipriano.streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class StreamFlatMapOperationDemo {

    public static void main(String[] args) {

        String[] arrayOfNames = {"Anderson", "Gabrielle"};
        Stream<String> streamOfWords = Arrays.stream(arrayOfNames);
        //split() returns an array
        Stream<String[]> streamOfLetters = streamOfWords.map(word -> word.split(""));
        streamOfLetters.flatMap(Arrays::stream).forEach(System.out::println);

        List<Person> persons = List.of(
                new Person("Anderson", List.of("123", "234")),
                new Person("Gabrielle", List.of("345", "346")));

        List<List<String>> mapResult = persons.stream().map(Person::getPhoneNumbers).toList();

        //With flatMap, it's gonna be one string will all numbers, and not separated like before
        List<String> flatMapResult = persons.stream().flatMap(person -> person.getPhoneNumbers().stream()).toList();
        System.out.println(flatMapResult);

    }

}
