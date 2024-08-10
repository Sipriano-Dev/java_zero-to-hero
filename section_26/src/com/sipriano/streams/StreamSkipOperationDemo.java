package com.sipriano.streams;

import java.util.Random;
import java.util.stream.Stream;

public class StreamSkipOperationDemo {

    public static void main(String[] args) {
        Stream.iterate(1, n -> n+1).skip(5).limit(5).forEach(System.out::println);
    }

}
