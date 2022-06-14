package com.level6;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Level4_Q2675 {

	public static void main(String[] args) throws IOException {

		int t, r;
		String s;
		char x;

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuffer p = new StringBuffer();

		t = Integer.parseInt(br.readLine());
		for (int i = 0; i < t; i++) {

			StringTokenizer st = new StringTokenizer(br.readLine());
			r = Integer.parseInt(st.nextToken());
			s = st.nextToken();

			for (int j = 0; j < s.length(); j++) {
				x = s.charAt(j);
				for (int k = 0; k < r; k++)
					p.append(x);
			}
			p.append("\n");

		}

		System.out.println(p);

	}

}
