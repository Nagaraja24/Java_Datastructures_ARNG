package com.algorithms.sorting.selection;

/**
 * 
 * One of the simplest sorting algorithms works as follows: First, find the
 * smallest item in the array and exchange it with the first entry (itself if
 * the first entry is already the smallest). Then, find the next smallest item
 * and exchange it with the second entry. Continue in this way until the entire
 * array is sorted. This method is called selection sort because it works by
 * repeatedly selecting the smallest remaining item.
 * 
 * Proposition A. Selection sort uses N 2/2 compares and N exchanges to sort an
 * array of length N.
 * 
 * 
 * @author nagaraj
 *
 */
public class Selection {

	public static void sort(Comparable[] a) {

		int N = a.length;

		for (int i = 0; i < N; i++) {

			int min = i;

			for (int j = i + 1; j < N; j++) {
				if (less(a[j], a[min]))
					min = j;
			}
			exchange(a, i, min);
		}

	}

	public static void main(String[] args) {

		Integer[] numbers = { 5, 6, 1, 56, 32, 5, 9, 8, 54 };

		sort(numbers);
		show(numbers);
	}

	private static boolean less(Comparable v, Comparable w) {

		return v.compareTo(w) < 0;
	}

	private static void exchange(Comparable[] a, int i, int j) {
		Comparable temp = a[i];
		a[i] = a[j];
		a[j] = temp;

	}

	// Test whether the array entries are in order.
	public static boolean isSorted(Comparable[] a) {
		for (int i = 1; i < a.length; i++)
			if (less(a[i], a[i - 1]))
				return false;
		return true;
	}

	// Print the array, on a single line.
	private static void show(Comparable[] a) {
		for (int i = 0; i < a.length; i++)
			System.out.print(a[i] + " ");
		System.out.println();
	}
}
