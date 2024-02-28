package com.abusair.training.hackerrank;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class StringConstruction {

    public static void main(String[] args) {
        System.out.println(stringConstruction("abab"));

    }

    static int stringConstruction(String s) {
        Map<Character, Integer> map = new HashMap<>();
        int count = 1;
        int total = 0;
        for (char c : s.toCharArray()) {
            if (!map.containsKey(c))
                map.put(c, count);
        }

        for (Entry<Character, Integer> entry : map.entrySet())
            total += entry.getValue();
        return total;
    }

    static int stringConstructionFromInternet(String s) {
        Set<Character> uniqueChars = new HashSet<>();
        for (char c : s.toCharArray())
            uniqueChars.add(c);
        return uniqueChars.size();
    }
}
