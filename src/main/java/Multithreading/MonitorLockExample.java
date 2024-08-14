package Multithreading;

/**
 * Author : Rajdeep Deb
 * Date   : 10-08-2024
 * Time   : 01:35 PM
 */
public class MonitorLockExample {

    public synchronized  void task1(){

        try {
            System.out.println("Inside task 1");
            Thread.sleep(10000);
            System.out.println("Task 1 completed");
        } catch (Exception e) {


        }


    }
    public void task2(){

        System.out.println("task 2 ,but before synchronized");

        synchronized (this){

            System.out.println("task 2,inside synchronized");
        }
    }
    public void task3(){

        System.out.println("Inside task3");
    }
    public synchronized  void task4(){

        System.out.println("Inside task4");
    }
}
