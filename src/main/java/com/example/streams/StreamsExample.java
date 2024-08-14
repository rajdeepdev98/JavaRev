package com.example.streams;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

/**
 * Author : Rajdeep Deb
 * Date   : 06-08-2024
 * Time   : 02:27 PM
 */
public class StreamsExample {
    
    public void run(){


        List<Integer>salaryList=new ArrayList<>();
        salaryList.add(1000);
        salaryList.add(2000);
        salaryList.add(2500);
        salaryList.add(800);

        int num=(int)salaryList.stream().filter((Integer val)->val>=2000).count();
        System.out.println("No of people having salary >=2000 = "+num);

        //from arrays
        Integer arr[]={1,2,3,4,5};
        Stream<Integer>stream=Arrays.stream(arr).limit(3);//limit truncates the stream
        Stream<Integer>sortedStream=Arrays.stream(arr).sorted((o1, o2) -> o2-o1).peek((Integer i)-> System.out.println(i));
        //IntStream is a stream of primitive int values.
        //mapToLong
        //mapToDouble
        //
        //Stream<Integer> is a stream of Integer objects.
        int arr2[]={5,4,3,2,1};
        IntStream stream2=Arrays.stream(arr2);
//        Stream<Integer>stream2=Arrays.s(arr2);

        //from static method
        Stream<Integer>stream3=Stream.of(1,2,3,4,5);

        //from streambuilder
        Stream.Builder<Integer>builder=Stream.builder();
        builder.add(5).add(10).add(15).add(20).add(25);
        Stream<Integer>stream4=builder.build();

        //from Stream.Iterate()

        Stream<Integer>stream5=Stream.iterate(1000,(Integer i)->i+500).limit(5);


        //Intermediate operations
        Stream<String>stream6=Stream.of("Hello","World","This","Is","MrRD");
        Stream<String>stream7=stream6.map((String s)->s.toLowerCase());
        List<String>list1=stream7.collect(Collectors.toList());//terminal Operation


        System.out.println("flatmap example");
        List<List<String>>list2=Arrays.asList(Arrays.asList("Hello","how"),Arrays.asList("arE","You"),Arrays.asList("Mr.","rAjDeep"));

        Stream<String>stream8=list2.stream().flatMap((List<String>l2)->l2.stream()).map((String s)->s.toUpperCase());
//        Stream<String>stream9=list2.stream().map((List<String>ls)->ls.stream()).c

        System.out.println("Different terminal operations!");

        //forEach ,toArray
        Integer intArr[]=salaryList.stream().filter((Integer val)-> val>=2000).toArray((int size)->new Integer[size]);

        //reduce
        List<Integer>list3=Arrays.asList(2,1,4,7,10);
        Optional<Integer>op1=list3.stream().reduce((Integer cur,Integer val)->cur+val);
        System.out.println("reduced sum is "+op1.get());

        System.out.println("minimum value is "+list3.stream().min((Integer v1,Integer v2)->v1-v2).get());

        System.out.println("anymatch is "+list3.stream().anyMatch((Integer val)->val>=10));
        System.out.println("allMatch is "+list3.stream().allMatch((Integer v1)->v1>=5));

        System.out.println("findfirst is "+list3.stream().filter((Integer val)->val>=5).findFirst().get());

    }
}
