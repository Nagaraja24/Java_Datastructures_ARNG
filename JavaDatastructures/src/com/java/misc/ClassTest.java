package com.java.misc;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class ClassTest {
	
	
	public static void main(String[] args) {
		
		Student s1 = new Student();
		
		Class student1 = s1.getClass();
		
		System.out.println("Class Name :"+ student1.getName());
		
		Method[] methods = student1.getDeclaredMethods();
		
		System.out.println("Methods are:");
		for(Method m: methods) {
			System.out.println(m.getName());
		}
		
		System.out.println("Fields are:");
		Field[] variables = student1.getDeclaredFields();
		
		for(Field f: variables) {
			System.out.println(f.getName());
		}
		
		// Class loader for String is bootstrap, and it is implemented in C/C++ so we do not get object
		
		System.out.println("String class loader:"+String.class.getClassLoader());
		
		
		//Class loader for Student is System/Application so we should get Launcher&Application
		
		System.out.println("Student Class Loader is:"+Student.class.getClassLoader());
		
		
		
	}
	
	

}
