package Multithreading.ThreadpoolExecutorExamples;

import java.util.concurrent.*;

/**
 * Author : Rajdeep Deb
 * Date   : 12-08-2024
 * Time   : 12:33 AM
 */
public class Threadpool1 {

    public static void main(String[] args) {

        ThreadPoolExecutor executor = new ThreadPoolExecutor(2, 5, 10, TimeUnit.MINUTES, new ArrayBlockingQueue<>(10), new CustomThreadFactory(), new CustomRejectionHandler());
        //we could use Executors.defaultThreadFactory instead of a custom one
        //for handler could use DiscardPolicy
//        new ThreadPoolExecutor.DiscardOldestPolicy();
        executor.allowCoreThreadTimeOut(true);

        for (int i = 0; i <= 17; i++) {
            executor.submit(() -> {
                try {

                    Thread.sleep(5000);
                    System.out.println("Thread name " + Thread.currentThread().getName());

                } catch (Exception e) {

                }

            });

        }
        executor.shutdown();
    }
}

class CustomThreadFactory implements ThreadFactory{
    @Override
    public Thread newThread(Runnable r) {
        Thread thread = new Thread(r);
        thread.setPriority(Thread.NORM_PRIORITY);
        thread.setDaemon(false);
        return thread;
    }
}

class CustomRejectionHandler implements RejectedExecutionHandler{
    @Override
    public void rejectedExecution(Runnable r, ThreadPoolExecutor executor) {
        System.out.println("Task denied  "+r.toString());
    }
}