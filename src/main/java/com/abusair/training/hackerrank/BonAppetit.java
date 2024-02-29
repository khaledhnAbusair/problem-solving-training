package com.abusair.training.hackerrank;

import java.util.List;

public class BonAppetit {

    public static void bonAppetit(List<Integer> bill, int k, int b) {
        int totalAnnaCostEat = 0;
        for (int i = 0; i < bill.size(); i++) {
            if (i != k)
                totalAnnaCostEat += bill.get(i);
        }
        int annaShouldPay = totalAnnaCostEat / 2;
        if (annaShouldPay == b)
            System.out.println("Bon Appetit");
        else
            System.out.println(b - annaShouldPay);
    }

    public static void main(String[] args) {
//        bill: an array of integers representing the cost of each item ordered
//        k: an integer representing the zero-based index of the item Anna doesn't eat
//        b: the amount of money that Anna contributed to the bill
        bonAppetit(List.of(3, 10, 2, 9), 1, 7);
    }
}
