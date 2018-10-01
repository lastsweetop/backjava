package com.sweetop.studycore.interfaces;

/**
 * User: lastsweetop
 * Date: 2018/9/27
 * Time: 下午5:39
 */
public class MyDo implements DoIt {
    @Override
    public void doSomething(int i, double x) {
        
    }

    @Override
    public int doSomethingElse(String s) {
        return 0;
    }

    public static void main(String[] args) {
        System.out.println(new MyDo().didItWork(1,2,"a"));
    }
}
