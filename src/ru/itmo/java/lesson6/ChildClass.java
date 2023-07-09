package ru.itmo.java.lesson6;


public class ChildClass extends MainClass {
    private String name;

    //В классе-наследнике:
    //●	метод для вывода переменной из главного класса.
    public int getParentDigit() {
        return super.digit;
    }

    //●	переопределенный метод для получения имени пользователя;
    @Override
    public void setUserInfo() {
        super.setUserInfo();
        System.out.println("Введите имя:");
        this.name = this.scanner.next();
    }

    @Override
    public String toString() {
        return "ChildClass{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", digit=" + digit +
                '}';
    }
}
