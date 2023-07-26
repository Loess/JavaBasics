package ru.itmo.java.lesson6_oop;

public class Client extends Man {
    //В класс Клиент добавьте:
    //●	наследование класса Человек;
    //●	реализация функции для вывода информации;
    //●	строковое поле «название банка»;
    //●	конструктор для установки всех значений;
    private String bankName;

    public Client(String name, String surname, String bankName) {
        this.bankName = bankName;
        this.name = name;
        this.surname = surname;
    }

    @Override
    public String toString() {
        return "Client{" +
                "bankName='" + bankName + '\'' +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                '}';
    }

}
