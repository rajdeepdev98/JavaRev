package com.example.collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

/**
 * Author : Rajdeep Deb
 * Date   : 05-08-2024
 * Time   : 06:30 PM
 */
public class Lists {

    public void run(){

        List<Integer>list=new ArrayList<>();

        list.add(1);
        list.add(2);
        list.add(3);

        System.out.println("Testing lists....");

        ListIterator<Integer>it=list.listIterator(list.size());
        while(it.hasPrevious()){

            int val=it.previous();
            System.out.print(val+" ");
            if(val==2)it.add(5);


        }
        ListIterator<Integer>it2= list.listIterator();
        System.out.println("");
        while(it2.hasNext()){

            int val=it2.next();
            System.out.print(val+" ");
            if(val==1)it2.add(5);


        }
        System.out.println("");
        list.forEach((Integer i)-> System.out.print(i + " "));
        System.out.println("");


    }
}
