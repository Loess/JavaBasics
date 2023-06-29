package ru.itmo.java.lesson4;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        new First();

        //Second
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

        //Third
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите первое число:");
        int x1 = scanner.nextInt();
        System.out.println("Введите второе число:");
        int x2 = scanner.nextInt();
        System.out.println("Введите третье число:");
        int x3 = scanner.nextInt();
        System.out.println("Результат: " + (x1 + x2 == x3 ? true : false));

        //Fourth
        System.out.println("Введите первое число:");
        x1 = scanner.nextInt();
        System.out.println("Введите второе число:");
        x2 = scanner.nextInt();
        System.out.println("Введите третье число:");
        x3 = scanner.nextInt();
        System.out.println("Результат: " + (x2 > x1 && x3 > x2 ? true : false));

        //Fifth
        int[] array5 = {2, -3, 7, 4, 5, 4, 3};
        if (array5.length >= 2) {
            if (array5[0] == 3 || array5[array5.length - 1] == 3) {
                System.out.println(true);
            } else System.out.println(false);
        } else System.out.println("array len <2");

        //Sixth
        int arrayLen = array5.length;
        boolean haveInt = false;
        for (int i = 1; i <= arrayLen; i++) {
            if (array5[i - 1] == 1 || array5[i - 1] == 3) {
                haveInt = true;
                break;
            }
        }
        System.out.println("Array " + (haveInt ? "contains " : "does not contain ") + "val of 1 or 3");

    }
}
