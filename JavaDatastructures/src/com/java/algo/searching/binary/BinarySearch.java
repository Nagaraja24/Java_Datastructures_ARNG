package com.java.algo.searching.binary;

public class BinarySearch {

	public static void main(String[] args) {

		int[] sortedArray = { 10, 12, 13, 15, 16, 17, 18, 19, 20 };
		int n = sortedArray.length;

		int index = binarySearch(sortedArray, 0, n - 1, 16);
		int index_iterative = binarySearchIterative(sortedArray, n, 16);

		System.out.println("Element 19 found at index : " + index);
		
		System.out.println("Element 19 found at index_iterative : " + index_iterative);

	}

	/**
	 * Recursive binary search for sorted array
	 * Time complexity is O(Log n)
	 * 
	 * @param array
	 * @param left
	 *            index
	 * @param right
	 *            index
	 * @param element
	 * @return index
	 */
	public static int binarySearch(int[] arr, int l, int r, int element) {

		if (r >= l) {
			int mid = l + (r - l) / 2;

			// if the element present in the middle itslef
			if (arr[mid] == element)
				return mid;

			// if element is smaller than the mid element, then search in the left half of
			// array
			if (arr[mid] > element)
				return binarySearch(arr, l, mid - 1, element);

			// if element is greater than the mid element, then search in the right half of
			// array
			if (arr[mid] < element)
				return binarySearch(arr, mid + 1, r, element);

		}

		return -1;
	}

	/**
	 * 
	 * Iterative binary search for sorted array
	 * 
	 * Time complexity is O(Log n)
	 * 
	 * @param array
	 * @param size
	 * @param element
	 * @return index of element in the array
	 */
	public static int binarySearchIterative(int[] arr, int size, int element) {

		int l = 0;
		int r = size - 1;

		while (r >= l) {

			int mid = l + (r - l) / 2;
			
			if (arr[mid] == element)
				return mid;

			// element is less than mid element
			if (arr[mid] > element)
				r = mid - 1;
			// element is greater than mid element
			if (arr[mid] < element)
				l = mid + 1;
		}

		return -1;
	}

}
