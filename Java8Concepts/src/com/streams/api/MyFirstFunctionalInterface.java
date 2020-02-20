package com.streams.api;

@FunctionalInterface
public interface MyFirstFunctionalInterface {
    //Functional interfaces permits exactly one abstract method inside them
    // They are also called Single abstract method interface
    //Since default methods have implementations you are free to add as many as you like
    //If an interface declares an abstract method that overrides method from java.lang.object , that also does not count towards interfaces abstract method count
    // lambda expressions are used to represent instances of functional interfaces.
    public void firstWork();

    default void secondWork() {
        //Method body
    }

    @Override
    public String toString();
}
