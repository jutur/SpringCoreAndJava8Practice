package com.streams.api;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class JavaParallelStream {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();

        for(int i =0; i< 10; i++) {
            list.add(i);
        }
// particular job using multiple threads in parallel cores, all you have to call method parallelStream() method instead of stream() method.
        Stream<Integer> intStream = list.parallelStream();
        intStream.filter(p -> p%2==0).forEach(p -> System.out.println(p));
}
}
