package ru.itmo.java.lesson4;

public class First {
    static {
        for (int i = 1; i < 100; i = i + 2) {
            System.out.println(i);
        }
    }
}