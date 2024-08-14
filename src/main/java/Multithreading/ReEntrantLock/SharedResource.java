package Multithreading.ReEntrantLock;

import java.util.concurrent.locks.ReentrantLock;

/**
 * Author : Rajdeep Deb
 * Date   : 11-08-2024
 * Time   : 12:41 PM
 */
public class SharedResource {

    boolean isAvailable=false;
    ReentrantLock lock;

    public SharedResource(ReentrantLock reentrantLock) {
        this.lock = reentrantLock;
    }

    public void producer(){

        try{
            lock.lock();
            System.out.println("Lock acquired by "+Thread.currentThread().getName());
            isAvailable=true;
            Thread.sleep(4000);
        }catch (Exception e){
            //
        }
        finally {

            System.out.println("Lock released by "+ Thread.currentThread().getName());
            lock.unlock();
        }
    }
}
