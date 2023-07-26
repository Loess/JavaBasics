package ru.itmo.java.lesson5_string;

public class Main {
    public static void main(String[] args) {
        //1.	Написать метод для поиска самого длинного слова в тексте.
        String a = "Если б мишки были пчёлами, то они бэ нипачём никогда и не подумали так высоко строить дом, бяка";
        System.out.println(getLongestWord(a));
        //2.	Написать метод, который проверяет является ли слово палиндромом.
        String b = "Lol";
        System.out.println(isPalyndrome(b));
        //3.	Напишите метод, заменяющий в тексте все вхождения слова «бяка» на «[вырезано цензурой]».
        System.out.println(replacer(a, "бяка", "[вырезано цензурой]"));
        //4.	Имеются две строки. Найти количество вхождений одной (являющейся подстрокой) в другую.
        System.out.println(substrCount("1234f56654", "4"));
        //5.	Напишите метод, который инвертирует слова в строке. Предполагается, что в строке нет знаков препинания, и слова разделены пробелами.
        System.out.println(invertWords(a));

    }

    private static String getLongestWord(String a) {
        String[] array = a.replaceAll("((?![A-zА-яЁё ]).)", " ").split(" "); //extract all words
        String longestWord = "";
        for (String s : array) {
            if (s.length() > longestWord.length()) {
                longestWord = s;
            }
        }
        return longestWord;
    }

    private static boolean isPalyndrome(String a) {
        StringBuilder s = new StringBuilder(a.toLowerCase());
        if (a.toLowerCase().equals(s.reverse().toString())) {
            return true;
        }
        return false;
    }

    private static String replacer(String where, String from, String to) {
        return where.replace(from, to);
    }

    private static int substrCount(String where, String what) {
        int count = 0;
        if (where.contains(what)) {
            count = (where + " ").split(what).length - 1;
        }
        return count;
    }

    private static String invertWords(String a) {
        String[] array = a.replaceAll("((?![A-zА-яЁё ]).)", " ").split(" "); //extract all words
        StringBuilder s = new StringBuilder();
        StringBuilder result = new StringBuilder();
        for (String iter : array) {
            s.setLength(0);
            s.append(iter);
            result.append(s.reverse()).append(" ");
        }
        return result.toString();
    }
}
