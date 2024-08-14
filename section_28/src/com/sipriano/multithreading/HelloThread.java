package com.sipriano.multithreading;

public class HelloThread extends Thread{

    @Override
    public void run() {
        System.out.println("Hello Thread class " +
                "that extends Thread");
    }

}
