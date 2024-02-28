package com.abusair.training.hackerrank;

import java.util.ArrayList;
import java.util.List;

public class CompareTheTriplets {

    public static void main(String[] args) {
        List<Integer> alice = new ArrayList<>();
        List<Integer> bob = new ArrayList<>();
        alice.add(17);
        alice.add(28);
        alice.add(30);
        bob.add(99);
        bob.add(16);
        bob.add(8);
        List<Integer> list = compareTriplets(alice, bob);
        for (Integer integer : list) {
            System.out.println(integer);
        }
    }

    static List<Integer> compareTriplets(List<Integer> alice, List<Integer> bob) {
        List<Integer> result = new ArrayList<>();
        int aliceCount = 0;
        int bobCount = 0;
        for (int i = 0; i <= alice.size() - 1; i++) {
            Integer aliceValue = alice.get(i);
            Integer bobValue = bob.get(i);
            if (aliceValue > bobValue)
                aliceCount++;
            else if (bobValue > aliceValue)
                bobCount++;
        }
        result.add(aliceCount);
        result.add(bobCount);
        return result;
    }
}
