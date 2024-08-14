package Multithreading.SheduledExecutorAndShutdowns;

import java.util.concurrent.*;

/**
 * Author : Rajdeep Deb
 * Date   : 14-08-2024
 * Time   : 01:59 PM
 */
public class ScheduledExecutorExample {

    public static void main(String[] args) {

        ScheduledExecutorService executor= Executors.newScheduledThreadPool(10);

        ScheduledFuture<?>scheduledObj=executor.schedule(()->{
            System.out.println("Only schedule one task after a delay of 5 seconds");
        },5,TimeUnit.SECONDS);

        ScheduledFuture<?>scheduled2=executor.scheduleAtFixedRate(()->{
            System.out.println("Every 10 seconds");
//            try {
//                Thread.sleep(10000);
//            }catch (Exception e){
//
//            }
        },6,10,TimeUnit.SECONDS);

        //scheduleWithFixedDelay

        try{
            Thread.sleep(20000);
        }
        catch(Exception e){

        }


        scheduled2.cancel(true);
    }
}
