package ru.itmo.java.lesson6_oop;

//В класс Человек добавьте:
//●	поля: имя, фамилия;
//●	метод для получение имени;
//●	метод для получение фамилии;
//●	абстрактный метод для вывода всей информации;
//●	конструктор для установки значений.
public abstract class Man {
    protected String name, surname;

    public void Man(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public abstract String toString();
}
