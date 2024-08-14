package Multithreading;

/**
 * Author : Rajdeep Deb
 * Date   : 10-08-2024
 * Time   : 06:46 PM
 */
public class ProducerConsumerProblem {

    public void run(){


        SharedResourceProdCons resource =new SharedResourceProdCons(5);

        Thread producerThread =new Thread(()->{

            try{

                for(int i=1;i<=10;i++){

                    resource.produceItem(i);
                }

            }catch(Exception e){

            }

        });

        Thread consumerThread =new Thread(()->{

            try{

                for(int i=1;i<=10;i--){
                    resource.consume();
                }

            }catch (Exception e){

            }
        });

        producerThread.start();
        consumerThread.start();

    }
}
