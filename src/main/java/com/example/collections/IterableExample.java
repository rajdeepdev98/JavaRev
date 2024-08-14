package com.example.collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Stack;

/**
 * Author : Rajdeep Deb
 * Date   : 04-08-2024
 * Time   : 04:59 PM
 */
public class IterableExample {

    public void run(){

        List<String>list = new ArrayList<>();
        list.add("abc");
        list.add("def");
        list.add("ghi");
        System.out.println("Iterating items using iterator method");
        Iterator<String>iterator=list.iterator();

        while(iterator.hasNext()){

            String val=iterator.next();

            System.out.println(val);
            if(val.equals("def")){
                iterator.remove();
            }
        }
        System.out.println("Iterating using for each loop");
        for(String str:list){

            System.out.println(str);
        }
        System.out.println("Iterating using forEach method");//java 1.8+
        list.forEach((String val)->{
            System.out.println(val);
        });

        //size
        System.out.println("Size is "+list.size());
        System.out.println("Is it empty? "+list.isEmpty());
        System.out.println("It contains abc? "+list.contains("abc"));

        List<Integer>list2=new ArrayList<>();
        list2.add(5);
        list2.add(4);
        list2.add(3);
        list2.add(2);
        list2.add(1);
        list2.add(0);

        System.out.println("Printing the list out..");
        System.out.println(list2);

        list2.remove(0);//removing using index
        System.out.println(list2);

        list2.remove(Integer.valueOf(3));
        System.out.println(list2);

        list2.remove(Integer.valueOf(0));
        System.out.println(list2);
        list2.remove(Integer.valueOf(0));
        System.out.println(list2);

        Stack<Integer>stack=new Stack<>();
        stack.add(10);
        stack.add(11);
        stack.add(12);

        System.out.println("Printing contents of the stack");
        System.out.println(stack);

        list2.addAll(stack);
        System.out.println("Printing contents of the collection after addAll");
        System.out.println(list2);
        System.out.println("Printing after addAll at specific position");

        list2.addAll(1,stack);
        System.out.println(list2);
        System.out.println("contains All? "+ list2.containsAll(stack));

        list2.remove(Integer.valueOf(11));
        System.out.println(list2);

        list2.removeAll(stack);
        System.out.println(list2);




    }
}
