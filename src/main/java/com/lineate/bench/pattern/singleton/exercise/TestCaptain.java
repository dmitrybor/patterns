package com.lineate.bench.pattern.singleton.exercise;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.ThreadPoolExecutor;

public class TestCaptain {

    public static void main(String[] args) {

        ThreadPoolExecutor executor =
                (ThreadPoolExecutor) Executors.newFixedThreadPool(3);

        List<Future<Object>> results = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            Future<Object> result = executor.submit(() -> {
                Captain s = Captain.get();
                System.out.println(Thread.currentThread().getName() + ": Captain reference: " + s);
                System.out.println(Thread.currentThread().getName() + ": Captain name: " + s.getName());
                return null;
            });
            results.add(result);
        }
        results.forEach(r -> {
            try {
                r.get();
            } catch (InterruptedException | ExecutionException e) {
                e.printStackTrace();
            }
        });
        executor.shutdown();
    }
}
