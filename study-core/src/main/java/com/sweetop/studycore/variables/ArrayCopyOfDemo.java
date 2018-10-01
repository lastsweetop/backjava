package com.sweetop.studycore.variables;

import java.util.Arrays;

/**
 * Created with IntelliJ IDEA.
 * User: lastsweetop
 * Date: 2018/9/4
 * Time: 下午5:09
 * To change this template use File | Settings | File Templates.
 */
public class ArrayCopyOfDemo {
    public static void main(String[] args) {
        char[] copyFrom = {'d', 'e', 'c', 'a', 'f', 'f', 'e',
                'i', 'n', 'a', 't', 'e', 'd'};

        char[] copyTo = Arrays.copyOfRange(copyFrom, 2, 9);

        System.out.println(new String(copyTo));

        System.arraycopy(copyFrom, 2, copyTo, 0, 7);
        System.out.println(new String(copyTo));
    }
}
