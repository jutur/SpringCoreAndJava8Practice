package com.streams.api;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class DifferentWaysToCreateStreams {

    // Streams in Java is defined as sequence of elements from a source that supports aggregate operations on them
    // Source refers to collections or Arrays which provides data to the streams

    public static void main(String[] args) {

        // Stream.of(val1, val2, val3.......)
        Stream<Integer> stream = Stream.of(1,2,3,4,5,6,7);
        stream.forEach(p -> System.out.println(p + " "));

        // Stream.of(arrayOfElements)
        Stream<Integer> stream2 = Stream.of(new Integer[]{1,2,3,4,5,6});
        stream2.forEach(p -> System.out.println(p + " "));

        //List.Stream() , converting List to Stream and Stream to List
        List<Integer> list = new ArrayList<>();

        for (int i=0; i< 10; i++) {
            list.add(i);
        }

        Stream<Integer> stream3 = list.stream();
        List<Integer> newList = stream3.collect(Collectors.toList());
        newList.forEach(p -> System.out.println(p));

        // Stream.generate() or Stream.Iterate()

        Stream<Date> streamDate = Stream.generate(() -> {return new Date();});
       // streamDate.forEach(p -> System.out.println(p));

    }
}
