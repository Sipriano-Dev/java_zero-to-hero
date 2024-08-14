package com.sipriano.multithreading;

public class ThreadDemo {

    public static void main(String[] args) {

        Thread thread = new Thread();
        thread.start();

        Thread thread1 = new Thread(() -> System.out.println("Hello from java thread 1"));
        thread1.start();

        Runnable runnable = () -> System.out.println("Hello from java thread 2");
        Thread thread2 = new Thread(runnable);
        thread2.start();

        System.out.println("Hello from main thread");

    }

}
