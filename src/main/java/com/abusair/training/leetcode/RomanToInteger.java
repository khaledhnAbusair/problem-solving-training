package com.abusair.training.leetcode;

import java.util.HashMap;
import java.util.Map;

public class RomanToInteger {
    public static int romanToInt(String s) {
        Map<Character, Integer> romanNumerals = new HashMap<>();
        romanNumerals.put('I', 1);
        romanNumerals.put('V', 5);
        romanNumerals.put('X', 10);
        romanNumerals.put('L', 50);
        romanNumerals.put('C', 100);
        romanNumerals.put('D', 500);
        romanNumerals.put('M', 1000);
        int ans = 0;

        for (int i = 0; i < s.length(); i++) {
            if (i < s.length() - 1 && romanNumerals.get(s.charAt(i)) < romanNumerals.get(s.charAt(i + 1)))
                ans -= romanNumerals.get(s.charAt(i));
            else
                ans += romanNumerals.get(s.charAt(i));
        }

        return ans;
    }

    public static int another(String s) {
        int ans = 0;
        int prevValue = 0;

        for (int i = s.length() - 1; i >= 0; i--) {
            int currentValue = getValue(s.charAt(i));
            if (currentValue < prevValue)
                ans -= currentValue;
            else
                ans += currentValue;

            prevValue = currentValue;
        }
        return ans;
    }


    private static int getValue(char c) {
        switch (c) {
            case 'I':
                return 1;
            case 'V':
                return 5;
            case 'X':
                return 10;
            case 'L':
                return 50;
            case 'C':
                return 100;
            case 'D':
                return 500;
            case 'M':
                return 1000;
            default:
                return 0;
        }

    }
        public static void main (String[]args){
            System.out.println(romanToInt("III"));
            System.out.println(romanToInt("MCMXCIV"));
            System.out.println(another("III"));
            System.out.println(another("MCMXCIV"));
        }
    }
