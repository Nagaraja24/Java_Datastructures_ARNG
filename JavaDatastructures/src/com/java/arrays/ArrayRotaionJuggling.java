package com.java.arrays;

public class ArrayRotaionJuggling {

	public static void main(String[] args) {

		int arr[] = { 1, 2, 3, 4, 5, 6, 7 };
		leftRotate(arr, 2, 7);
		printArray(arr, 7);

	}

	static void leftRotate(int arr[], int d, int n) {

		int i;
		int j;
		int k;
		int temp;
		int count=0;

		for (i = 0; i < gcd(d, n); i++) {
			
			temp = arr[i];
			j = i;

			while (1 != 0) {
				count ++;
				k = j + d;
				if (k >= n) {
					k = k - n;
				}
				if (k == i) {
					break;
				}
				arr[j] = arr[k];
				j = k;
			}
			arr[j] = temp;
		}
		System.out.println("Total Loops = " + count);
	}

	static int gcd(int a, int b) {

		if (b == 0) {
			return a;
		} else
			return gcd(b, a % b);
	}

	static void printArray(int arr[], int size) {
		int i;
		for (i = 0; i < size; i++)
			System.out.print(arr[i] + " ");
	}

}
