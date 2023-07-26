package ru.itmo.java.lesson6_oop;

public class Main {
    public static void main(String[] args) {
        //1.	Абстрактные классы
        BankWorker man = new BankWorker("Vasya","Pupkin","sber");
        System.out.println(man);

        //2.	Интерфейсы
        //Подумайте над тем, как можно использовать интерфейсы в связке с предыдущим заданием.
        // - можно использовать интерфейс вместо абстрактного класса Man.

        //3.	Есть класс автомобиль. Добавьте класс Грузовик, который будет наследовать все от класса Автомобиль.
        Truck truck = new Truck(1, "lol",(char) 'c',(float) 1.03,10,12);

        //4.	Создайте два класса: главный и класс-наследник.
        //Создайте объект на основе класса наследника и выведите через метод переменную с главного класса.
        ChildClass child = new ChildClass();
        System.out.println(child.getParentDigit());

        //5.	Создайте главный класс. Добавьте в него:
        //Создайте объект на основе класса-наследника и используйте для него метод из класса.
        //Подсказка: подумайте над переменными, так как объект класса Scanner удобнее создать лишь один раз в главном классе
        MainClass child2 = new ChildClass();
        System.out.println(child2.toString());
        child2.setUserInfo();
        System.out.println(child2.toString());

    }


}
