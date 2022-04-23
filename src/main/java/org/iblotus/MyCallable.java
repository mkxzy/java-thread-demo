package org.iblotus;

import java.util.concurrent.Callable;

/**
 * Callable
 */
public class MyCallable implements Callable<String> {
    @Override
    public String call() throws Exception {

        System.out.println("");
        return "success";
    }
}
