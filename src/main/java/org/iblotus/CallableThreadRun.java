package org.iblotus;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class CallableThreadRun {

    public void start(){
        ExecutorService e = Executors.newFixedThreadPool(3);
        //submit方法有多重参数版本，及支持callable也能够支持runnable接口类型.
        Future<String> future = e.submit(new MyCallable());
        future.isDone();
        try {
            String s = future.get();
            System.out.println(s);
        } catch (InterruptedException ex) {
            throw new RuntimeException(ex);
        } catch (ExecutionException ex) {
            throw new RuntimeException(ex);
        }
        e.shutdown();
    }
}
