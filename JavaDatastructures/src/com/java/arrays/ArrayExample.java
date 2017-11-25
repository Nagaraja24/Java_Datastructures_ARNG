package com.java.arrays;

public class ArrayExample {
	
	public static void main(String[] args) {
		
		arrayInitialization();
		cloningArrays();
		
	}
	
	/**
	 * type var-name[]
	 * type[] var-name
	 * 
	 * 1)Direct super class of array is Object
	 * 2)Every array type implements interfaces Cloneable and java.io.Serializable
	 */
	
	static void arrayInitialization(){
		
		int[] numbers = new int[7];
		numbers[0] = 1;
		numbers[1] = 2;
		
		int numbers2[] = {1,2,3,4};
		
		System.out.println("numbers Class = " + numbers.getClass());
		System.out.println("numbers Super Class = " + numbers.getClass().getSuperclass());
		System.out.println("numbers2 Class = " + numbers.getClass());
		
		
	}
	
	/**
	 * 1) One dimensional arrays are deep copy
	 * 2) Multi dimensional arrays are shallow copy --> Sub elements are shared
	 * 
	 * 
	 */
	static void cloningArrays(){
		
		System.out.println("Deep Copy for Single Dimensional Array ");
		int intArray[] = {1,2,3};
		int cloneArray[] = intArray.clone();
		
		System.out.println("One dimensional  ==> intArray == cloneArray ? " +  (intArray == cloneArray) );
		
		System.out.println("Shallow Copy for Multi Dimensional Array ie Sub elements are shared");
		int intArrayMulti[][] = { {1,2,3}, {4,5,6} };
		int cloneArrayMulti[][] = intArrayMulti.clone();
		
		System.out.println("Multidimensional  ==> intArrayMulti == cloneArrayMulti ? " +  (intArrayMulti == cloneArrayMulti) );
		
		System.out.println(" Multidimensional Sub elements verify =>"+ (intArrayMulti[0] == cloneArrayMulti[0]));
		
	}

}
