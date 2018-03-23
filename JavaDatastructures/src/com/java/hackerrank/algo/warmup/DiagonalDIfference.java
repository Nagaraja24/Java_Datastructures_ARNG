package com.java.hackerrank.algo.warmup;

import java.util.Scanner;

/*
 * Find the absolute value of diagonal difference of the matrix
 */
public class DiagonalDIfference {

	static int daigonalDifference(int[][] a) {

		int primaryDiagonalSum = 0;
		for (int i = 0; i < a.length; i++) {
			primaryDiagonalSum += a[i][i];

		}

		int secondaryDiagonalSum = 0;

		for (int i = 0; i < a.length; i++) {
			secondaryDiagonalSum += a[i][a.length - 1 - i];
		}

		return Math.abs(primaryDiagonalSum - secondaryDiagonalSum);

	}

	private static final Scanner scan = new Scanner(System.in);

	public static void main(String[] args) {

		int n = Integer.parseInt(scan.nextLine().trim());

		int[][] a = new int[n][n];

		for (int aRowItr = 0; aRowItr < n; aRowItr++) {

			String[] aRowItems = scan.nextLine().split(" ");

			for (int aColumnItr = 0; aColumnItr < n; aColumnItr++) {
				int aItem = Integer.parseInt(aRowItems[aColumnItr].trim());
				a[aRowItr][aColumnItr] = aItem;

			}

		}

		int result = daigonalDifference(a);
		System.out.println("The difference is :"+ result);

	}

}
