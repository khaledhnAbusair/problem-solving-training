package com.abusair.training.hackerrank;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class GetMoneySpent {
    static int getMoneySpent(int[] keyboards, int[] drives, int b) {

        List<Integer> list = new ArrayList<>();
        for (int keyboard : keyboards)
            for (int drive : drives)
                list.add(keyboard + drive);
        List<Integer> collect = list.stream().filter(integer -> integer <= b).collect(Collectors.toList());
        if (collect.isEmpty()) return -1;
        Integer max = Collections.max(collect);
        return max <= b ? max : -1;
    }

    static int anotherSolutionFromInternet(int[] keyboards, int[] drives, int b) {
        int maxCost = -1;
        for (int keyboard : keyboards) {
            for (int drive : drives) {
                int cost = keyboard + drive;
                if (cost <= b && maxCost < cost)
                    maxCost = cost;
            }
        }
        return maxCost;
    }

    public static void main(String[] args) {
//        int keyboards[n]: the keyboard prices
//        int drives[m]: the drive prices
//        int b: the budget
        System.out.println(getMoneySpent(new int[]{40, 50, 60}, new int[]{5, 8, 12}, 10));
        System.out.println(anotherSolutionFromInternet(new int[]{40, 50, 60}, new int[]{5, 8, 12}, 10));
    }
}
