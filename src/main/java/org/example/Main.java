package org.example;

public class Main { // test comment
    public static void main(String[] args) {
        System.out.println("Hello world!");

        for (int i = 0; i < 10; i++) {
            System.out.println(System.currentTimeMillis() / 5000);
            Thread.sleep(1000);
        }

        System.out.println("Hello from another planet!");
    }
}
