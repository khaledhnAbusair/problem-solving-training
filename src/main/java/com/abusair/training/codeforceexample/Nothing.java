package com.abusair.training.codeforceexample;

import java.util.Scanner;

public class Nothing {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String input = scanner.nextLine();
		int count = 0;
		if (!input.isEmpty()) {
			for (int i = 0; i < input.length(); i++) {
				if (input.charAt(i) == '5')
					count++;
			}
		}

		System.out.println(count);
		scanner.close();
	}

}
