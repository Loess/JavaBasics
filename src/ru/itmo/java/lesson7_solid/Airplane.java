package ru.itmo.java.lesson7_solid;

public class Airplane {

    class Wing {
        private int wingWeight;

        public void setWingWeight(int wingWeight) {
            this.wingWeight = wingWeight;
        }

        void showWingWeight(){
            System.out.println(this.wingWeight);
        }
    }


}
