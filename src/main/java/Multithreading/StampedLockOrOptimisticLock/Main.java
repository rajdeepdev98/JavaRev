package Multithreading.StampedLockOrOptimisticLock;

//import Multithreading.ReadWriteLock.SharedResource;

/**
 * Author : Rajdeep Deb
 * Date   : 11-08-2024
 * Time   : 02:02 PM
 */
public class Main {

    public static void main(String[] args) {

        SharedResource resource =new SharedResource();

        Thread th1=new Thread(()->{
            resource.producer();
        });
        Thread th2=new Thread(()->{
            resource.consumer();
        });

        th1.start();
        th2.start();

    }
}
