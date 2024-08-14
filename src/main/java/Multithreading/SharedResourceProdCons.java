package Multithreading;

import java.util.LinkedList;
import java.util.Queue;

/**
 * Author : Rajdeep Deb
 * Date   : 10-08-2024
 * Time   : 06:48 PM
 */
public class SharedResourceProdCons {

    private Queue<Integer> sharedBuffer;
    private int bufferSize;

    public SharedResourceProdCons(int bufferSize) {
//        this.sharedBuffer = sharedBuffer;
        sharedBuffer=new LinkedList<>();
        this.bufferSize = bufferSize;
    }
    public synchronized  void produceItem(int item) throws InterruptedException {

        while(this.bufferSize==sharedBuffer.size()){
            //we need to wait
            System.out.println("Buffer is full,producer is waiting for consumer");
            wait();
        }
        sharedBuffer.add(item);
        System.out.println("Produced ..."+item);
        //notifying the consumer that there are  items to consume now
        notify();

    }
    public synchronized int consume() throws InterruptedException {
        while(sharedBuffer.isEmpty()){
            System.out.println("Sharedbuffer is empty, consumer is waiting for producer..");
            wait();
        }
        int item=sharedBuffer.poll();
        System.out.println("Consumed ..."+item);
        //notify the producer that there is space in the buffer now
        notify();
        return item;
    }
}
