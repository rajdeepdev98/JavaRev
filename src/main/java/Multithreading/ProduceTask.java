package Multithreading;

/**
 * Author : Rajdeep Deb
 * Date   : 10-08-2024
 * Time   : 03:18 PM
 */
public class ProduceTask implements  Runnable{

    SharedResource sharedResource;

    public ProduceTask(SharedResource sharedResource) {
        this.sharedResource = sharedResource;
    }

    @Override
    public void run() {

        System.out.println("Producer thread : "+Thread.currentThread().getName());

        try{

            Thread.sleep(5000);
        }
        catch (Exception e){
            //
        }
        sharedResource.addItem();
    }
}
