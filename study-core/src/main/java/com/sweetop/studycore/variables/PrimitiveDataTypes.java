package com.sweetop.studycore.variables;

/**
 * Created with IntelliJ IDEA.
 * User: lastsweetop
 * Date: 2018/9/4
 * Time: 下午4:59
 * To change this template use File | Settings | File Templates.
 */
public class PrimitiveDataTypes {
    public static void main(String[] args) {
        // The number 26, in decimal
        int decVal = 26;
        //  The number 26, in hexadecimal
        int hexVal = 0x1a;
        // The number 26, in binary
        int binVal = 0b11010;
        int e = 0_32;

        double d1 = 123.4;
        // same value as d1, but in scientific notation
        double d2 = 1.234e2;
        float f1 = 123.4f;

        long creditCardNumber = 1234_5678_9012_3456L;
        long socialSecurityNumber = 999_99_9999L;
        float pi =  3.14_15F;
        long hexBytes = 0xFF_EC_DE_5E;
        long hexWords = 0xCAFE_BABE;
        long maxLong = 0x7fff_ffff_ffff_ffffL;
        byte nybbles = 0b0010_0101;
        long bytes = 0b11010010_01101001_10010100_10010010;
    }
}
