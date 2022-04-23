package org.iblotus;

public class TwoThreadCount {

    private final Object locker1 = new Object();

    private int count = 0;

    public void start(){

        // t1线程对变量+5000次
        Thread t1 = new Thread(() -> {
            for (int i = 0; i < 5000; i++) {

                synchronized (locker1){
                    count++;
                }
            }
        });
        // t2线程对变量-5000次
        Thread t2 = new Thread(() -> {
            for (int i = 0; i < 5000; i++) {

                synchronized (locker1){
                    count--;
                }
            }
        });

        t1.start();
        t2.start();

        // 让t1 t2都执行完
        try {
            t1.join();
            t2.join();

        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println(count);
    }
}
