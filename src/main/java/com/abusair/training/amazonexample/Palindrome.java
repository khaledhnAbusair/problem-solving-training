package com.abusair.training.amazonexample;

public class Palindrome {
    static boolean isPalindrome(String str) {
        int n = str.length();

        // An empty string is
        // considered as palindrome
        if (n == 0)
            return true;

        return isPalRec(str, 0, n - 1);
    }

    private static boolean isPalRec(String str, int i, int length) {
        // If there is only one character
        if (i == length)
            return true;

        // If first and last
        // characters do not match
        if ((str.charAt(i)) != (str.charAt(length)))
            return false;

        // If there are more than
        // two characters, check if
        // middle substring is also
        // palindrome or not.
        if (i < length + 1)
            return isPalRec(str, i + 1, length - 1);

        return true;
    }

    // Driver Code
    public static void main(String args[]) {
        String str = "geeg";

        if (isPalindrome(str))
            System.out.println("Yes");
        else
            System.out.println("No");
    }
}
