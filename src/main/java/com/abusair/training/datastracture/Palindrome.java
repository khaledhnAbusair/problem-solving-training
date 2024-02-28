package com.abusair.training.datastracture;

public class Palindrome {
    public static void main(String[] args) {
        System.out.println("primary main");
        isPalindromeString("daad");
        String print = print("khaled");
        System.out.println(print);
        print = "adsad";
        System.out.println(print);
    }

    private static boolean isPalindromeString(String str) {
        if (str == null)
            return false;
        int length = str.length();
        System.out.println(length / 2);
        for (int i = 0; i < length / 2; i++) {

            if (str.charAt(i) != str.charAt(length - i - 1))
                return false;
        }
        return true;
    }

    static String print(String a) {

        return a;
    }
}
