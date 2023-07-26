package ru.itmo.java.lesson10_files;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        //1.	Написать метод, который читает текстовый файл и возвращает его в виде списка строк.
        System.out.println(readFile("files/test1.txt"));

        //2.	Написать метод, который записывает в файл строку, переданную параметром.
        System.out.println(writeLine("a\n" +
                "b\n" +
                "cc\n" +
                "d&^%$^*dd1\n", "files/test1.txt", false));

        //3.	Используя решение 1 и 2, напишите метод, который склеивает два текстовый файла один.
        System.out.println(cat2Files("files/test1.txt", "files/test1.txt", "files/cat.txt"));

        //4.	Написать метод который заменяет в файле все кроме букв и цифр на знак ‘$’
        System.out.println(replaceNonReadables("files/test1.txt", "\\$"));
    }

    public static List readFile(String path) {
        List list = new ArrayList<String>();
        try (BufferedReader reader = new BufferedReader(new FileReader(path))) {
            String input;
            while ((input = reader.readLine()) != null) {
                list.add(input);
            }
        } catch (IOException e) {
            System.err.println(e.getMessage());
        }
        return list;
    }

    public static boolean writeLine(String string, String path, boolean append) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(path, append))) {
            writer.write(string + "\n");
            return true;
        } catch (IOException e) {
            System.err.println(e.getMessage());
            return false;
        }
    }

    public static boolean cat2Files(String firstfile, String secondfile, String outfile) {
        List<String> result = readFile(firstfile);
        result.addAll(readFile(secondfile));

        try (BufferedWriter writer = new BufferedWriter(new FileWriter(outfile, false))) {
            for (String str : result) {
                writer.write(str + "\n");
            }
            return true;
        } catch (IOException e) {
            System.err.println(e.getMessage());
            return false;
        }
    }

    public static boolean replaceNonReadables(String file, String to) {
        List<String> lines = readFile(file);

        try (BufferedWriter writer = new BufferedWriter(new FileWriter(file, false))) {
            writer.write("");
        } catch (IOException e) {
            System.err.println(e.getMessage());
        }

        for (String str : lines) {
            if (!writeLine(str.replaceAll("(?![A-Za-zА-Яа-яЁё \\d]).", to), file, true)) {
                return false;
            }
        }
        return true;
    }
}
