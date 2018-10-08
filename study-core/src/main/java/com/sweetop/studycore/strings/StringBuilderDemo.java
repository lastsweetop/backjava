package com.sweetop.studycore.strings;

public class StringBuilderDemo {
    public static void main(String[] args) {
        String palindrome = "Dot saw I was Tod";
         
        StringBuilder sb = new StringBuilder(palindrome);
        
        sb.reverse();  // reverse it

        System.out.println(sb);

        sb.ensureCapacity(20);
        System.out.println(sb.capacity());
    }
}
