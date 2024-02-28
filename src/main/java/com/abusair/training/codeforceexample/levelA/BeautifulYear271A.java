package com.abusair.training.codeforceexample.levelA;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class BeautifulYear271A {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int num = scanner.nextInt();
		System.out.println(check(num + 1));
		scanner.close();
	}

	public static int check(int num) {
		Map<Character, Integer> map = new HashMap<>();
		for (char c : String.valueOf(num).toCharArray()) {
			if (map.get(c) == null)
				map.put(c, 1);
			else
				return check(num + 1);
		}
		return num;

	}

}
