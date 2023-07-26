package ru.itmo.java.lesson3_static;

public class ColorNameWeight {
    public String color;
    private String name;
    private int weight;

    public ColorNameWeight(String color, String name, int weight) {
        this.color = color;
        this.name = name;
        this.weight = weight;
    }

    public ColorNameWeight(String color) {
        this.color = color;
    }

    public ColorNameWeight(String color, int weight) {
        this.color = color;
        this.weight = weight;
    }

    public ColorNameWeight() {

    }

    @Override
    public String toString() {
        return "ColorNameWeight{" +
                "color='" + color + '\'' +
                ", name='" + name + '\'' +
                ", weight=" + weight +
                '}';
    }
}

class JavaProgram2 {
    public static void main(String[] args) {
        ColorNameWeight obj1 = new ColorNameWeight("funny", "object1", 10);
        ColorNameWeight obj2 = new ColorNameWeight("white", 10);
        System.out.println(obj1);
        obj1.color = "not funny";
        System.out.println(obj1);
        System.out.println(obj2);
    }
}
