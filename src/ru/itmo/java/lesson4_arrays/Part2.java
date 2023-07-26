package ru.itmo.java.lesson4_arrays;

import java.util.Arrays;

public class Part2 {
    public static void main(String[] args) {
        //1
        //int[] array1 = {2, -3, 7, 4, 5, 4, 3};
        int[] array1 = {1, 2, 3, 4, 0};
        System.out.println(IsSorted.test(array1));

        //2
        InputArray.doShtota();

        //3
        System.out.println("Array 1: " + Arrays.toString(array1));
        Part2.swapFirstLast(array1);
        System.out.println("Array 2: " + Arrays.toString(array1));

        //4
        int[] array2 = {1, 2, 3, 3, 2, 4, 1, 4, -9};
        System.out.println(Part2.findUnique(array2));

        //5. Заполните массив случайным числами и отсортируйте его. Используйте сортировку слиянием. *опционально
        //6. ***Прочитать главы 1-4 “Грокаем алгоритмы” *опционально
    }

    public static int[] swapFirstLast(int[] array) {
        int temp = array[0];
        array[0] = array[array.length - 1];
        array[array.length - 1] = temp;
        return array;
    }

    /**
     *
     * @param array of int
     * @return unique int in array, null if not found
     */
    public static Integer findUnique(int[] array) {
        int arrayLen = array.length;
        for (int i = 0; i < arrayLen; i++) {
            boolean isUnique = false;
            for (int j = 0; j < arrayLen; j++) {
                isUnique = false;
                if (array[i] == array[j] && i != j) {
                    break;
                } else {
                    isUnique = true;
                }
            }

            if (isUnique) {
                return array[i];
            }
        }
        return null;
    }

}
