package Multithreading;

/**
 * Author : Rajdeep Deb
 * Date   : 10-08-2024
 * Time   : 01:40 PM
 */
public class MultithreadingExamples {

    public void run(){

//        System.out.println("Monitor lock example");
//
//        MonitorLockExample obj1=new MonitorLockExample();
//        Thread t1=new Thread(()->{
//            obj1.task1();
//        });
//        Thread t2=new Thread(()->{
//            obj1.task2();
//        });
//        Thread t3=new Thread(()->{
//            obj1.task3();
//        });
//        Thread t4=new Thread(()->{
//            obj1.task4();
//        });
//
//        t1.start();
//        t2.start();
//        t3.start();
//        t4.start();


        System.out.println("Resource sharing example");

        SharedResource sharedResource=new SharedResource();
//        //producer thread
        Thread producerThread=new Thread( new ProduceTask(sharedResource));
        //consumer thread
        Thread consumerThread=new Thread(new ConsumeTask(sharedResource));

        //thread is in runnable state now
        producerThread.start();
        consumerThread.start();

        System.out.println("shared resource example ends...");

//        System.out.println("Producer consumer problem ...");
//        new ProducerConsumerProblem().run();


    }
}
