package com.sweetop.studycore.inheritance;


import java.util.Arrays;

class Superclass {
    private int i = 1;

    class InnerClass extends Superclass {
        void print() {
            System.out.println(i);
        }

    }
}

public class Subclass extends Superclass {
    public static void main(String[] args) {
        Superclass superclass = new Superclass();
        Superclass.InnerClass innerClass = superclass.new InnerClass();
    }
}