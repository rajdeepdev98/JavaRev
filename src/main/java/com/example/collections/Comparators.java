package com.example.collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * Author : Rajdeep Deb
 * Date   : 04-08-2024
 * Time   : 06:56 PM
 */
public class Comparators {

    public void run(){

        Integer []arr={1,5,2,6,7};
        System.out.println("Sorting in descending order");
        Arrays.sort(arr, (Integer val1 ,Integer val2)->val2-val1);

        for(Integer val:arr){
            System.out.print(val+" ");
        }
        System.out.println("");

        Integer []arr2={1,5,2,6,7};
        System.out.println("Sorting in ascending order");
        Arrays.sort(arr2);
        for(Integer val:arr2){
            System.out.print(val+" ");
        }
        System.out.println("");

        System.out.println("string sorting example");

        String []sarr={"hhadas","aaa","bbb","mno"};
        System.out.println("sorting in ascending order");
        Arrays.sort(sarr);
        for(String s:sarr){
            System.out.println(s+" ");
        }
        System.out.println("");
        System.out.println("sorting in descending order");
        Arrays.sort(sarr,(String s1,String s2)-> s2.compareTo(s1));
        for(String s:sarr){
            System.out.println(s+" ");
        }

        System.out.println("Testing comparators");
        List<Person>listP=new ArrayList<>();
        listP.add(new Person("RD","Shivalik Park"));
        listP.add(new Person("AB","Shamshan Road"));
        listP.add(new Person("JHB","Rongpur"));

        Collections.sort(listP,new PersonComparator());
        listP.forEach((Person p)->{
            System.out.println(p.getName()+" "+p.getAddress());
        });

        System.out.println("Testing comparable..");

        Collections.sort(listP);
        listP.forEach((Person p)->{
            System.out.println(p.getName()+" "+p.getAddress());
        });





    }
}
