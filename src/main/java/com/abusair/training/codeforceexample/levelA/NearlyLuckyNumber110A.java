package com.abusair.training.codeforceexample.levelA;

import java.util.Scanner;

public class NearlyLuckyNumber110A {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String[] numbers = scanner.nextLine().split("");
		int count = 0;
		for (int i = 0; i < numbers.length; i++) {
				if (numbers[i].equalsIgnoreCase("7") || numbers[i].equalsIgnoreCase("4"))
					count++;
		}

		if (count == 7 || count == 4)
			System.out.println("YES");
		else
			System.out.println("NO");
		scanner.close();
	}

}
