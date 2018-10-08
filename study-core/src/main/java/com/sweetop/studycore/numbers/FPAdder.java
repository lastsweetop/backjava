package com.sweetop.studycore.numbers;

import java.text.DecimalFormat;

/**
 * User: lastsweetop
 * Date: 2018/10/1
 * Time: 下午3:32
 */
public class FPAdder {
    public static void main(String[] args) {
        if (args.length == 1) {
            throw new IllegalArgumentException("");
        }
        float sum = 0;
        for (String number : args) {
            sum += Float.parseFloat(number);
        }
        sum = 108.752f;
        System.out.printf(new DecimalFormat("###,###.##").format(sum));

        System.out.println();

    }
}
