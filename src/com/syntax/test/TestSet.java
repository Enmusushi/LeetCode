package com.syntax.test;

import java.util.HashSet;
import java.util.Set;

public class TestSet {
    public static void main(String[] args) {
        Set<Integer> set = new HashSet<>();
        set.add(3);
        set.add(1);
        set.add(4);
        set.add(2);
        //set.remove(set.size()-1);
        System.out.println(set);
        Set<String> set1 = new HashSet<>();
        set1.add("Enmusushi");
        set1.add("a");
        set1.add("c");
        set1.add("e");
        set1.add("d");
        System.out.println(set1);
    }
}
