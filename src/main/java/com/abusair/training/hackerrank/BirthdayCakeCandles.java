package com.abusair.training.hackerrank;

import java.util.HashMap;
import java.util.Map;

public class BirthdayCakeCandles {

    public static void main(String[] args) {
        int[] arr = {1, 2, 4, 5, 2, 2, 2, 1, 1, 1, 1, 1, 1};
        System.out.println(birthdayCakeCandles(arr));

    }

    static int birthdayCakeCandles(int[] ar) {
        int maxValue = 0;
        Map<Integer, Integer> store = new HashMap<Integer, Integer>();
        for (int i : ar) {
            Integer key = i;
            Integer count = null;
            if (store.containsKey(key))
                count = store.get(key);
            else
                count = 0;
            count++;
            store.put(key, count);
        }

        for (Map.Entry<Integer, Integer> entry : store.entrySet()) {
            if (entry.getValue() > maxValue)
                maxValue = entry.getValue();

        }
        return maxValue;

    }
}