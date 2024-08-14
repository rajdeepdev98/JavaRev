package Multithreading.PessimisticLockExample;

import java.util.concurrent.locks.ReentrantLock;

/**
 * Author : Rajdeep Deb
 * Date   : 11-08-2024
 * Time   : 02:59 PM
 */
public class WithLock {

    private static int counter = 0;
    private static final ReentrantLock lock = new ReentrantLock();

    public static void main(String[] args) throws InterruptedException {
        Thread[] threads = new Thread[10000];

        for (int i = 0; i < 10000; i++) {
            threads[i] = new Thread(() -> {
                lock.lock();
                try {
                    counter++;
                }catch(Exception e){

                }
                finally {
                    lock.unlock();
//                    System.out.println("Thread "+Thread.currentThread().getName());
                }
            });

            threads[i].start();
        }

        for (Thread thread : threads) {
            thread.join();
        }

        System.out.println("Counter with lock (pessimistic locking): " + counter);
    }
}
