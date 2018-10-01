package com.sweetop.studycore.interfaces;

public interface SomethingIsWrong {
    default void aMethod(int aValue) {
        System.out.println("Hi Mom");
    }
}