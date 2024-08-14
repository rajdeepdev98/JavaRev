package Multithreading.FutureExamples;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.*;

/**
 * Author : Rajdeep Deb
 * Date   : 13-08-2024
 * Time   : 05:53 PM
 */
public class FutureExampleWithCallable {

    public static void main(String[] args) {

        ThreadPoolExecutor executor=new ThreadPoolExecutor(3,3,1, TimeUnit.HOURS,new ArrayBlockingQueue<>(10), Executors.defaultThreadFactory(),new ThreadPoolExecutor.AbortPolicy());

        //executor with runnable use case 1
        Future<?>futureObj=executor.submit(()->{
            System.out.println("Task1 with runnable");
        });

        try{
            Object object=futureObj.get();
            System.out.println(object==null);
        }catch (Exception e){

        }
        //use case 2
        List<Integer>output=new ArrayList<>();
//        List<Integer>output2=new ArrayList<>();
        Future<List<Integer>> futureObj2=executor.submit(()->{
            System.out.println("Task 2 with runnable and output argument");

            output.add(100);

        },output);

        try {

            List<Integer>outputFromFutureObj2=futureObj2.get();
            System.out.println(outputFromFutureObj2);

        }catch(Exception e){

        }
        //case 3 with callable
        Future<List<Integer>>futureObj3=executor.submit(()->{

            System.out.println("Task3 with callable");
            List<Integer>list = new ArrayList<>();
            list.add(10);
            return list;

        });
        try{
            List<Integer>listFromFutureObj3=futureObj3.get();
            System.out.println(listFromFutureObj3);

        }catch(Exception e){

        }
    }
}
