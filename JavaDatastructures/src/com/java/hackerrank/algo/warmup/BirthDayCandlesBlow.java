package com.java.hackerrank.algo.warmup;

import java.util.Scanner;

/**
 * You are in-charge of the cake for your niece's birthday and have decided the cake will have one candle for each year of her total age. 
 * When she blows out the candles, she’ll only be able to blow out the tallest ones.
 * Your task is to find out how many candles she can successfully blow out
 * 
 * @author Z003PV5V
 *
 */
public class BirthDayCandlesBlow {
	
	
	static int birthdayCakeCandles(int n, int[] ar) {
		
		int tallestCandles = 0;
		int tallest = ar[0];
		
		for(int i=0; i<ar.length; i++) {
			if(ar[i]>tallest) {
				tallest = ar[i];
				tallestCandles = 1;
			}else if(ar[i] == tallest) {
				tallestCandles++;
			}
			
		}
		
		return tallestCandles;
	}
	
	private static final Scanner scanner = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		int number = Integer.parseInt(scanner.nextLine().trim());
		
		String[] arr = scanner.nextLine().split(" ");
		
		int[] candles = new int[number];
		
		for(int arrItr=0; arrItr<number; arrItr++) {
			candles[arrItr] = Integer.parseInt(arr[arrItr].trim());
		}
		
		System.out.println(birthdayCakeCandles(number, candles));
		
	}

}
