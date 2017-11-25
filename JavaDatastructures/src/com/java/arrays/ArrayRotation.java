package com.java.arrays;

public class ArrayRotation {

	public static void main(String[] args) {

		int arr[] = { 1, 2, 3, 4, 5, 6, 7, 8 };

		leftRotate(arr, 3, 8);
		printArray(arr, 8);

	}

	static void leftRotate(int arr[], int d, int n) {
		int i;
		for (i = 0; i < d; i++) {
			leftRotateByOne(arr, n);
		}

	}

	static void leftRotateByOne(int arr[], int n) {

		int i;
		int temp;
		temp = arr[0];
		for (i = 0; i < n - 1; i++) {
			arr[i] = arr[i + 1];
		}
		arr[i] = temp;

	}

	static void printArray(int arr[], int size) {
		for (int i = 0; i < size; i++) {
			System.out.print(arr[i] + " ");
		}
	}

}
