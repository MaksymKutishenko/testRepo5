package org.example;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        System.out.println("Hello world!");

        for (int i = 0; i < 15; i++) {
            System.out.println(System.currentTimeMillis() / 1000);
            Thread.sleep(1000);
        }
    }
}
