package org.iblotus;

public class Main {


    public static void main(String[] args){

        TwoThreadCount twoThreadCount = new TwoThreadCount();
        twoThreadCount.start();

        TwoThreadCountWithLock threadCountWithLock = new TwoThreadCountWithLock();
        threadCountWithLock.start();

        ThreadInterrupt interrupt = new ThreadInterrupt();
        interrupt.start();
    }
}