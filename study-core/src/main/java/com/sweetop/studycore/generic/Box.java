package com.sweetop.studycore.generic;

public class Box<T> {
    private T t;

    public void set(T t) {
        this.t = t;
    }

    public T get() {
        return t;
    }

    @SuppressWarnings("unchecked")
    public static void main(String[] args) {
        Box<Integer> integerBox = new Box<>();


        Box<String> stringBox = new Box<>();
        Box rawBox = stringBox;               // OK

        rawBox = new Box();           // rawBox is a raw type of Box<T>

        Box<Integer> intBox = rawBox;     // warning: unchecked conversion

        rawBox.set(8);

        


    }
}