package org.iblotus;

public class ThreadInterrupt {

    public void start(){
        Thread thread = new Thread(() -> {
            while (true) {
                System.out.println("I am alive");
                try {
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        });
//        thread.setDaemon(true);
        thread.start();
        thread.interrupt();
    }
}
