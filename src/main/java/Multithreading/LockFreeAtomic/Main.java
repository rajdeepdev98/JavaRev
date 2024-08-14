package Multithreading.LockFreeAtomic;

/**
 * Author : Rajdeep Deb
 * Date   : 11-08-2024
 * Time   : 06:00 PM
 */
public class Main {

    public static void main(String[] args) {

        System.out.println("Atomic integer example....");
        SharedResource resource=new SharedResource();

        Thread th1=new Thread(()->{

            for(int i=1;i<=1000;i++)resource.increment();
        });
        Thread th2=new Thread(()->{

            for(int i=1;i<=1500;i++){
                resource.increment();
            }
        });

        th1.start();
        th2.start();

        try{
            th1.join();
            th2.join();
        }
        catch (Exception e){

        }
        System.out.println(resource.get());

    }
}
