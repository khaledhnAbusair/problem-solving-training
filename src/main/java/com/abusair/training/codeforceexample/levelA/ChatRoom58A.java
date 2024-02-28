package com.abusair.training.codeforceexample.levelA;

import java.util.Scanner;

public class ChatRoom58A {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String input = scanner.next();
		String[] arr = input.split("");

		String helloWord = "hello";
		String[] arrCondition = helloWord.split("");
		int index = 0;
		for (int i = 0; i < input.length(); i++) {
			if (index < helloWord.length() && arr[i].equalsIgnoreCase(arrCondition[index]))
				index++;
		}
		scanner.close();

		if (helloWord.length() == index)
			System.out.println("YES");
		else
			System.out.println("NO");
	}
}
