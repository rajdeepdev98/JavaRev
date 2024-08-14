package Multithreading.StampedLockOrOptimisticLock;

import java.util.concurrent.locks.StampedLock;

/**
 * Author : Rajdeep Deb
 * Date   : 11-08-2024
 * Time   : 02:02 PM
 */
public class SharedResource {

    int a = 10;
    StampedLock lock = new StampedLock();
    public void producer(){
        long stamp=lock.tryOptimisticRead();
        try{
            System.out.println("Taken optimistic lock");
            a=11;
            Thread.sleep(8000);
            if(lock.validate(stamp)){

                System.out.println("Updated a value successfully");
            }else{
                System.out.println("Rollback of work");
                a=10;
            }
        }catch(Exception e){

        }
        finally {

        }
    }
    public void consumer(){

        long stamp= lock.writeLock();
        System.out.println("Write lock acquired by "+Thread.currentThread().getName());
        try{

            System.out.println("Performing work!");
            a=9;

        }catch (Exception e){


        }finally{

            lock.unlockWrite(stamp);
            System.out.println("Write lock released by "+Thread.currentThread().getName());

        }
    }

}
