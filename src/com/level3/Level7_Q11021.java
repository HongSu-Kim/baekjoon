package com.level3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Level7_Q11021 {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int t, n, a = 0, b = 0;
		t = Integer.parseInt(br.readLine());
		for (int i = 0; i < t; i++) {

			StringTokenizer st = new StringTokenizer(br.readLine());
			
			n = Integer.parseInt(st.nextToken());
			if (n > 0 && n < 10)
				a = n;

			n = Integer.parseInt(st.nextToken());
			if (n > 0 && n < 10)
				b = n;

			sb.append("Case #" + (i + 1) + ": " + (a + b) + "\n");

		}

		System.out.println(sb);

	}

}
