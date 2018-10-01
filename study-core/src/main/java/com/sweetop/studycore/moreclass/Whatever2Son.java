package com.sweetop.studycore.moreclass;

/**
 * Created with IntelliJ IDEA.
 * User: lastsweetop
 * Date: 2018/9/12
 * Time: 下午4:26
 * To change this template use File | Settings | File Templates.
 */
public class Whatever2Son extends Whatever2 {
//    protected int initializeInstanceVariable() {
//        return 1;
//    }

    public static void main(String[] args) {
        Whatever2 whatever2 = new Whatever2Son();
        System.out.println(whatever2.getMyVar());
    }
}
