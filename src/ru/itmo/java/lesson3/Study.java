package ru.itmo.java.lesson3;

class Study {

    private String course;

    public Study(String text) {
        this.course = text;
    }

    public String printCourse() {
        return this.course;
    }
}

class JavaProgram {
    public static void main(String[] args) {
        System.out.println(new Study("Изучение Java - это просто!").printCourse());
    }
}
