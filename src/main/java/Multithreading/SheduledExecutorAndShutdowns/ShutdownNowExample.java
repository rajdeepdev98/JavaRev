package Multithreading.SheduledExecutorAndShutdowns;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * Author : Rajdeep Deb
 * Date   : 14-08-2024
 * Time   : 01:36 PM
 */
public class ShutdownNowExample {

    public static void main(String[] args) {

        ExecutorService executor= Executors.newFixedThreadPool(5);


        executor.submit(()->{
            System.out.println("Starting new task");
            try{
                Thread.sleep(5000);
            }catch(Exception e){


            }
            System.out.println("Ending new task even after executor shutdown");

        });
        executor.shutdownNow();
        System.out.println("Main thread unblocked and finished processing");
    }
}
