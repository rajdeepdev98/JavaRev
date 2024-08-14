package Multithreading.FutureExamples;

import java.util.concurrent.*;

/**
 * Author : Rajdeep Deb
 * Date   : 13-08-2024
 * Time   : 07:17 PM
 */
public class CompletableFutureExample {

    //Introduced in Java 8
    // Advanced version of Future and helps in chaining  and async programming
    public static void main(String[] args) {

        System.out.println("Completable future example");

        ThreadPoolExecutor executor = new ThreadPoolExecutor(3, 3, 1, TimeUnit.HOURS, new ArrayBlockingQueue<>(10), Executors.defaultThreadFactory(), new ThreadPoolExecutor.AbortPolicy());
        try {
            CompletableFuture<String> asyncTask1 = CompletableFuture.supplyAsync(() -> {
                return "Task completed!";
            }, executor);

            System.out.println(asyncTask1.get());
        } catch (Exception e) {

        }

        System.out.println("thenApply example");//synchronous

        CompletableFuture<String> asyncTask1 = CompletableFuture.supplyAsync(() -> {

            return "Concept and ";
        }).thenApply((String val) -> {

            return val + "Coding";
        });

        try {
            System.out.println(asyncTask1.get());
        } catch (Exception e) {

        }
        //thenApplyAsync
        System.out.println("thenApplyAsync example");

        CompletableFuture<Void> asyncTask2 = CompletableFuture.supplyAsync(() -> {
            System.out.println("Thread which runs supplyAsync is " + Thread.currentThread().getName());
            return "Concept and ";
        }, executor).thenApplyAsync((String val) -> {
            System.out.println("Thread which runs thenApplyAsync is " + Thread.currentThread().getName());
            return val + "Coding";
        }, executor).thenApplyAsync((String val) -> {
            System.out.println("Thread which runs 2nd thenApplyAsync is " + Thread.currentThread().getName());
            return "Holaa " + val;
        }).thenAcceptAsync((String val) -> {
                    System.out.println(val);
//                    return null;
                }
        );

        try {
            System.out.println(asyncTask2.get());
        } catch (Exception e) {

        }
    }


}

