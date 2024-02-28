package com.abusair.training.datastracture.me;

public class Main {

    public static void main(String[] args) {
        //
        int[] num = {1, 2, 3, 4, 5};
        //
        // for (int i = num.length-1; i >= 0; i--) {
        // System.out.print(num[i]+",");
        // }

        System.out.println(fact(5));
    }

    private static int fact(int n) {
        if (n == 1)
            return 1;
        else
            return n * fact(n - 1);
    }
}
