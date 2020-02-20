package com.streams.api;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamConversionToAndFromCollections {
    public static void main(String[] args) {
        // Stream to List
        List<Integer> newList = new ArrayList<>();

        for(int i =0; i< 10; i++) {
            newList.add(i);
        }

        Stream<Integer> integerList = newList.stream();
        List<Integer> intList = integerList.filter(i -> i%2==0).collect(Collectors.toList());
        System.out.println(intList);


        // Stream to Array
        List<Integer> newList1 = new ArrayList<>();

        for(int i =0; i< 10; i++) {
            newList1.add(i);
        }
        Stream<Integer> integerList1 = newList.stream();
        Integer[] evenNumberarray = integerList1.filter(i -> i%2==0).toArray(Integer[]::new);
        Arrays.stream(evenNumberarray).forEach(p -> System.out.println(p));
     }
}
