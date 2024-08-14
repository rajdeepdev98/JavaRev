package Multithreading.ReadWriteLock;

import java.util.concurrent.locks.ReadWriteLock;

/**
 * Author : Rajdeep Deb
 * Date   : 11-08-2024
 * Time   : 01:38 PM
 */
public class SharedResource {

    boolean isAvailable=false;

    public void producer(ReadWriteLock lock){

        try{
            lock.readLock().lock();
            System.out.println("Read lock acquired by "+Thread.currentThread().getName());
            isAvailable=true;
            Thread.sleep(8000);
        }catch (Exception e){

        }
        finally {

            System.out.println("Read lock released by "+ Thread.currentThread().getName());
            lock.readLock().unlock();

        }

    }

    public void consume(ReadWriteLock lock){

        try{
            lock.writeLock().lock();
            System.out.println("Writelock acquired by  "+Thread.currentThread().getName());
            isAvailable=false;

        }catch (Exception e){

        }
        finally {


            System.out.println("Writelock released by "+Thread.currentThread().getName());
            lock.writeLock().unlock();

        }

    }
}
