package com.level6;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Level6_Q1152 {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String s;
		int c = 0;

		s = br.readLine().trim();

		if (s.length() != 0)
			c++;

		for (int i = 0; i < s.length(); i++)
			if (s.charAt(i) == ' ')
				c++;

		System.out.println(c);

	}

}
