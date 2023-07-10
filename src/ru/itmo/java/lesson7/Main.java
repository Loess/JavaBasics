package ru.itmo.java.lesson7;

public class Main {
    public static void main(String[] args) {
        Airplane airbus = new Airplane();
        Airplane.Wing airbusWing = airbus.new Wing();
        airbusWing.setWingWeight(11);

        Airplane kukuruz = new Airplane();
        Airplane.Wing kukuruzWing = kukuruz.new Wing();
        Airplane.Wing kukuruzWing2 = kukuruz.new Wing();
        kukuruzWing.setWingWeight(5);
        kukuruzWing2.setWingWeight(6);

        airbusWing.showWingWeight();
        kukuruzWing.showWingWeight();
        kukuruzWing2.showWingWeight();
    }
}
