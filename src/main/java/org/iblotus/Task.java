package org.iblotus;

/**
 * Runnable
 */
public class Task implements Runnable {

    private String msg;

    private Object lock = new Object();

    public Task(String msg) {
        this.msg = msg;
    }

    public void run() {
        synchronized(lock){
            System.out.println(msg);
        }
    }
}
