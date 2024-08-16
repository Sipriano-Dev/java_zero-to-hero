package com.sipriano.multithreading;

public class DeadLockDemo {
    public static final String R1 = "Hello";
    public static final String R2 = "Hi";

    public static void main(String[] args) {
        Thread thread1 = new Thread(() -> {
            synchronized (R1) {
                System.out.println("Thread T1 locked : Resource R1");
                synchronized (R2) {
                    System.out.println("Thread T1 locked : Resource R2");
                }
            }
        });

        //To avoid deadlock you can put R1 first and R2 second in thread2
        Thread thread2 = new Thread(() -> {
            synchronized (R2) { //R1 -> avoid deadlock
                System.out.println("Thread T2 locked : Resource R2");
                synchronized (R1) { //R2 -> avoid deadlock
                    System.out.println("Thread T2 locked : Resource R1");
                }
            }
        });
        thread1.start();
        thread2.start();
    }

}
