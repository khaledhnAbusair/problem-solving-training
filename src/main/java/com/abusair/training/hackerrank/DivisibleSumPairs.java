package com.abusair.training.hackerrank;

import java.util.HashMap;
import java.util.List;

public class DivisibleSumPairs {
    public static void main(String[] args) {
        System.out.println(divisibleSumPairs(6, 3, List.of(1, 3, 2, 6, 1, 2)));
    }

    public static int divisibleSumPairs(int n, int k, List<Integer> ar) {
        // Write your code here
        /* divisibleSumPairs has the following parameter(s):
            int n: the length of array
            int ar[n]: an array of integers
            int k: the integer divisor*/

        int count = 0;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++)
                if ((ar.get(i) + ar.get(j)) % k == 0)
                    count++;
        }
        return count;
    }

    public static int anotherSolutionFormInternet(int n, int k, List<Integer> ar) {
        // Create a HashMap to count remainders when dividing each element by k
        HashMap<Integer, Integer> remainders = new HashMap<>();
        int count = 0;

        for (int i = 0; i < n; i++) {
            int currentRemainder = ar.get(i) % k;
            // Find the number of elements that, when added to ar[i], give a sum divisible by k
            int complementCount = remainders.getOrDefault((k - currentRemainder) % k, 0);
            count += complementCount;

            // Update the count of the current remainder
            remainders.put(currentRemainder, remainders.getOrDefault(currentRemainder, 0) + 1);
        }

        return count;
    }
}
