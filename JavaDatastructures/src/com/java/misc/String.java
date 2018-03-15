package com.java.misc;

public class String {

	public static void main(String[] args) {
		System.out.println("I got confused"); // Run time error
	}
	
	public static void main(java.lang.String[] args) {
		System.out.println("It works");
	}

}
