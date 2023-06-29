package ru.itmo.java.lesson4;

import java.util.Arrays;
import java.util.Scanner;

public class InputArray {
    public static void doShtota() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Array length: ");
        int elementCount = scanner.nextInt();
        int[] array = new int[elementCount];

        System.out.println("Numbers of array: ");
        for (int i = 0; i < elementCount; i++) {
            array[i] = scanner.nextInt();
        }
        System.out.print("Result: " + Arrays.toString(array));

    }
}
