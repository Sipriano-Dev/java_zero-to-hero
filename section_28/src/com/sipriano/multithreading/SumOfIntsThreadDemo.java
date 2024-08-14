package com.sipriano.multithreading;

public class SumOfIntsThreadDemo {

    public static void main(String[] args) throws InterruptedException {

        long start = System.currentTimeMillis();
        long result;
        SumThread sumThread1 = new SumThread(0, Integer.MAX_VALUE/2);
        SumThread sumThread2 = new SumThread(Integer.MAX_VALUE/2+1, Integer.MAX_VALUE);
        sumThread1.start();
        sumThread2.start();
        sumThread1.join();
        sumThread2.join();
        result = sumThread1.getResult() + sumThread2.getResult();
        System.out.println(result);
        long end = System.currentTimeMillis();
        System.out.println("Time multithreading java class: " + (end - start));

    }

}
