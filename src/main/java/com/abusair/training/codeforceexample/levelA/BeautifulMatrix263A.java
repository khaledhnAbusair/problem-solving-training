package com.abusair.training.codeforceexample.levelA;

import java.util.Scanner;

public class BeautifulMatrix263A {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int a[][] = new int[5][5];
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {
				a[i][j] = scanner.nextInt();
				if (a[i][j] == 1) {
					System.out.println(findDifference(i) + findDifference(j));
					break;
				}
			}
		}
		scanner.close();

	}

	static int findDifference(int n) {
		if (n >= 2)
			return n - 2;
		else
			return 2 - n;
	}
}
