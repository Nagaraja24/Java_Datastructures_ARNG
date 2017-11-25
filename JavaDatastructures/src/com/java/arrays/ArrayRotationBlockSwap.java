package com.java.arrays;

public class ArrayRotationBlockSwap {

	public static void main(String[] args) {
		
		ArrayRotationBlockSwap swap = new ArrayRotationBlockSwap();
		
		int[] arr = {0,1,2,3,4,5,6};
		
		swap.leftRotate(arr, 5, 7);
		

	}

	 void leftRotate(int arr[], int d, int n) {

		// Skip if number of elements to be rotated is zero or length of array
		// Since elements will be in its place
		if (d == 0 || d == n)
			return;

		// If number of elements to be rotated is half of the array
		if (n - d == 0)
			swap(arr, 0, n - d, d);

		// if A is shorter
		if (d < n - d) {
			swap(arr, 0, n - d, d);
			leftRotate(arr, d, n - d);
		} else {
			swap(arr, 0, d, n-d);
			leftRotate(arr, d, n - d);
		}
	}

	/*
	 * This method swaps d elements starting at index firstArrIndex with d elements
	 * starting at index secondArrIndex
	 */
	void swap(int arr[], int firstArrIndex, int secondArrIndex, int d) {

		int i, temp;

		for (i = 0; i < d; i++) {
			temp = arr[i];
			arr[firstArrIndex + i] = arr[secondArrIndex + i];
			arr[secondArrIndex + i] = temp;
		}
	}
	
	public void printArr(int[] arr, int size) {
		
		for(int i=0; i<size; i++) {
			System.out.println(arr[i]);
		}
	}

}
