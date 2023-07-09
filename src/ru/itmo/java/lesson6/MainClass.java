package ru.itmo.java.lesson6;

import java.util.Scanner;

public class MainClass {
    //В главном классе:
    //●	создайте поле для ввода целого числа;
    protected int digit = 123;

    protected int age;

    //●	метод для получения возраста пользователя;
    Scanner scanner = new Scanner(System.in);
    public void setUserInfo() {
        System.out.println("Введите возраст:");
        this.age = this.scanner.nextInt();
    }
}
