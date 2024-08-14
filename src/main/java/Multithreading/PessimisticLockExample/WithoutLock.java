package Multithreading.PessimisticLockExample;

import java.util.concurrent.locks.ReentrantLock;

/**
 * Author : Rajdeep Deb
 * Date   : 11-08-2024
 * Time   : 03:01 PM
 */
public class WithoutLock {
    private static int counter = 0;
    private static final ReentrantLock lock = new ReentrantLock();

    public static void main(String[] args) throws InterruptedException {
        Thread[] threads = new Thread[10000];

        for (int i = 0; i < 10000; i++) {
            threads[i] = new Thread(() -> {
                counter++;
            });

            threads[i].start();
        }

        for (Thread thread : threads) {
            thread.join();
        }

        System.out.println("Counter without lock: " + counter);
    }
}
