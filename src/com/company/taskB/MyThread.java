package com.company.taskB;

public class MyThread implements Runnable {
    @Override
    public void run() {
        synchronized (this) {
            System.out.println(Thread.currentThread().getName());
        }
    }
}