package com.level4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Level5_Q1546 {

	public static void main(String[] args) throws IOException {

		int n, i, j;
		int[] score;
		double sum = 0;
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		n = Integer.parseInt(br.readLine());
		score = new int[n];

		StringTokenizer st = new StringTokenizer(br.readLine());
		for (i = 0; i < n; i++)
			score[i] = Integer.parseInt(st.nextToken());

		for (i = 0; i < n - 1; i++) {
			for (j = i + 1; j < n; j++) {
				if (score[i] < score[j]) {
					int temp = score[i];
					score[i] = score[j];
					score[j] = temp;
				}
			}
		}

		for (i = 0; i < n; i++)
			sum += score[i];

		System.out.println(sum / score[0] * 100 / n);

	}

}
