package com.java.algo.searching.linear;

public class LinearSearch {

	public static void main(String[] args) {
		
		int[] elements = {1,2,3};
		
		System.out.println("Element : 3 found at the index :"+linearSearch(elements, 3, 3));

	}

	/**
	 * 
	 * Search given element 
	 * 
	 * Time complexity of linear seacrh is O(n)
	 * 
	 * @param arr
	 * @param size
	 * @param x
	 * @return index of element
	 */
	public static int linearSearch(int[] arr, int size, int x) {

		for (int i = 0; i < size; i++) {
			if (arr[i] == x)
				return i;
		}

		return -1;
	}

}
