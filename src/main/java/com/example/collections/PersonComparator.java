package com.example.collections;

import java.util.Comparator;

/**
 * Author : Rajdeep Deb
 * Date   : 05-08-2024
 * Time   : 05:52 PM
 */
public class PersonComparator implements Comparator <Person>{
    @Override
    public int compare(Person o1, Person o2) {
        return o2.getName().compareTo(o1.getName());
    }
}
