package com.sweetop.studycore.moreclass;

/**
 * User: lastsweetop
 * Date: 2018/9/26
 * Time: 下午6:11
 */

class Father {
    static int a = 1;

    static void b() {
        System.out.println("father b");
    }

}

public class Son extends Father {
    static String a = "aa";

    static void b() {
        System.out.println("son b");
    }

    void c(){
        System.out.println(super.a);
    }


    public static void main(String[] args) {
        Father f = new Son();
        System.out.println(f.a);
        f.b();

        Son s = new Son();
        System.out.println(s.a);
        s.b();
        s.c();
    }
}
