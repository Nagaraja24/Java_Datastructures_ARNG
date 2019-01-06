package com.java.hackerrank.algo.warmup;

/**
 * 
 * Solve using binary search method
 * 
 * Time complexity = O(logn)
 * 
 * 
 * 1) If the first element is not same as its index then return first index 
 * 2)Else get the middle index say mid
 * …………a) If arr[mid] greater than mid then the required element lies in left half.
 * …………b) Else the required element lies in right half.
 * 
 * @author nagaraj
 *
 */
public class FirstMissingNumberSortedArray {

	public static void main(String[] args) {

		int[] numbers = { 0, 1, 3, 4, 6, 7, 8, 11 };

		System.out.println("First missing number is" + findMissingNumber(numbers, 0, numbers.length - 1));

	}

	public static int findMissingNumber(int[] array, int start, int end) {

		if (start > end)
			return end + 1;

		if (array[start] != start)
			return start;

		int mid = (start + end) / 2;

		// First half has all the numbers, search in the right half
		if (array[mid] == mid) {
			return findMissingNumber(array, mid + 1, end);
		}

		// search in the first half
		return findMissingNumber(array, start, mid);

	}

}
