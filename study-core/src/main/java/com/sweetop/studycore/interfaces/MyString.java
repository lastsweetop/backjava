package com.sweetop.studycore.interfaces;

/**
 * User: lastsweetop
 * Date: 2018/9/29
 * Time: 上午8:53
 */
public class MyString implements CharSequence {
    private String s;

    public MyString(String s) {
        this.s = s;
    }

    private int fromEnd(int i) {
        return s.length() - 1 - i;
    }


    @Override
    public int length() {
        return s.length();
    }

    @Override
    public char charAt(int index) {
        if (index < 0 || index >= s.length()) {
            throw new StringIndexOutOfBoundsException(index);
        }
        return s.charAt(fromEnd(index));
    }

    @Override
    public CharSequence subSequence(int start, int end) {
        if (start < 0) {
            throw new StringIndexOutOfBoundsException(start);
        }
        if (end > s.length()) {
            throw new StringIndexOutOfBoundsException(end);
        }
        if (start > end) {
            throw new StringIndexOutOfBoundsException(start - end);
        }
        StringBuilder sub =
                new StringBuilder(s.subSequence(fromEnd(end), fromEnd(start)));
        return sub.reverse();
    }

    private static int random(int max) {
        return (int) Math.round(Math.random() * (max+1));
    }

    @Override
    public String toString() {
        StringBuilder s = new StringBuilder(this.s);
        return s.reverse().toString();
    }

    public static void main(String[] args) {
        MyString s =
                new MyString("Write a class that implements the CharSequence interface found in the java.lang package.");

        //exercise charAt() and length()
        for (int i = 0; i < s.length(); i++) {
            System.out.print(s.charAt(i));
        }

        System.out.println("");

        //exercise subSequence() and length();
        int start = random(s.length() - 1);
        int end = random(s.length() - 1 - start) + start;
        System.out.println(s.subSequence(start, end));

        //exercise toString();
        System.out.println(s);
    }
}
