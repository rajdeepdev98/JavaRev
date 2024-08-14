package com.example.collections;

import java.util.HashSet;
import java.util.Set;

/**
 * Author : Rajdeep Deb
 * Date   : 06-08-2024
 * Time   : 01:49 PM
 */
public class Sets {


    public void run(){

        Set<Integer>set1=new HashSet<>();
        set1.add(1);
        set1.add(1);
        set1.add(2);
        set1.add(3);

        Set<Integer>set2=new HashSet<>();
        set2.add(3);
        set2.add(4);
        set2.add(5);
        set1.forEach((Integer i)-> System.out.println(i));


        System.out.println("set addall union...");

        Set<Integer>set3=new HashSet<>();
        set3.addAll(set2);
        set3.addAll(set1);

        set3.forEach((Integer i)-> System.out.println(i));

        System.out.println("set retainall intersection...");

        Set<Integer>set4=new HashSet<>();
        set4.addAll(set1);
        set4.retainAll(set2);

        set4.forEach((Integer i)-> System.out.println(i));

        System.out.println("set removeall difference example!");

        Set<Integer>set5=new HashSet<>();
        set5.addAll(set1);
        set5.removeAll(set2);

        set5.forEach((Integer i)-> System.out.println(i));






    }
}
