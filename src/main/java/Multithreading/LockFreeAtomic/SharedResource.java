package Multithreading.LockFreeAtomic;

import java.util.concurrent.atomic.AtomicInteger;

/**
 * Author : Rajdeep Deb
 * Date   : 11-08-2024
 * Time   : 06:00 PM
 */
public class SharedResource {

    AtomicInteger counter=new AtomicInteger(0);

    public void increment(){

        counter.incrementAndGet();
    }
    public int get(){
        return counter.get();
    }
}
