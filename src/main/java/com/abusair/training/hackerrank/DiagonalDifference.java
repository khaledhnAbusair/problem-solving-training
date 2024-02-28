package com.abusair.training.hackerrank;

public class DiagonalDifference {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        int arr[][] = {{11, 2, 4}, {4, 5, 6}, {10, 8, -12}};
        System.out.println(diagonalDifference(arr));
    }

    // Complete the diagonalDifference function below.
    static int diagonalDifference(int[][] arr) {
        int d1 = 0, d2 = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                // finding sum of primary diagonal
                if (i == j)
                    d1 += arr[i][j];
                // finding sum of secondary diagonal
                if (i == arr.length - j - 1)
                    d2 += arr[i][j];
            }
        }
        return Math.abs(d1 - d2);
    }

}
