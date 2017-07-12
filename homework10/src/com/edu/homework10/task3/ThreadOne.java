package com.edu.homework10.task3;

public class ThreadOne extends Thread {
    private Thread threadToRun;

    public ThreadOne(Thread threadToRun) {
        this.threadToRun = threadToRun;
    }

    @Override
    public void run() {
    	System.out.println("Thread number one");
    	threadToRun.start();
    }
}