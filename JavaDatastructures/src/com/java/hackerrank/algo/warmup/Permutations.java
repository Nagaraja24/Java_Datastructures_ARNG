package com.java.hackerrank.algo.warmup;

public class Permutations {

	public static void main(String[] args) {
		java.lang.String str = "ABC";
		int n = str.length();
		Permutations permutation = new Permutations();
		permutation.permute(str, 0, n - 1);
	}

	private void permute(String str, int left, int right) {

		if (left == right) {
			System.out.println(str);
			return;
		}

		for (int i = left; i <= right; i++) {
			str = swap(str, left, i);
			permute(str, left + 1, right);
			str = swap(str, left, i);
		}
	}

	private String swap(String s, int i, int j) {

		char[] charArray = s.toCharArray();
		char temp = charArray[i];
		charArray[i] = charArray[j];
		charArray[j] = temp;

		return String.valueOf(charArray);

	}

}
