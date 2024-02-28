package com.abusair.training.amazonexample;

public class Digits {
    public static int getFirstDigit(int x) {
        while (x >= 10)
            x /= 10;
        return x;
    }

    // method to return count of numbers with same
    // starting and ending digit from 1 upto x
    public static int getCountWithSameStartAndEndFrom1(int x) {
        if (x < 10)
            return x;

        // get ten-spans from 1 to x
        int tens = x / 10;

        // add 9 to consider all 1 digit numbers
        int res = tens + 9;

        // Find first and last digits
        int firstDigit = getFirstDigit(x);
        int lastDigit = x % 10;

        // If last digit is greater than first
        // digit then decrease count by 1
        if (lastDigit < firstDigit)
            res--;

        return res;
    }

    // Method to return count of numbers with same
    // starting and ending digit between start and end
    public static int getCountWithSameStartAndEnd(int start,
                                                  int end) {
        return getCountWithSameStartAndEndFrom1(end) - getCountWithSameStartAndEndFrom1(start - 1);
    }

    // driver code
    public static void main(String[] args) {
        int start = 5, end = 40;
        System.out.println(getCountWithSameStartAndEnd(start, end));
    }
}
