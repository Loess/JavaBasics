package ru.itmo.java.lesson3_static;

import java.time.Year;

public class House {
    private int stageCount;
    private int yearOfBuild;
    private String name;

    public void setParams(int stageCount, int yearOfBuild, String name) {
        this.stageCount = stageCount;
        this.yearOfBuild = yearOfBuild;
        this.name = name;
    }

    public int showAge() {
        return Year.now().getValue() - this.yearOfBuild;
    }

    @Override
    public String toString() {
        return "House{" +
                "stageCount=" + stageCount +
                ", yearOfBuild=" + yearOfBuild +
                ", name='" + name + '\'' +
                '}';
    }
}

class JavaProgram3 {
    public static void main(String[] args) {
        House scilla = new House();
        House noble = new House();
        scilla.setParams(10, 1987, "Scilla");
        System.out.println(scilla);
        noble.setParams(3, 1965, "Noble");
        System.out.println(noble);
        System.out.println(noble.showAge());

    }
}

