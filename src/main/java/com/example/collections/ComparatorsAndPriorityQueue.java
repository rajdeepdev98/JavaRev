package com.example.collections;

import java.util.PriorityQueue;

/**
 * Author : Rajdeep Deb
 * Date   : 04-08-2024
 * Time   : 06:29 PM
 */
public class ComparatorsAndPriorityQueue {

    public  void run(){

        PriorityQueue<Integer>minPq=new PriorityQueue<>();
        minPq.add(5);
        minPq.add(1);
        minPq.add(4);
        minPq.add(2);

        System.out.println("Min priority queue example");

        minPq.forEach((Integer val)-> System.out.println(val));

        System.out.println("Removing top element and printing minq...");
        while(!minPq.isEmpty()){
            int val=minPq.poll();
            System.out.println("Min value is "+val);
        }

        System.out.println("Max priority queue example!");
        PriorityQueue<Integer>maxPq=new PriorityQueue<>((Integer a,Integer b)->b-a);

        maxPq.add(5);
        maxPq.add(1);
        maxPq.add(4);
        maxPq.add(2);

        maxPq.forEach((Integer val)-> System.out.println(val));
        System.out.println("Removing top element and printing maxq...");
        while(!maxPq.isEmpty()){
            int val=maxPq.poll();
            System.out.println("Max value is "+val);
        }





    }



}
