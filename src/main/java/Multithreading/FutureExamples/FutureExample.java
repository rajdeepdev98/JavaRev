package Multithreading.FutureExamples;

import java.util.concurrent.*;

/**
 * Author : Rajdeep Deb
 * Date   : 13-08-2024
 * Time   : 03:29 PM
 */
public class FutureExample {

    public static void main(String[] args) throws ExecutionException, InterruptedException {


        ThreadPoolExecutor executor=new ThreadPoolExecutor(1,1,1, TimeUnit.HOURS,new ArrayBlockingQueue<>(10), Executors.defaultThreadFactory(),new ThreadPoolExecutor.AbortPolicy());

        Future<?>futureObj=executor.submit(()->{

            try {

                Thread.sleep(7000);
                System.out.println("Task to be done is submitted..");
            }catch (Exception e){


            }
        });

//        futureObj.get();//its like join,making the thread wait here

        //checking the status of the thread
        System.out.println("Is done? "+futureObj.isDone());

        try{
            futureObj.get(2,TimeUnit.SECONDS);
        }catch(TimeoutException e){

            System.out.println("Timeout exception happened");

        }catch (Exception e){

        }

        try{
            futureObj.get();
        }catch(Exception e){

        }

        System.out.println("Is done? "+futureObj.isDone());
        System.out.println("Iscancelled? "+futureObj.isCancelled());

        executor.shutdown();

    }
}
