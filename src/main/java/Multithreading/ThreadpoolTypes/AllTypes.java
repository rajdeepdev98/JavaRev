package Multithreading.ThreadpoolTypes;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadPoolExecutor;

/**
 * Author : Rajdeep Deb
 * Date   : 13-08-2024
 * Time   : 10:12 PM
 */
public class AllTypes {

    public static void main(String[] args) {
        //fixed threadpool
        ExecutorService executor = Executors.newFixedThreadPool(10);

        //cachedthreadpool ->no queue
        ExecutorService cachedExecutor=Executors.newCachedThreadPool();

        //singleThread
        ExecutorService singleExec=Executors.newSingleThreadExecutor();

    }
}
