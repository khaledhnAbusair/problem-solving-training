package com.abusair.training.hackerrank;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SockMerchant {
    public static int sockMerchant(int n, List<Integer> ar) {

        // Count the frequency of each sock color
        Map<Integer, Integer> colorFrequency = new HashMap<>();
        for (int color : ar)
            colorFrequency.put(color, colorFrequency.getOrDefault(color, 0) + 1);

        // Calculate the number of pairs
        int totalPairs = 0;
        for (int frequency : colorFrequency.values())
            totalPairs += frequency / 2;

        return totalPairs;
    }

    public static void main(String[] args) {
//        There is a large pile of socks that must be paired by color.Given an array of integers representing the color
//        of each sock, determine how many pairs of socks with matching colors there are.
//        int n: the number of socks in the pile
//        int ar[n]: the colors of each sock
        System.out.println(sockMerchant(9, List.of(1, 2, 1, 2, 1, 3, 2, 1, 1)));
    }
}
