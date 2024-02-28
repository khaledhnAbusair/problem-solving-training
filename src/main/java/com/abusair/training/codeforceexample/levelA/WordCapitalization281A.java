package com.abusair.training.codeforceexample.levelA;

import java.util.Scanner;

public class WordCapitalization281A {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String input = scanner.nextLine();
		if (!input.isEmpty())
			System.out.println(input.substring(0, 1).toUpperCase() + input.substring(1));
		scanner.close();
	}
}
