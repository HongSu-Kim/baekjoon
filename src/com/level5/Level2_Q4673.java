package com.level5;

public class Level2_Q4673 {

	public static void main(String[] args) {

		int i, j, sum;
		int[] n = new int[10000];
		for (i = 0; i < n.length; i++) {
			n[i] = i;
		}

		for (i = 0; i < n.length; i++) {
			sum = i;
			String str = Integer.toString(i);
			for (j = 0; j < str.length(); j++) {
				sum += Character.getNumericValue(str.charAt(j));
			}
			if (sum < n.length)
				n[sum] = 0;
		}

		for (i = 0; i < n.length; i++)
			if (n[i] != 0)
				System.out.println(n[i]);

	}

}
