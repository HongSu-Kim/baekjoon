package com.level4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Level2_Q2562 {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int[] num = new int[9], rank = new int[9];
		int i, j;

		for (i = 0; i < 9; i++) {
			num[i] = Integer.parseInt(br.readLine());
		}

		for (i = 0; i < 8; i++) {
			for (j = i + 1; j < 9; j++) {
				if (num[i] > num[j])
					rank[i]++;
				else if (num[i] < num[j])
					rank[j]++;
			}
		}
		
		for (i = 0; i < 9; i++) {
			if (rank[i] == 8)
				System.out.println(num[i] + "\n" + (i + 1));
		}

	}

}
