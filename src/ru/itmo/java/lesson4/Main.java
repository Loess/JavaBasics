package ru.itmo.java.lesson4;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        new First();
        task2();
        task3();
        task4();

        int[] array = {2, -3, 7, 4, 5, 4, 3};
        task5(array);

        task6(array);

    }

    public static void task2() {
        System.out.println("Делится на 3:");
        for (int i = 1; i <= 100; i++) {
            System.out.print(i % 3 == 0 ? i + " " : "");
        }
        System.out.println("\nДелится на 5:");
        for (int i = 1; i <= 100; i++) {
            System.out.print(i % 5 == 0 ? i + " " : "");
        }
        System.out.println("\nДелится на 3 и на 5:");
        for (int i = 1; i <= 100; i++) {
            System.out.print(i % 5 == 0 && i % 3 == 0 ? i + " " : "");
        }
        System.out.println();
    }

    public static void task3() {
        System.out.println("Введите первое число:");
        Scanner scanner = new Scanner(System.in);
        int x1 = scanner.nextInt();
        System.out.println("Введите второе число:");
        int x2 = scanner.nextInt();
        System.out.println("Введите третье число:");
        int x3 = scanner.nextInt();
        System.out.println("Результат: " + (x1 + x2 == x3));
    }

    public static void task4() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите первое число:");
        int x1 = scanner.nextInt();
        System.out.println("Введите второе число:");
        int x2 = scanner.nextInt();
        System.out.println("Введите третье число:");
        int x3 = scanner.nextInt();
        System.out.println("Результат: " + (x2 > x1 && x3 > x2 ? true : false));
    }

    public static void task5(int[] array) {
        if (array.length >= 2) {
            System.out.println((array[0] == 3 || array[array.length - 1] == 3));
        } else System.out.println("array len <2");
    }

    public static void task6(int[] array) {
        int arrayLen = array.length;
        boolean haveInt = false;
        for (int i = 1; i <= arrayLen; i++) {
            if (array[i - 1] == 1 || array[i - 1] == 3) {
                haveInt = true;
                break;
            }
        }
        System.out.println("Array " + (haveInt ? "contains " : "does not contain ") + "val of 1 or 3");
    }
}
