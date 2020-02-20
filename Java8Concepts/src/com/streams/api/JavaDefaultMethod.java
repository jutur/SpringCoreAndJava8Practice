package com.streams.api;

public class JavaDefaultMethod implements movable {
    public static void main(String[] args) {
        JavaDefaultMethod dm = new JavaDefaultMethod();

        //Default methods enable you to add new functionality to the interfaces of your libraries
        // and ensure binary compatibility with code written for older versions of those interfaces

        //DEfault methods were added to provide backward compatibility in java8
        // If a new method has to be added to interface if would affect all the core classes implementing that interface, To overcome this problem java8
        // introduced default methods

        dm.movable();

        movable.newDefaultMethod();
    }
}

interface movable {
    default void movable() {
        System.out.println("I am Moving");
    }


    // This is similar to default method in interface except that we cannot override them in the implementation class
    static void newDefaultMethod() {
        System.out.println("I am a static default method");
    }
}
