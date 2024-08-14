package Multithreading;

/**
 * Author : Rajdeep Deb
 * Date   : 10-08-2024
 * Time   : 05:13 PM
 */
public class ConsumeTask implements Runnable{

    SharedResource sharedResource;

    public ConsumeTask(SharedResource sharedResource) {
        this.sharedResource = sharedResource;
    }

    @Override
    public void run() {

        System.out.println("Consumer thread "+Thread.currentThread().getName());
        sharedResource.consumeItem();

    }
}
