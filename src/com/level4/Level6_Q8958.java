package com.level4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Level6_Q8958 {

	public static void main(String[] args) throws IOException {

		String[] str;
		int i, j, score, n;
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		str = new String[Integer.parseInt(br.readLine())];

		for (i = 0; i < str.length; i++)
			str[i] = br.readLine();

		for (i = 0; i < str.length; i++) {
			score = 0;
			n = 0;
			for (j = 0; j < str[i].length(); j++) {
				if (str[i].charAt(j) == 'O')
					score += ++n;
				else
					n = 0;

			}

			System.out.println(score);

		}

	}

}
