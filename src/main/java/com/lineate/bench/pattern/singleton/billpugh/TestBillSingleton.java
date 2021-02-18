package com.lineate.bench.pattern.singleton.billpugh;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.ThreadPoolExecutor;

public class TestBillSingleton {

    public static void main(String[] args) {
        ThreadPoolExecutor executor =
                (ThreadPoolExecutor) Executors.newFixedThreadPool(3);

        List<Future<Object>> results = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            Future<Object> result = executor.submit(() -> {
                BillSingleton s = BillSingleton.getInstance();
                s.setData((int)Thread.currentThread().getId());
                System.out.println(Thread.currentThread().getName() + ": BillSingleton eference: " + s);
                System.out.println(Thread.currentThread().getName() + ": Data: " + s.getData());
                return null;
            });
            results.add(result);
        }
        results.forEach(r -> {
            try {
                r.get();
            } catch (InterruptedException e) {
                e.printStackTrace();
            } catch (ExecutionException e) {
                e.printStackTrace();
            }
        });
        executor.shutdown();
    }
}
