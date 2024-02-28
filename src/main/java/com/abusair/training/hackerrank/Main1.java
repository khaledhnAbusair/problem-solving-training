package com.abusair.training.hackerrank;

public class Main1 {
    public static void main(String[] args) {
        int arr[] = {-4, 3, -9, 0, 4, 1};
        plusMinus(arr);
    }

    static void plusMinus(int[] arr) {
        double arrLength = arr.length;
        double positiveNumber = 0.000000;
        double negativeNumber = 0.000000;
        double zero = 0.000000;
        for (int i = 0; i <= arrLength - 1; i++) {
            if (arr[i] == 0)
                zero += 1;
            else if (arr[i] > 0)
                positiveNumber += 1;
            else if (arr[i] < 0)
                negativeNumber += 1;
        }

        double zeroResult = zero / arrLength;
        double positiveResult = positiveNumber / arrLength;
        double negativeResult = negativeNumber / arrLength;
        // DecimalFormat format=new DecimalFormat(".000000");

        System.out.println(zeroResult);
        System.out.println("------");
        System.out.println(positiveResult);
        System.out.println("------");
        System.out.println(negativeResult);
    }
}
