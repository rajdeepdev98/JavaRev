package Multithreading.ReEntrantLock;

import java.util.concurrent.locks.ReentrantLock;

/**
 * Author : Rajdeep Deb
 * Date   : 11-08-2024
 * Time   : 12:44 PM
 */
public class Main {
    public static void main(String[] args) {
        ReentrantLock lock=new ReentrantLock();
        SharedResource resource1 = new SharedResource(lock);
        Thread t1=new Thread(()->{
          resource1.producer();
        });

        SharedResource resource2=new SharedResource(lock);
        Thread t2=new Thread(()->{
            resource2.producer();
        });
        t1.start();
        t2.start();
    }
}
