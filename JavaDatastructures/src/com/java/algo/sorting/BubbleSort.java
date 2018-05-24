package com.java.algo.sorting;

public class BubbleSort {

	public static void main(String[] args) {

		int[] number_array = { 67, 45, 10, 100, 78, 65, 98, 42 };

		BubbleSort bubbleSort = new BubbleSort();

		bubbleSort.sort(number_array);

		System.out.println("After sorting:");
		bubbleSort.printArray(number_array);

	}

	private void printArray(int[] arr) {

		int size = arr.length;

		for (int i = 0; i < size; i++) {
			System.out.println(arr[i]);
		}

	}

	/**
	 * Worst and Average Case Time Complexity: O(n*n). Worst case occurs when array
	 * is reverse sorted.
	 *
	 * Best Case Time Complexity: O(n). Best case occurs when array is already
	 * sorted
	 * 
	 * @param arr
	 */
	public void sort(int[] arr) {

		int size = arr.length;

		// loop till the second last element
		for (int i = 0; i < size - 1; i++) {

			boolean swaps = false;

			for (int j = 0; j < size - i - 1; j++) {
				// if current element is greater than next element. swap it
				if (arr[j] > arr[j + 1]) {
					swaps = true;
					int temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
				}

			}

			// if no swaps happened then array is already sorted
			if (!swaps)
				break;

		}

	}

}
