package com.abusair.training.codeforceexample.levelA;

import java.util.Scanner;

public class GeorgeAndAccommodation467A {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Integer roomNumber = Integer.valueOf(scanner.nextLine());
		int pepopleNumber = 0;
		int capcity = 0;
		int count = 0;
		int totalInRoom = 0;
		for (int i = 0; i < roomNumber; i++) {
			String[] strings = scanner.nextLine().split(" ");
			pepopleNumber = Integer.valueOf(strings[0]);
			capcity = Integer.valueOf(strings[1]);
			totalInRoom = capcity - pepopleNumber;
			if (totalInRoom >= 2)
				count++;
		}
		System.out.println(count);
		scanner.close();

	}

}
