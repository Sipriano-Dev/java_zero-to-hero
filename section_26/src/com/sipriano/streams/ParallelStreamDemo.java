package com.sipriano.streams;

import java.util.List;
import java.util.stream.Stream;

public class ParallelStreamDemo {

    public static void main(String[] args) {

        Stream<Integer> numStream = Stream.iterate(1, n -> n+1).limit(50);

        //Stream
        long startTime = System.currentTimeMillis();
        numStream.map(n ->
        {
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            return n * 2;
        }).toList();
        long endTime = System.currentTimeMillis();
        System.out.println("Time Stream: " + (endTime - startTime));

        //Parallel Stream
        Stream<Integer> numParallelStream = Stream.iterate(1, n -> n+1).limit(50).parallel();

        long startTime2 = System.currentTimeMillis();
        numParallelStream.map(n ->
        {
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            return n * 2;
        }).toList();
        long endTime2 = System.currentTimeMillis();
        System.out.println("Time parallelStream: " + (endTime2 - startTime2));

    }

}
