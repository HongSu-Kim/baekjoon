package com.level2;

import java.util.Scanner;

public class Level6_Q2525 {

	public static void main(String[] args) {

		int a, b, c;
		Scanner sc = new Scanner(System.in);
		a = sc.nextInt();
		b = sc.nextInt();
		c = sc.nextInt();
		sc.close();

		a += c / 60;
		b += c % 60;

		if (b >= 60) {
			a++;
			b -= 60;
		}
		if (a >= 24) {
			a -= 24;
		}
		System.out.println(a + " " + b);

	}

}
