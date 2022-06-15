package com.level6;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Level5_Q1157 {

	public static void main(String[] args) throws IOException {

		int[][] a = new int[26][2];
		int i;
		String s;
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		s = br.readLine().toUpperCase();

		for (i = 0; i < 26; i++)
			a[i][0] = 'A' + i;
		for (i = 0; i < s.length(); i++)
			a[s.charAt(i) - 'A'][1]++;

		for (i = 0; i < 25; i++) {
			for (int j = i; j < 26; j++) {
				if(a[i][1] < a[j][1]) {
					a[i][0] = a[i][0]^a[j][0];
					a[j][0] = a[i][0]^a[j][0];
					a[i][0] = a[i][0]^a[j][0];
					a[i][1] = a[i][1]^a[j][1];
					a[j][1] = a[i][1]^a[j][1];
					a[i][1] = a[i][1]^a[j][1];
				}
			}
		}
		
		if (a[0][1] == a[1][1])
			System.out.println("?");
		else
			System.out.printf("%c", a[0][0]);
		
	}

}
