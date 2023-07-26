package ru.itmo.java.lesson6_oop;

public class Truck extends Car {
    //В классе Грузовик создайте поля:
    //●	количество колес;
    //●	максимальный вес.
    //
    //Также создайте метод newWheels, который устанавливает новое значение в поле «количество колес» и выводит его в консоль.
    //
    //В класс Грузовик сделайте конструктор, устанавливающий все значения в конструктор главного класса и все значения в класс Грузовик.

    public int maxWeight;
    public int wheelCount;

    public Truck(int w, String m, char c, float s, int maxWeight, int wheelCount) {
        super(w, m, c, s);
        this.maxWeight = maxWeight;
        this.wheelCount = wheelCount;
    }

    public void setWheelCount (int count) {
        this.wheelCount = count;
        System.out.println("New wheel count = " + this.wheelCount);
    }

}
