package com.abusair.training.leetcode;

import java.math.BigInteger;

public class PlusOne {
    public static int[] plusOne(int[] digits) {
        StringBuilder number = new StringBuilder();
        for (int digit : digits)
            number.append(digit);

        BigInteger result = new BigInteger(number.toString()).add(BigInteger.ONE);

        String numberString = result.toString();
        int[] digitArray = new int[numberString.length()];
        for (int i = 0; i < numberString.length(); i++) {
            digitArray[i] = numberString.charAt(i) - '0';
        }
        return digitArray;
    }

    public static void main(String[] args) {
        System.out.println(plusOne(new int[]{1, 2, 3}));
        System.out.println(plusOne(new int[]{4, 3, 2, 1}));
        System.out.println(plusOne(new int[]{9, 8, 7, 6, 5, 4, 3, 2, 1, 0}));
    }
}
