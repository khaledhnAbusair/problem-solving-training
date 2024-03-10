package com.abusair.training.leetcode;

public class PalindromeNumber {
    public static boolean isPalindrome(int x) {
        String[] split = String.valueOf(x).split("");
        StringBuilder builder = new StringBuilder();
        for (int i = split.length - 1; i >= 0; i--)
            builder.append(split[i]);
        return builder.toString().equals(String.valueOf(x));
    }

    public boolean isPalindrome2(int x) {
        // If the number is negative or ends with zero but is not zero itself, it can't be a palindrome
        if (x < 0 || (x % 10 == 0 && x != 0)) {
            return false;
        }

        int reversed = 0;
        int original = x;

        // Reverse the integer
        while (x > 0) {
            int digit = x % 10;
            reversed = reversed * 10 + digit;
            x /= 10;
        }

        // Check if the reversed number equals the original number
        return original == reversed;
    }


    public static void main(String[] args) {
        System.out.println(isPalindrome(121));
        System.out.println(isPalindrome(-121));
        System.out.println(isPalindrome(10));
    }
}
