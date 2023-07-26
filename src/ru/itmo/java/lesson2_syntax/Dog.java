package ru.itmo.java.lesson2_syntax;

public class Dog {
    private String name;
    private Integer height;
    private Integer age;
    private String species;
    private Color color;
    private Boolean hasTail;

    public Dog() {

    }

    public Dog(String name, Integer height, Integer age, String species, Color color, Boolean hasTail) {
        this.name = name;
        this.height = height;
        this.age = age;
        this.species = species;
        this.color = color;
        this.hasTail = hasTail;
    }

    @Override
    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                ", height=" + height +
                ", age=" + age +
                ", species='" + species + '\'' +
                ", color=" + color +
                ", hasTail=" + hasTail +
                '}';
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setHeight(Integer height) {
        this.height = height;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public void setSpecies(String species) {
        this.species = species;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public void setHasTail(Boolean hasTail) {
        this.hasTail = hasTail;
    }
}
