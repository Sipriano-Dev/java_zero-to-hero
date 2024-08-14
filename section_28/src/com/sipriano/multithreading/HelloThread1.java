package com.sipriano.multithreading;

public class HelloThread1 implements Runnable{

    @Override
    public void run() {
        System.out.println("Hello Thread1 class " +
                "that implements Runnable");
    }

}
