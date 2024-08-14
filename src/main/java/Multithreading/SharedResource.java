package Multithreading;

/**
 * Author : Rajdeep Deb
 * Date   : 10-08-2024
 * Time   : 03:09 PM
 */
public class SharedResource {

    boolean itemAvailable=false;

    public synchronized void addItem(){

        itemAvailable=true;
        System.out.println("Item added by " +Thread.currentThread().getName() +"  and notifying all threads that are waiting.");
        notifyAll();

    }

    public synchronized  void consumeItem(){

        System.out.println("Consume method invoked by "+ Thread.currentThread().getName());

        //using while loop to avoid spurious wake up,sometimes,due to system noise.
        while(!itemAvailable){

            try{

                System.out.println("Thread : " +Thread.currentThread().getName() +" is waiting now");
                wait();
            }
            catch (Exception e){

                //handling
            }

        }
        System.out.println("Item consumed by "+Thread.currentThread().getName());
        itemAvailable=false;
    }
}
