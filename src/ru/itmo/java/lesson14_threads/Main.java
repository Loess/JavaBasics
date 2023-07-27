package ru.itmo.java.lesson14_threads;

import java.util.ArrayList;
import java.util.concurrent.CountDownLatch;

public class Main {
    public static void main(String[] args) throws InterruptedException {
//● Напишите программу, в которой запускается 10 потоков и каждый из них выводит числа от 0 до 100.
        for (int i = 0; i < 10; i++) {
            new Thread0to100(false, true);
        }

        Thread currentThread = Thread.currentThread();
        currentThread.sleep(1000);

//● Выведете состояние потока перед его запуском, после запуска и во время выполнения.
        Thread one = new Thread0to100(true, false);
        one.start();
        one.join();
        System.out.println(one.getState());

//Напишите программу, в которой запускается 100 потоков, каждый из которых вызывает метод increment() 1000 раз.
//После того, как потоки завершат работу count должен быть равен 100000 при  каждом запуске программы .
//Если обнаружилась проблема, предложите ее решение.
        Counter counter = new Counter();
        CountDownLatch latch = new CountDownLatch(100*1000);
        for (int i = 0; i < 100; i++) {
            Thread thread = new Thread() {
                @Override
                public void run() {
                    synchronized (counter) {
                        for (int j = 0; j < 1000; j++) {
                            counter.increment();
                            latch.countDown();
                        }
                    }
                    System.out.println(counter.getCount() + " at the end of " + this.getName());
                }
            };
            thread.start();
        }
        latch.await();
        System.out.println(counter.getCount());

//● Напишите программу, в которой создаются два потока, каждый из которых выводит
//по очереди на консоль своё имя.
//Начать можно с написания своего класс-потока, который выводит в бесконечном
//цикле свое имя. Потом придется добавить синхронизацию с помощью wait() и
//notify().
        Object lock = new Object();
        Thread threadOne = new Thread() {
            @Override
            public void run() {
                while (!this.isInterrupted()) {
                    synchronized (lock) {
                        System.out.println(this.getName());
                        lock.notify();
                        try {
                            lock.wait();
                        } catch (InterruptedException e) {
                            this.interrupt();
                        }
                    }
                }
                System.out.println(this.getName() + " is interrupted");
            }
        };

        Thread threadTwo = new Thread() {
            @Override
            public void run() {
                while (!this.isInterrupted()) {
                    synchronized (lock) {
                        System.out.println(this.getName());
                        lock.notify();
                        try {
                            lock.wait();
                        } catch (InterruptedException e) {
                            this.interrupt();
                        }
                    }
                }
                System.out.println(this.getName() + " is interrupted");
            }
        };
        threadOne.start();
        threadTwo.start();

        currentThread.sleep(10);
        threadOne.interrupt();
        threadTwo.interrupt();
    }
}
