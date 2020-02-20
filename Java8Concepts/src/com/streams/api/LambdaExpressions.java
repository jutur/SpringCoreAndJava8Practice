package com.streams.api;

import java.util.Arrays;

public class LambdaExpressions {
    public static void main(String[] args) {
        // Java Lambda expressions is just a function or anonymous function i.e
        // function with no name and without being bounded to an identifier

        // Single abstract interface is a interface with only single abstract method - functional interfaces
        Employees[] employees = {
                new Employees("abhi"), new Employees("zeenath"), new Employees("ravi")
        };

        System.out.println(Arrays.toString(employees));
        Arrays.sort(employees, Employees::nameCompare);
        System.out.println(Arrays.toString(employees));

    }
}

class Employees {
    String name;

    Employees(String name) {
        this.name = name;
    }

    public static int nameCompare(Employees a1, Employees a2) {
        return a1.name.compareTo(a2.name);
    }

    public String toString() {
        return name;
    }
}
