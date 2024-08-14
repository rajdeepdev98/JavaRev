package Multithreading.SheduledExecutorAndShutdowns;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * Author : Rajdeep Deb
 * Date   : 14-08-2024
 * Time   : 01:27 PM
 */
public class Shutdowns {
    public static void main(String[] args) {

        ExecutorService executor= Executors.newFixedThreadPool(5);

        //tasksubmission after shutdown->will throw error

        executor.submit(()->{

            System.out.println("Thread is going to start its work");

        });
        executor.shutdown();

        //trying to submit after shutdown(will throw error)

        try{
            executor.submit(()->{
                System.out.println("Trying again,after shutdown of executor");
            });
        }catch(Exception e){

            System.out.println("Error thrown due to submission after executor shutdown");
        }


        ExecutorService executor2=Executors.newFixedThreadPool(5);

        executor2.submit(()->{
            System.out.println("Starting new task");
            try{
                Thread.sleep(5000);
            }catch(Exception e){


            }
            System.out.println("Ending new task even after executor shutdown");

        });
        executor2.shutdown();
        System.out.println("Main thread unblocked and finished processing");

    }
}
