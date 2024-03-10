package com.abusair.training.leetcode;

import java.util.*;

public class LetterCombinationsOfAPhoneNumber {
    public static List<String> letterCombinations(String digits) {
        Map<String, List<String>> map = getMap();
        if (digits.isEmpty() || digits.equals("1")) return List.of();
        return generateCombinations(digits, map, 0);
    }

    private static List<String> generateCombinations(String digits, Map<String, List<String>> map, int index) {
        if (index == digits.length()) {
            return List.of(""); // Base case: Return a list with an empty string
        }

        List<String> combinations = new ArrayList<>();
        String digit = String.valueOf(digits.charAt(index));
        List<String> letters = map.get(digit);

        // Recursively generate combinations for the remaining digits
        List<String> remainingCombinations = generateCombinations(digits, map, index + 1);
        // Combine each letter with the combinations for the remaining digits
        for (String letter : letters) {
            for (String combination : remainingCombinations) {
                combinations.add(letter + combination);
            }
        }

        return combinations;
    }

    private static Map<String, List<String>> getMap() {
        Map<String, List<String>> map = new HashMap<>();
        map.put("2", List.of("a", "b", "c"));
        map.put("3", List.of("d", "e", "f"));
        map.put("4", List.of("g", "h", "i"));
        map.put("5", List.of("j", "k", "l"));
        map.put("6", List.of("m", "n", "o"));
        map.put("7", List.of("p", "q", "r", "s"));
        map.put("8", List.of("t", "u", "v"));
        map.put("9", List.of("w", "x", "y", "z"));
        return map;
    }

    public static void main(String[] args) {
        System.out.println(letterCombinations("2345"));
    }
}

