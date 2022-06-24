package com.level6;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Level9_Q2941 {

	static String str;

	private static char nc(int i) {
		if (i < str.length() - 1)
			return str.charAt(++i);
		return 0;
	}

	private static char nc2(int i) {
		if (i < str.length() - 2) {
			i += 2;
			return str.charAt(i);
		}
		return 0;
	}

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		str = br.readLine();
		int cnt = 0;

		try {
			for (int i = 0; i < str.length(); i++, cnt++) {
				switch (str.charAt(i)) {
				case 'c':
					if (nc(i) == '=' || nc(i) == '-')
						i++;
					break;
				case 'd':
					if (nc(i) == 'z' && nc2(i) == '=') {
						i += 2;
					}
					if (nc(i) == '-')
						i++;
					break;
				case 'l':
					if (nc(i) == 'j')
						i++;
					break;
				case 'n':
					if (nc(i) == 'j')
						i++;
					break;
				case 's':
					if (nc(i) == '=')
						i++;
					break;
				case 'z':
					if (nc(i) == '=')
						i++;
					break;
				}
			}
		} catch (Exception e) {
		}

		System.out.println(cnt);
	}

}
