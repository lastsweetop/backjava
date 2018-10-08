package com.sweetop.studycore.numbers;

import java.util.Scanner;

/**
 * User: lastsweetop
 * Date: 2018/10/1
 * Time: 下午3:24
 */
public class Adder {
    public static void main(String[] args) {
        if (args.length==1){
            throw new IllegalArgumentException("");
        }
        int sum=0;
        for (String number:args) {
            sum+=Integer.parseInt(number);
        }
        System.out.println(sum);

    }
}
