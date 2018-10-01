package com.sweetop.studycore.nestedclass;

class OuterClass {
    int x;
    static int y;

    static class StaticNestedClass {
        void print() {
            System.out.println(y);
        }
    }

    class InnerClass {
        int d;

        void print() {
            System.out.println(x);
        }


    }
}