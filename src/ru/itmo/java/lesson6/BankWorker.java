package ru.itmo.java.lesson6;

public class BankWorker extends Man {
    //В класс Работник банка добавьте:
    //●	наследование класса Человек;
    //●	реализация функции для вывода информации;
    //●	строковое поле «название банка»;
    //●	конструктор для установки всех значений;
    private String bankName;

    public BankWorker(String name, String surname, String bankName) {
        this.bankName = bankName;
        this.name = name;
        this.surname = surname;
    }

    @Override
    public String toString() {
        return "BankWorker{" +
                "bankName='" + bankName + '\'' +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                '}';
    }

}
