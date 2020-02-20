package com.streams.api;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class Java8MethodRefrencesExamples {
    public static void main(String[] args) {
        // Method references for static methods  class::staticMethodName for example MAth::max
        List<Integer> listOfInts = Arrays.asList(1, 2, 3, 4, 5, 6, 7);
        Optional<Integer> reducedList = listOfInts.stream().reduce(Math::max);
        reducedList.ifPresent(value -> System.out.println(value));


        // Method references to instance method from instance -ClassInstance::instanceMethodName
        reducedList.ifPresent(System.out::println);

        // Method references to instance method from ClassType.Class::instanceMethodName example String::compareTo

        List<String> stringsList = Arrays.asList("how", "to", "what", "go", "come", "audi-sucks");

        List<String> newStringsList = stringsList.stream().sorted(String::compareTo).collect(Collectors.toList());

        System.out.println(newStringsList);

        // Reference to Constructor - Class::new example:- ArrayList::new

        List<String> newStringList = stringsList.stream().sorted(String::compareTo).collect(Collectors.toCollection(ArrayList::new));


    }

}
