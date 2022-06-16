package com.level6;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Level8_Q5622 {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String s;
		int c, t = 0;

		s = br.readLine();

		for (int i = 0; i < s.length(); i++) {

			c = s.charAt(i);
			if (c < 'D')
				t += 3;
			else if (c < 'G' && c > 'C')
				t += 4;
			else if (c < 'J' && c > 'F')
				t += 5;
			else if (c < 'M' && c > 'I')
				t += 6;
			else if (c < 'P' && c > 'L')
				t += 7;
			else if (c < 'T' && c > 'O')
				t += 8;
			else if (c < 'W' && c > 'S')
				t += 9;
			else
				t +=10;

		}
		
		System.out.println(t);

	}

}
