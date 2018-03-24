package com.java.hackerrank.algo.warmup;

import java.math.BigInteger;
import java.util.Scanner;

/**
 * 
 * @author Z003PV5V
 *
 *         Given five positive integers, find the minimum and maximum values
 *         that can be calculated by summing exactly four of the five integers.
 *         Then print the respective minimum and maximum values as a single line
 *         of two space-separated long integers.
 *
 *
 *
 *
 */
public class MinAndMaximumSum {

	static void miniMaxSum(int[] arr) {

		int minimumValue = arr[0];
		int maxValue = arr[0];
		long totalSum = 0;

		for (int i = 0; i < arr.length; i++) {
			totalSum += arr[i];

			if (minimumValue > arr[i]) {
				minimumValue = arr[i];
			}

			if (maxValue < arr[i]) {
				maxValue = arr[i];
			}
		}
		
		long minSum = totalSum-maxValue;
		long maxSum = totalSum - minimumValue;
				
		System.out.println(minSum+" "+ maxSum);

	}

	private static final Scanner scan = new Scanner(System.in);

	public static void main(String[] args) {
		int[] arr = new int[5];

		String[] arrItems = scan.nextLine().split(" ");

		for (int arrItr = 0; arrItr < 5; arrItr++) {
			arr[arrItr] = Integer.parseInt(arrItems[arrItr].trim());
		}

		miniMaxSum(arr);

	}

}
