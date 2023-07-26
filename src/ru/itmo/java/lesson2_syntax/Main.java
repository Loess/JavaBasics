package ru.itmo.java.lesson2_syntax;

public class Main {
    public static void main(String[] args) {
        Dog pes = new Dog();
        pes.setName("Vasya");
        pes.setHasTail(true);
        pes.setColor(Color.VARICOLORED);
        System.out.println(pes);

        Calculator calc = new Calculator();
        System.out.println(calc.divide(10000000001L,500)); //typecast
        System.out.println(calc.divide(1,3));
        System.out.println(calc.divide(1.0,3)); //typecast
        System.out.println(calc.add(2000000000,1000000000)); //int overflow
        System.out.println(calc.add(2000000000L,1000000000)); //typecast
    }
}
