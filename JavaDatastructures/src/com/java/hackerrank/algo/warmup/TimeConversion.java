package com.java.hackerrank.algo.warmup;

import java.util.Scanner;

public class TimeConversion {

	private static final Scanner scan = new Scanner(System.in);

	public static void main(String[] args) {
		String time = scan.nextLine();

		System.out.println(timeConversion(time));

	}

	static String timeConversion(String s) {

		String result = "";

		String[] tokens = s.split(":");

		String hh = tokens[0];
		String mm = tokens[1];
		String ss = tokens[2].substring(0, 2);
		String am_pm = tokens[2].substring(2);

		String temp_hh = "00";
		if (am_pm.equalsIgnoreCase("pm")) {
			if (hh.equals("12")) {
				result = hh + ":" + mm + ":" + ss;
			} else {
				temp_hh = Integer.parseInt(hh) + 12 + "";
				result = temp_hh + ":" + mm + ":" + ss;
			}
		} else if (am_pm.equalsIgnoreCase("am")) {
			if (hh.equals("12")) {
				temp_hh = "00";
				result = temp_hh + ":" + mm + ":" + ss;
			} else {
				result = hh + ":" + mm + ":" + ss;
			}

		}

		return result;
	}

}
