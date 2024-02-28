package com.abusair.training.codeforceexample.levelA;

import java.util.Scanner;

public class YoungPhysicist69A {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int matrixRow = scan.nextInt();
		int matrixCol = 3;
		int result[] = new int[matrixCol];

		// defining 2D array to hold matrix data
		int[][] matrix = new int[matrixRow][matrixCol];
		// Enter Matrix Data
		enterMatrixData(scan, matrix, matrixRow, matrixCol);

		// Print Matrix Data
		int[] output = sumIt(matrix, result);
		printFinalResult(output);
	}

	private static void printFinalResult(int[] output) {
		int count = 0;
		for (int i = 0; i < output.length; i++) {
			if (output[i] == 0)
				count++;
		}
		if (count == output.length)
			System.out.println("YES");
		else
			System.out.println("NO");
	}

	public static void enterMatrixData(Scanner scan, int[][] matrix, int matrixRow, int matrixCol) {
		for (int i = 0; i < matrixRow; i++) {
			for (int j = 0; j < matrixCol; j++) {
				matrix[i][j] = scan.nextInt();
			}
		}
	}

	public static int[] sumIt(int[][] numbers, int result[]) {
		int sum = 0;
		int c = 0;
		for (int i = 0; i < numbers.length; i++) {
			if (c != 3) {
				sum += numbers[i][c];
				if (i == numbers.length - 1) {
					i = -1;
					result[c] = sum;
					c++;
					sum = 0;
				}
			}
		}
		return result;
	}
}
