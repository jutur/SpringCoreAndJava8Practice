package com.streams.api;

import java.util.ArrayList;
import java.util.List;

public class CoreStreamOperations {
    public static void main(String[] args) {
        List<String> memberNames = new ArrayList<>();
        memberNames.add("name1");
        memberNames.add("name2");
        memberNames.add("name3");
        memberNames.add("name4");
        memberNames.add("name5");
        memberNames.add("name6");
        // Intermediate operations returms Streams itself so you chain multiple operations in a row
        // filter accepts a predicate  to filter all elements of the Stream. This operation is intermediate which enables us to call another Stream operation

        memberNames.stream().filter(p -> p.startsWith("n")).forEach(p -> System.out.println(p));


        // Stream.map()
        memberNames.stream().map(p -> p.toUpperCase()).forEach(p -> System.out.println(p));

        // Sorted is a intermediate operation which provides sorted view of the Stream. The elements are passed in natural order unless you pass custom comparator

        memberNames.stream().sorted().forEach(p -> System.out.println(p));

        //Note:- Keep in mind that sorted does only create a sorted view of the stream without manipulating the ordering of the backed collection. The ordering of memberNames is untouched.


    }
}
