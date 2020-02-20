package com.streams.api;

import java.util.ArrayList;
import java.util.List;

public class StreamShortCircuitOperations {
    public static void main(String[] args) {
        List<String> memberNames = new ArrayList<>();
        memberNames.add("abhi");
        memberNames.add("Suraj");
        memberNames.add("lobo");
        memberNames.add("shalini");
        memberNames.add("hema");
        memberNames.add("Affan");

        // This will return true once the condition passed as predicate satisfy
        boolean matched = memberNames.stream().anyMatch(s -> s.startsWith("A"));
        System.out.println(matched);

        String findFirst = memberNames.stream().filter(s -> s.startsWith("S")).findFirst().get();

    }
}
