package ru.itmo.java.lesson9_collections;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        //2
        System.out.println(removeDups(List.of(1, 2, 2, 3, 4, 4)));

        //3
        ArrayList arraylist = new ArrayList();
        LinkedList linkedlist = new LinkedList();
        add1mElements(arraylist);
        add1mElements(linkedlist);
        long mstime = System.currentTimeMillis();
        get100kElements(arraylist);
        System.out.println(System.currentTimeMillis() - mstime + " ms"); //14 ms
        get100kElements(linkedlist);
        System.out.println(System.currentTimeMillis() - mstime + " ms"); //133378 ms

        //4
        Map<User, Integer> map = new HashMap<>();
        map.put(new User("Vasya"), 100);
        map.put(new User("Petya"), 200);
        map.put(new User("Katya"), 300);
        Scanner scanner = new Scanner(System.in);
        System.out.println("give me name:");
        String input = scanner.nextLine();

        boolean isUserFound = false;
        for (User user : map.keySet()) {
            if (user.getName().equals(input)) {
                System.out.println(input + " have " + map.get(user) + " points");
                isUserFound = true;
            }
        }
        if (!isUserFound) {
            System.out.println("User " + input + " is not found!");
        }

    }

    public static Collection removeDups(Collection col) {
        Set set = new HashSet<>(col);
        return set;
    }

    public static void add1mElements(List list) {
        for (int i = 0; i < 1000000; i++) {
            list.add(i);
        }
    }

    public static void get100kElements(List list) {
        Random random = new Random();
        int len = list.size();
        for (int i = 0; i < 100000; i++) {
            list.get(random.nextInt(len));
        }
    }


}
