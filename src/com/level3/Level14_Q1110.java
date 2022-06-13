package com.level3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Level14_Q1110 {

	public static void main(String[] args) throws IOException {

		int n1, n2, temp, count = 0;
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String str = br.readLine();
		if (Integer.parseInt(str) < 10) {
			n1 = 0;
			n2 = Integer.parseInt(str);
		} else {
			n1 = Integer.parseInt(str.substring(0, 1));
			n2 = Integer.parseInt(str.substring(1));
		}

		do {
			temp = n2;
			n2 = (n1 + n2) % 10;
			n1 = temp;
			count++;
		} while (Integer.parseInt(str) != n1 * 10 + n2);

		System.out.println(count);

	}

}
