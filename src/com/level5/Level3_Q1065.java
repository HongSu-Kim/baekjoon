package com.level5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Level3_Q1065 {

	public static void main(String[] args) throws IOException {

		int n, i, count = 0;
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		n = Integer.parseInt(br.readLine());
		for (i = 1; i <= n; i++) {

			if (i < 100) {
				count++;
			}

			else if (i == 1000) {
			}

			else {
				int a, b, c;
				String str = Integer.toString(i);
				a = Character.getNumericValue(str.charAt(0));
				b = Character.getNumericValue(str.charAt(1));
				c = Character.getNumericValue(str.charAt(2));
				if (a - b == b - c)
					count++;
			}

		}

		System.out.println(count);

	}

}
