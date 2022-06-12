package com.github.dude_from_odessa.group_exercise01;

import java.util.Scanner;

public class Program01 {

	public static void main(String[] args) {

		/*
		 * Using Scanner create an array of integer values. After the array is created,
		 * calculate the sum of all stored elements in that array.
		 */

		Scanner scanner = new Scanner(System.in);
		System.out.print("Please enter number of elements in array : ");
		int c = scanner.nextInt();
		int[] array = new int[c];
		int x = 0;
		int y = 0;
		int sum = 0;
		do {
			System.out.print("Please enter number : ");
			array[x] = scanner.nextInt();
			x++;
			y++;
		} while (y < c);
		for (int z : array) {
			System.out.print(z + ". ");
			sum += z;
		}
		System.out.println();
		System.out.println("Sum of all stored elements in array is : " + sum);
		scanner.close();
	}

}
