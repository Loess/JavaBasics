package ru.itmo.java.lesson14_threads;

public class Thread0to100 extends Thread {

    private boolean showInfo = false;

    @Override
    public void run() {
        for (int i = 0; i <= 100; i++) {
            System.out.print(i + " ");
            if (showInfo && i == 50){
                System.out.println(this.getState());
            }
        }
    }

    public Thread0to100(boolean showInfo, boolean start) {
        this.showInfo = showInfo;
        if (showInfo){
            System.out.println();
            System.out.println(this.getState());
        }
        if (start){
            this.start();
        }

    }
}
