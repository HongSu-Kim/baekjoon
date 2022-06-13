package com.level2;

import java.util.Scanner;

public class Level5_Q2884 {

	public static void main(String[] args) {

		int h, m;
		Scanner sc = new Scanner(System.in);

		h = sc.nextInt();
		m = sc.nextInt();
		sc.close();

		if (m >= 45) {
			System.out.println(h + " " + (m - 45));
		} else {
			if (h == 0)
				h = 24;
			System.out.println((h - 1) + " " + (m + 15));
		}

	}

}
