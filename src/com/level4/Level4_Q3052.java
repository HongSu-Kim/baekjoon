package com.level4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Level4_Q3052 {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int[] n = new int[10];
		int i, j, count = 10;

		for (i = 0; i < 10; i++)
			n[i] = Integer.parseInt(br.readLine()) % 42;

		for (i = 0; i < 9; i++) {
			for (j = i + 1; j < 10; j++) {
				if (n[i] == n[j]) {
					count--;
					break;
				}
			}

		}

		System.out.println(count);

	}

}
