package com.sweetop.studycore.strings;

/**
 * User: lastsweetop
 * Date: 2018/10/8
 * Time: 上午9:02
 */
public class StringDemo {
    public static void main(String[] args) {
//        char[] helloArray = { 'h', 'e', 'l', 'l', 'o', '.' };
//        String helloString = new String(helloArray);
//        System.out.println(helloString);
        String palindrome = "Dot saw I was Tod";
        int len = palindrome.length();
        char[] tempCharArray = new char[len];
        char[] charArray = new char[len];

        // put original string in an
        // array of chars
        palindrome.getChars(0, len, tempCharArray, 0);

        // reverse array of chars
        for (int j = 0; j < len; j++) {
            charArray[j] =
                    tempCharArray[len - 1 - j];
        }

        String reversePalindrome =
                new String(charArray);
        System.out.println(reversePalindrome);
    }
}
