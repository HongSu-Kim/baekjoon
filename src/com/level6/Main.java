package com.level6;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {

		int[] count = new int[26];
		char c;
		int n;
		String s;
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		s = br.readLine().toUpperCase();

		for (int i = 0; i < s.length(); i++)
			count[s.charAt(i) - 65]++;

		for (int i = 0; i < 25; i++) {
			for (int j = i; j < 26; j++) {
				
			}
		}
		
	}

}
