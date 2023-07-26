package ru.itmo.java.lesson3_static;

public class Tree {
    private int age;
    private boolean isAlive;
    private String name;

    public Tree(int age, String name) {
        this.age = age;
        this.name = name;
    }

    public Tree(int age, boolean isAlive, String name) {
        this.age = age;
        this.isAlive = isAlive;
        this.name = name;
    }

    public Tree() {
        System.out.println("Пустой конструктор без параметров сработал");
    }

}

class JavaProgram4 {
    public static void main(String[] args) {
        Tree oak = new Tree(3, "Young Oak");
        Tree pine = new Tree(15, true, "Old Tree");
        Tree ash = new Tree();

    }
}
