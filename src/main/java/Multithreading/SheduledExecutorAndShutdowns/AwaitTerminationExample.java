package Multithreading.SheduledExecutorAndShutdowns;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

/**
 * Author : Rajdeep Deb
 * Date   : 14-08-2024
 * Time   : 01:45 PM
 */
/**
 * Specific example of working of shutdownNow is in the commented section given below
* */
//public static void main(String[] args) throws InterruptedException {
//        ExecutorService executor = Executors.newFixedThreadPool(1);
//        executor.submit(new Runnable() {
//
//@Override
//public void run() {
//        while (true) {
//        if (Thread.currentThread().isInterrupted()) {
//        System.out.println("interrupted");
//        break;
//        }
//        }
//        }
//        });
//
//        executor.shutdown();
//        if (!executor.awaitTermination(100, TimeUnit.MICROSECONDS)) {
//        System.out.println("Still waiting after 100ms: calling System.exit(1)...");
//        System.exit(1);
//        }
//        System.out.println("Exiting normally...");
public class AwaitTerminationExample {

    public static void main(String[] args) {

        ExecutorService executor= Executors.newFixedThreadPool(5);
        executor.submit(()->{
            try{
                Thread.sleep(6000);
            }
            catch (Exception e){

            }
            System.out.println("New task");
        });

        executor.shutdown();
        try{
            boolean isTerm=executor.awaitTermination(2, TimeUnit.SECONDS);
            System.out.println("Main thread,executor is terminated? "+isTerm);
            System.out.println(executor.isShutdown());
            System.out.println(executor.isTerminated());

        }catch ( Exception e){

        }
    }
}
