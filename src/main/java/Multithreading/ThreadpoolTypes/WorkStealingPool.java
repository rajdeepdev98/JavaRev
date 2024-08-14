package Multithreading.ThreadpoolTypes;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.Future;

/**
 * Author : Rajdeep Deb
 * Date   : 14-08-2024
 * Time   : 01:06 AM
 */
public class WorkStealingPool {
    public static void main(String[] args) {
        ForkJoinPool pool=new ForkJoinPool();

        Future<Integer>futureObj=pool.submit(new ComputeTask(0,100));

        try{

            System.out.println(futureObj.get());

        }catch (Exception e){


        }

        //2nd method
        ForkJoinPool pool2= (ForkJoinPool) Executors.newWorkStealingPool();

        Future<Integer>futureObj2=pool2.submit(new ComputeTask(0,1000));

        try{

            System.out.println(futureObj2.get());

        }catch (Exception e){


        }

    }
}
