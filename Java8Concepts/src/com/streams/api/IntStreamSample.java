package com.streams.api;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;
import java.util.stream.LongStream;

public class IntStreamSample {
    public static void main(String[] args) {

        // if you want to convert Stream of Objects into collection, then you use one of the static methods in the Collectors class
        // to convert a Stream of primitives you must box them first in their wrapper class and then collect them. This is called Boxed Stream
        List<Integer> ints = IntStream.of(1, 2, 3, 4, 5, 6).boxed().collect(Collectors.toList());
        System.out.println(ints);


        // Stream operation directly
        Optional<Integer> max = IntStream.of(1, 2, 3, 4, 5, 6).boxed().max(Integer::compareTo);
        System.out.println(max.get());

        // Long Stream to the List of Longs

        List<Long> longs = LongStream.of(1, 2, 3, 4, 5, 6).boxed().collect(Collectors.toList());
        System.out.println(longs);

        List<Double> doubles = DoubleStream.of(1.1, 1.2, 1.3, 1.4).boxed().collect(Collectors.toList());
        System.out.println(doubles);

    }
}
