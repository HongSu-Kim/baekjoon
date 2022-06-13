package com.level2;

import java.util.Scanner;

public class Level7_Q2480 {

	public static void main(String[] args) {

		int a, b, c, n, result;
		Scanner sc = new Scanner(System.in);

		a = sc.nextInt();
		b = sc.nextInt();
		c = sc.nextInt();
		sc.close();

		if (a < b) {
			n = a;
			a = b;
			b = n;
		}
		if (b < c) {
			n = b;
			b = c;
			c = n;
		}
		if (a < b) {
			n = a;
			a = b;
			b = n;
		}

		if (a == b && b == c)
			result = 10000 + a * 1000;
		else if (a == b || b == c)
			result = 1000 + b * 100;
		else
			result = a * 100;

		System.out.println(result);

	}

}
