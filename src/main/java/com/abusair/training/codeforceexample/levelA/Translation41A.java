package com.abusair.training.codeforceexample.levelA;

import java.util.Scanner;

public class Translation41A {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String[] firstWord = scanner.nextLine().split("");
		String[] secondWord = scanner.nextLine().split("");
		int count = 0;
		if (firstWord.length == secondWord.length) {
			int index = 0;
			for (int i = secondWord.length - 1; i >= 0; i--) {
				if (index <= secondWord.length) {
					if (secondWord[i].equalsIgnoreCase(firstWord[index])) {
						count++;
						index++;
					}
				}
			}

			if (count == firstWord.length)
				System.out.println("YES");
			else
				System.out.println("NO");
		}else
			System.out.println("NO");
		scanner.close();

	}

}
