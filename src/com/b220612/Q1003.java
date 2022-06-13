package com.b220612;

import java.util.Scanner;

public class Q1003 {

	static int fibonacci(int n) {
		if (n == 0) {
			return 1;
		} else if (n == 1) {
			return 0;
		} else {
			return fibonacci(n - 1) + fibonacci(n - 2);
		}
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int[] a = {1, 0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144, 233, 377, 610, 987, 1597, 2584, 4181, 6765, 10946,
				17711, 28657, 46368, 75025, 121393, 196418, 317811, 514229, 832040, 1346269, 2178309, 3524578, 5702887,
				9227465, 14930352, 24157817, 39088169, 63245986, 102334155};
		int t = sc.nextInt();
		int[] num = new int[t];
		for (int i = 0; i < t; i++) {
			num[i] = sc.nextInt();
		}
		for (int i = 0; i < t; i++) {

//			System.out.println(fibonacci(num[i]) + " " + fibonacci(num[i] + 1));
			System.out.println(a[num[i]] + " " + a[num[i] + 1]);
		}
		sc.close();
	}

}
