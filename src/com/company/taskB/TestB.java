package com.company.taskB;

public class TestB {
    public static void main(String[] args) {
        Thread threadGo = new Thread(new MyThread());
        Thread threadPHP = new Thread(new MyThread());
        Thread threadJava = new Thread(new MyThread());
        Thread threadPython = new Thread(new MyThread());
        Thread threadCSharp = new Thread(new MyThread());
        Thread threadJavaScript = new Thread(new MyThread());

        threadGo.setName("Go");
        threadPHP.setName("PHP");
        threadJava.setName("Java");
        threadCSharp.setName("C#");
        threadPython.setName("Python");
        threadJavaScript.setName("JavaScript");

        try {
            threadJava.start();
            threadJava.join();

            threadPython.start();
            threadPython.join();

            threadGo.start();
            threadGo.join();

            threadJavaScript.start();
            threadJavaScript.join();

            threadPHP.start();
            threadPHP.join();

            threadCSharp.start();
            threadCSharp.join();

        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}