import Multithreading.MultithreadingExamples;
import com.example.collections.*;
import com.example.streams.StreamsExample;
import comp.example.enums.Enumsample;

import java.lang.reflect.*;

import static comp.example.enums.Enumsample.*;

/**
 * Author : Rajdeep Deb
 * Date   : 31-07-2024
 * Time   : 03:23 AM
 */
public class MyClass {

    public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException, NoSuchMethodException, InvocationTargetException, NoSuchFieldException {

//        String s1="hello";
//        String s2="hello";
//        String s3=new String("hello");
//        System.out.println(s1==s2);
//        System.out.println((s1.equals(s2)));
//        System.out.println(s1==s3);
//        System.out.println(s1.equals(s3));
//        Outerclass o1= new Outerclass();
//        Outerclass.InnerClass i1=  o1.new InnerClass();
//        i1.print();

//        Pair pair =new Pair(5,6);
//        System.out.println(pair.getFirst()+" , "+pair.getSecond());
//        System.out.println(pair.getClass());

//        List<Vehicle>vehicles=new ArrayList<>();
//        vehicles.add(new Car());
//        vehicles.add(new Bus());
//
//        List<Bus>busList =new ArrayList<>();
//        busList.add(new Bus());
//        busList.add(new Bus());
//
////        vehicles=busList;
////        busList=vehicles;
//        PrintV printObj=new PrintV();
//        printObj.printList(vehicles);
//        printObj.printList(busList);
//        printObj.printListGen(busList);

//        for(Enumsample sample: values()){
//            System.out.println(sample.name());
//            System.out.println(sample.ordinal());
//        }
//        Enumsample e1= valueOf("FRIDAY");
//        Enumsample e2 = FRIDAY;
//        System.out.println(e1.name());
//        System.out.println(e2.ordinal());
//        Enumsample e3=MONDAY;
//        e2.dummyMethod();
//        e3.dummyMethod();
//        Class eagleClass=Class.forName("Eagle");
//        Method methods[]=eagleClass.getDeclaredMethods();
//        for(Method method:methods){
//            System.out.println(method.getName());
//            System.out.println(method.getDeclaringClass());
//        }
//        System.out.println(eagleClass.getDeclaredMethods());
//        Object eagleObject=eagleClass.newInstance();
//        Method flyMethod=eagleClass.getMethod("fly",int.class,boolean.class,String.class);
//        flyMethod.invoke(eagleObject,1,true,"hello");

        //reflection of fields

//        Field fields[]=eagleClass.getDeclaredFields();
//        for(Field field:fields){
//
//            System.out.println(field.getName());
//            System.out.println(field.getType());
//            System.out.println(field.getAnnotatedType());
//            System.out.println(Modifier.toString(field.getModifiers()));
//            System.out.println("*******");
//        }
//
//        Field field=eagleClass.getDeclaredField("canSwim");
//        field.setAccessible(true);
//        field.set(eagleObject,true);
//        System.out.println(field.getBoolean(eagleObject));

//        Constructor constructors[]=eagleClass.getDeclaredConstructors();
//        for(Constructor constructor:constructors){
//            System.out.println("Modifier2: "+Modifier.toString(constructor.getModifiers()));
//            constructor.setAccessible(true);
//            Eagle eagleObj=(Eagle)constructor.newInstance();
//            eagleObj.fly2();
//        }
//        int val=2;
//        String output=switch(val){
//
//            case 1-> "One";
//            case 2->"Two";
//            default -> "None";
//        };
//        System.out.println(output);
//
//        String output2=switch(3){
//            case 1->{
//
//                //some logic
//                yield "One";
//            }
//            case 2->{
//
//                //some logic
//                yield "Two";
//            }
//
//            default -> {
//                //some logic
//                yield "None";
//            }
//        };
//        System.out.println(output2);
        System.out.println("Iterable example");
        new IterableExample().run();

        System.out.println("Priority Queue example");
        new ComparatorsAndPriorityQueue().run();

        System.out.println("Comparators example");
        new Comparators().run();

        System.out.println("Lists example");
        new Lists().run();

        System.out.println("Maps example!");
        new Maps().run();

        System.out.println("Sets example!");
        new Sets().run();

        System.out.println("Streams example!");

        new StreamsExample().run();


        System.out.println("Multithreading examples.....");
        new MultithreadingExamples().run();





    }
}
