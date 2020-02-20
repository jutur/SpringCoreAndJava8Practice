package com.streams.api;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class StreamTerminalOperations {

    // Stream.forEach This method helps in iterating over all elements of a stream and perform some operation on each of them. The operation is passed as lambda expression parameter.

    public static void main(String[] args) {
        List<String> memberNames = new ArrayList<>();
        memberNames.add("abhi");
        memberNames.add("Suraj");
        memberNames.add("lobo");
        memberNames.add("shalini");
        memberNames.add("hema");
        memberNames.add("Affan");

        memberNames.forEach(p -> System.out.println(p));

        // Stream.collect() collect() method used to receive elements from a steam and store them in a collection

        List<String> upperCaseNames = memberNames.stream().map(p -> p.toUpperCase()).collect(Collectors.toList());


        // Various matching operations can be used to check weather a certain predicate matches the stream. all the terminal and returns a boolean

        boolean matchResult = memberNames.stream().allMatch(p -> p.startsWith("a"));
        System.out.println(matchResult);

        boolean matchResult1 = memberNames.stream().anyMatch(p -> p.startsWith("a"));
        System.out.println(matchResult1);

        boolean matchResult3 = memberNames.stream().noneMatch(p -> p.startsWith("a"));
        System.out.println(matchResult3);

        // count is a terminal operation which gives number of elements in the stream as long

        System.out.println(memberNames.stream().count());


        // Stream reduce performs reduction operation on the elements of the Stream

        Optional<String> reduced = memberNames.stream().reduce((s1,s2) -> s1 + "#" + s2);
        reduced.ifPresent(System.out::println);


    }
}
