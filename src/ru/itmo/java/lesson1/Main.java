package ru.itmo.java.lesson1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //1.1
        System.out.println("Я");
        System.out.println("хорошо");
        System.out.println("знаю");
        System.out.println("Java.");

        //1.2
        double x;
        x = (46 + 10) * (double)(10 / 3d);
        System.out.println(x);
        int y;
        y = (29) * (4) * (-15);
        System.out.println(y);

        //1.3
        int number = 10500;
        int result;
        result=(number / 10) / 10;
        System.out.println(result);

        //1.4
        double result2;
        result2 = 3.6 * 4.1 * 5.9;
        System.out.println(result2);

        //1.5
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input 3 integers separated by newlines:");
        int x1 = scanner.nextInt();
        int x2 = scanner.nextInt();
        int x3 = scanner.nextInt();
        System.out.println(x1 + "\n" + x2 + "\n" + x3);

        //1.6
        for (int i = 1; i <= 6; i++) {
            System.out.println("Input 1 integer for b variable:");
            int b = scanner.nextInt();
            if (b % 2 != 0){
                System.out.println("Нечётное");
            } else if (b > 100) {
                System.out.println("Выход за пределы диапазона");
            } else {
                System.out.println("Чётное");
            }
//            System.out.println((b % 2 != 0) ? "Нечётное" : (b > 100) ? "Выход за пределы диапазона" : "Чётное");
        }
    }
}
