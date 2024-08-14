package com.example.collections;

import java.util.Comparator;

/**
 * Author : Rajdeep Deb
 * Date   : 05-08-2024
 * Time   : 05:51 PM
 */
public class Person implements Comparable<Person> {

    public String name;
    public String address;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Person(String name, String address) {
        this.name = name;
        this.address = address;
    }
//    @Override
//    public int compare(Person o1, Person o2) {
//        return o2.getName().compareTo(o1.getName());
//    }

    @Override
    public int compareTo(Person o) {

        return this.getName().compareTo(o.getName());
    }
}
