package Multithreading.SempahoreLockExample;

import java.util.concurrent.Semaphore;

/**
 * Author : Rajdeep Deb
 * Date   : 11-08-2024
 * Time   : 05:02 PM
 */
public class SharedResource {

    boolean  isAvailable=false;
    Semaphore lock=new Semaphore(2);//permits two threads

    public void producer(){

        try{

            lock.acquire();
            System.out.println("Lock acquired by "+Thread.currentThread().getName());
            isAvailable=true;
            Thread.sleep(5000);
        }catch (Exception e){

        }
        finally{


            System.out.println("Lock released by "+Thread.currentThread().getName());
//            lock.release();

        }
    }
}
