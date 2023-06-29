package ru.itmo.java.lesson4;

public class IsSorted {
    public static String test(int[] array) {
        boolean isAsc = false;
        int arrayLen = array.length;
        int j = 1;
        for (int i = 1; i < arrayLen; i++) {
            if (array[i - 1] + 1 == array[i]) {
                j++;
            } else break;
        }
        if (j == arrayLen) isAsc = true;
        return (isAsc ? "OK" : "Please, try again");
    }
}
