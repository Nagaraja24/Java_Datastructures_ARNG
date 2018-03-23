package com.java.hackerrank.algo.warmup;

import java.util.Scanner;

/**
 * Consider a staircase of size : n=4
 * 
 *     		#
 *		   ##
 *        ###
 *       ####
 *  
 *  Observe that its base and height
 * are both equal to , and the image is drawn using # symbols and spaces. The
 * last line is not preceded by any spaces. 
 * Write a program that prints a staircase of size n
 * 
 * 
 * 
 */

public class StaircasePrint {

	static void staircase(int n) {
		
		for(int i=1; i<=n; i++) {
			System.out.println(getEmptyString(n-i)+getSymbols(i));
		}

	}
	
	static String getSymbols(int n) {
		
		StringBuffer buffer = new StringBuffer();
		
		while(n>0) {
			buffer.append("#");
			n--;
		}
		
		return buffer.toString();
	}
	
	static String getEmptyString(int n) {
		StringBuffer buffer = new StringBuffer();

		while (n > 0) {
			buffer.append(" ");
			n--;
		}
		
		return buffer.toString();
	}
	
	
	private static final Scanner scan = new Scanner(System.in);

	public static void main(String[] args) {
		
		int n = Integer.parseInt(scan.nextLine().trim());
		
		staircase(n);

	}

}
