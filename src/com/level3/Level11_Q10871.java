package com.level3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Level11_Q10871 {

	public static void main(String[] args) throws IOException {

		int n, x;
		int[] a;
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();

		StringTokenizer st1 = new StringTokenizer(br.readLine());
		n = Integer.parseInt(st1.nextToken());
		x = Integer.parseInt(st1.nextToken());

		a = new int[n];

		StringTokenizer st2 = new StringTokenizer(br.readLine());
		for (int i = 0; i < n; i++) {
			a[i] = Integer.parseInt(st2.nextToken());
			if (a[i] < x)
				sb.append(a[i] + " ");
		}

		System.out.println(sb);

	}

}
