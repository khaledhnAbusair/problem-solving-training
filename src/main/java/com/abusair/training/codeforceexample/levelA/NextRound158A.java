package com.abusair.training.codeforceexample.levelA;

import java.util.Scanner;

public class NextRound158A {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String[] split = scanner.nextLine().split(" ");
		int arrayLength = Integer.valueOf(split[0]);
		int value = Integer.valueOf(split[1]);

		int array[] = new int[arrayLength];
		for (int i = 0; i < array.length; i++) {
			array[i] = scanner.nextInt();
		}

		int count = 0;
		for (int i = 0; i < arrayLength; i++) {
			if (array[i] >= 1)
				if (array[i] >= array[value - 1])
					count++;
		}

		System.out.println(count);
		scanner.close();
	}
}
