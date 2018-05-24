package com.java.algo.sorting;

public class SelectionSort {

	public static void main(String[] args) {

		int[] number_array = { 67, 45, 10, 100, 78, 65 };

		SelectionSort selectionSort = new SelectionSort();

		selectionSort.sort(number_array);

		System.out.println("After sorting:");
		selectionSort.printArray(number_array);

	}

	public void printArray(int[] arr) {

		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
	}

	/**
	 * 
	 * Time Complexity: O(n2) as there are two nested loops.
	 * 
	 * @param arr
	 */
	public void sort(int[] arr) {

		int size = arr.length;
		for (int i = 0; i < size; i++) {

			int min_index = i;
			// find a minimum index by looping through
			for (int j = i + 1; j < size; j++) {
				// next element is less than minimum element? then make it as minimum element
				if (arr[j] < arr[min_index]) {
					min_index = j;
				}
			}

			// if min_index and i are same do not swap
			// else swap the min_index value
			if (min_index != i) {
				int temp = arr[min_index];
				arr[min_index] = arr[i];
				arr[i] = temp;
			}

		}

	}

}
