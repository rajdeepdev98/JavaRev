package Multithreading.ReadWriteLock;

import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/**
 * Author : Rajdeep Deb
 * Date   : 11-08-2024
 * Time   : 01:43 PM
 */
public class Main {

    public static void main(String[] args) {
        SharedResource resource = new SharedResource();
        ReadWriteLock lock = new ReentrantReadWriteLock();

        Thread th1=new Thread(()->{
            resource.producer(lock);
        });
        Thread th2=new Thread(()->{
            resource.producer(lock);
        });
        Thread th3=new Thread(()->{
            resource.consume(lock);
        });
        th1.start();
        th2.start();
        th3.start();
    }
}
