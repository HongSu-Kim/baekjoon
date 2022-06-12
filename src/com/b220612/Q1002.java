package com.b220612;

import java.util.Scanner;

public class Q1002 {

	public static void main(String[] args) {

		int[] num = new int[6];
		int T, d, i, addR, subR;
		int[] result;
		Scanner sc = new Scanner(System.in);

		T = sc.nextInt();
		result = new int[T];
		for (i = 0; i < T; i++) {
			
			for (int j = 0; j < 6; j++) {
				num[j] = sc.nextInt();
			}

			d = (num[0] - num[3]) * (num[0] - num[3]) + (num[1] - num[4]) * (num[1] - num[4]);
			addR = (num[2] + num[5]) * (num[2] + num[5]);
			subR = (num[2] - num[5]) * (num[2] - num[5]);

			if (d == 0) {
				if (subR == 0)
					result[i] = -1;
				else
					result[i] = 0;
			} else {
				if (d > addR || d < subR)
					result[i] = 0;
				else if (d < addR && d > subR)
					result[i] = 2;
				else if (d == addR || d == subR)
					result[i] = 1;
				else
					result[i] = 2;
			}

		}

		for (i = 0; i < T; i++) {
			System.out.println(result[i]);
		}

		sc.close();

	}

}
