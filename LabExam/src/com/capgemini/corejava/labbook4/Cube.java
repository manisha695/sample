package com.capgemini.corejava.labbook4;

import java.util.Scanner;

public class Cube {
	public static int cube(int n) {
		int sum = 0, rem = 0;
		for (int i = 0; i <= n; i++) {
			rem = n % 10;
			sum = sum + (rem * rem * rem);
			n = n / 10;
		}
		return sum;

	}

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("enter the number");
		int n = s.nextInt();
		int m = Cube.cube(n);

		System.out.println("sum of cubes is: " + m);
	}
}

