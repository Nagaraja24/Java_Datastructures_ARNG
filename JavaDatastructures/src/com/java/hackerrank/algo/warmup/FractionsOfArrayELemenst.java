package com.java.hackerrank.algo.warmup;

import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.util.Scanner;

/**
 * 
 * @author Z003PV5V
 * 
 *         To find the fractions of its elements that are positive , negative
 *         and zeros
 * 
 *         Eg: -4, 3, -9, 0, 4, 1
 * 
 *         Postive fraction: totalNoOfPositiveNo(3)/Total Nos(6) = 0.5000000
 *         Negative fraction: totalNoOfNegativeNos(2)/TotlaNos(6) = 0.333333
 * 
 * 
 *         1) A decimal representing of the fraction of positive numbers in the
 *         array compared to its size. 2) A decimal representing of the fraction
 *         of negative numbers in the array compared to its size. 3) A decimal
 *         representing of the fraction of zeros in the array compared to its
 *         size.
 *
 */
public class FractionsOfArrayELemenst {

	static void plusMinus(int[] arr) {

		int arrLength = arr.length;
		int positiveNoCount = 0;
		int negativeNoCount = 0;
		int zeroNoCount = 0;

		for (int i = 0; i < arr.length; i++) {

			if (arr[i] == 0) {
				zeroNoCount++;
			} else if (arr[i] > 0) {
				positiveNoCount++;
			} else {
				negativeNoCount++;
			}

		}
		
		decimal.setRoundingMode(RoundingMode.CEILING);
		
		System.out.println(decimal.format((float)positiveNoCount/arrLength));
		System.out.println(decimal.format((float)negativeNoCount/arrLength));
		System.out.println(decimal.format((float)zeroNoCount/arrLength));

	}

	private static final Scanner scan = new Scanner(System.in);
	private static final DecimalFormat decimal = new DecimalFormat("#.000000");

	public static void main(String[] args) {

		int n = Integer.parseInt(scan.nextLine());

		int[] arr = new int[n];

		String[] arrItems = scan.nextLine().split(" ");

		for (int arrItr = 0; arrItr < n; arrItr++) {
			int arrItem = Integer.parseInt(arrItems[arrItr].trim());
			arr[arrItr] = arrItem;
		}

		plusMinus(arr);

	}

}
