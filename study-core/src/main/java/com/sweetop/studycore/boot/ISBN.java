package com.sweetop.studycore.boot;

import java.util.Scanner;

/**
 * User: lastsweetop
 * Date: 2018/10/1
 * Time: 上午11:01
 */
public class ISBN {
    public static void main(String[] args) {
        System.out.println("..............");


        Scanner scanner = new Scanner(System.in);

        String number = scanner.nextLine();
        int num = 0;
//        String number = "013601267";
        char[] chars = number.toCharArray();

        for (int i = 0; i < number.length(); i++) {
            int d = Integer.parseInt("" + chars[i]);
            num += d * (i + 1);
        }
        num = num % 11;
        System.out.println(num);
        if (num==10){
            number=number+"X";
        } else {
            number = number + 1;
        }
        System.out.println(number);
    }
}
