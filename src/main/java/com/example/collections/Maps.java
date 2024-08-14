package com.example.collections;

import java.util.*;

/**
 * Author : Rajdeep Deb
 * Date   : 06-08-2024
 * Time   : 11:11 AM
 */
public class Maps {

    public void run(){

        Map<Integer,String>map = new HashMap<>();

        map.put(null,"TEST");
        map.put(0,null);
        map.put(1,"A");
        map.put(2,"B");

        //compute if absent
        map.putIfAbsent(null,"test");
        map.putIfAbsent(0,"ZERO");
        map.putIfAbsent(3,"C");
        map.put(4,"FOUR");

        for(Map.Entry<Integer,String>entry:map.entrySet()){
            Integer key=entry.getKey();
            String value=entry.getValue();
            System.out.println("key = "+key+" value = "+value);
        }
        map.remove(4);
        System.out.println("Get or default  4 "+map.getOrDefault(4,"default"));
        System.out.println("Map keyset...");
        for(Integer key:map.keySet()){
            System.out.println("Key "+key);
        }
        System.out.println("Map values....");

        for(String value:map.values()){
            System.out.println("Value "+value);
        }

        System.out.println("LinkedHashmap with insertion order example....");
        Map<Integer,String>map2=new LinkedHashMap<>();
//        map2.put(0,null);
        map2.put(1,"A");
        map2.put(2,"B");

        //compute if absent
//        map2.putIfAbsent(null,"test");
        map2.putIfAbsent(0,"ZERO");
        map2.putIfAbsent(3,"C");
        map2.put(4,"FOUR");

        map2.forEach((Integer key,String value)->{
            System.out.println("Key = "+key+" value = "+value);
        });

        for(Map.Entry<Integer,String>entry:map2.entrySet()){
            Integer key=entry.getKey();
            String value=entry.getValue();
            System.out.println("key = "+key+" value = "+value);
        }

//        Map<Integer,String>m3=new Hashtable<>();

        System.out.println("Linked hashmap with access order->(less frequent to more frequent) example");
        Map<Integer,String>map3=new LinkedHashMap<>(16,0.75F,true);

        map3.put(1,"A");
        map3.put(2,"B");

        //compute if absent
//        map2.putIfAbsent(null,"test");
        map3.putIfAbsent(0,"ZERO");
        map3.putIfAbsent(3,"C");
        map3.put(4,"FOUR");

        map3.get(0);

        map3.forEach((Integer key,String value)->{
            System.out.println("Key = "+key+" value = "+value);
        });


        System.out.println("Treemap example natural ordering  i.e ascending");
        Map<Integer,String>map4=new TreeMap<>();
        map4.put(1,"A");
        map4.put(2,"B");
        map4.put(5,"FIVE");

        //compute if absent
//        map2.putIfAbsent(null,"test");
        map4.putIfAbsent(0,"ZERO");
        map4.putIfAbsent(3,"C");
        map4.put(4,"FOUR");

        map4.forEach((Integer key,String value)->{
            System.out.println("Key = "+key+" value = "+value);
        });

        System.out.println("Treemap descending order example");

        Map<Integer,String>map5=new TreeMap<>(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o2-o1;
            }
        });
        map5.put(1,"A");
        map5.put(2,"B");
        map5.put(5,"FIVE");

        //compute if absent
//        map2.putIfAbsent(null,"test");
        map5.putIfAbsent(0,"ZERO");
        map5.putIfAbsent(3,"C");
        map5.put(4,"FOUR");
        map5.forEach((Integer key,String value)->{
            System.out.println("Key = "+key+" value = "+value);
        });

//        map3.get(0);4
        System.out.println("Sortedmap example...");

        SortedMap<Integer,String>map6=new TreeMap<>();
        map6.put(1,"A");
        map6.put(2,"B");
        map6.put(5,"FIVE");

        //compute if absent
//        map2.putIfAbsent(null,"test");
        map6.putIfAbsent(0,"ZERO");
        map6.putIfAbsent(3,"C");
        map6.put(4,"FOUR");

        System.out.println("Headmap 3");
        System.out.println(map6.headMap(3));
        System.out.println("Tailmap 4");
        System.out.println(map6.tailMap(4));

        System.out.println("Navigable map example");

        NavigableMap<Integer,String>map7=new TreeMap<>();
        map7.put(1,"A");
        map7.put(2,"B");
        map7.put(5,"FIVE");

        //compute if absent
//        map2.putIfAbsent(null,"test");
        map7.putIfAbsent(0,"ZERO");
        map7.putIfAbsent(3,"C");
        map7.put(4,"FOUR");

        System.out.println("Lowerentry "+map7.lowerEntry(4));
        System.out.println("Lowerkey "+map7.lowerKey(4));
        System.out.println("Floor lower entry "+map7.floorEntry(4));
        System.out.println("Floor lower key "+map7.floorKey(4));
        System.out.println("Ceiling higher entry "+map7.ceilingEntry(4));
        System.out.println("Ceiling higher key "+map7.ceilingKey(4));
        System.out.println("Higher entry "+map7.higherEntry(4));
        System.out.println("Higher key "+map7.higherKey(4));

        //firstEntry
        //lastEntry
        //pollFirstEntry
        //pollLastEntry
        //descendingMap()->reverses the map and returns it
        //navigableKeySet()
        //descendingKeySet()
        //headMap(key,boolean inclusive)
        //tailMap(key,boolean inclusive)



    }
}
