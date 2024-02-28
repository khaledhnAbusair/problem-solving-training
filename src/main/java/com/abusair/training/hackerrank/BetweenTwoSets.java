package com.abusair.training.hackerrank;

import java.util.Arrays;

public class BetweenTwoSets {

    public static void main(String[] args) {
        int arr1[] = {100, 99, 98, 97, 96, 95, 94, 93, 92, 91};
        int arr2[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        System.out.println(solve(arr1, arr2));

    }

    static int solve(int[] A, int[] B) {
        int g = gcd(B);
        if (!Arrays.stream(A).allMatch(a -> g % a == 0))
            return 0;

        return computeDivisorNum(g / lcm(A));
    }

    static int gcd(int[] x) {
        int g = x[0];
        for (int i = 1; i < x.length; i++) {
            g = gcd(g, x[i]);
        }
        return g;
    }

    static int gcd(int x, int y) {
        return (y == 0) ? x : gcd(y, x % y);
    }

    static int lcm(int[] x) {
        int l = x[0];
        for (int i = 1; i < x.length; i++)
            l = lcm(l, x[i]);
        return l;
    }

    static int lcm(int x, int y) {
        return x * y / gcd(x, y);
    }

    static int computeDivisorNum(int x) {
        int divisorNum = 1;
        int prime = 2;
        while (x != 1) {
            while (!isPrime(prime))
                prime++;

            int exponent = 0;
            while (x % prime == 0) {
                x /= prime;
                exponent++;
            }
            divisorNum *= exponent + 1;
            prime++;
        }
        return divisorNum;
    }

    static boolean isPrime(int x) {
        for (int i = 2; i * i <= x; i++) {
            if (x % i == 0)
                return false;
        }
        return true;
    }

}
