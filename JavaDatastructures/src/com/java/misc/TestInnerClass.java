package com.java.misc;

public class TestInnerClass {

	Outer outer = new Outer();

	Outer.Inner inner = new Outer().new Inner();

	Outer.InnerStatic innerStatic = new Outer.InnerStatic();

	Age age = new Age() {

		@Override
		public int getAge() {
			return 0;
		}
	};
	
	public static void main(String[] args) {
	}

}

class Outer {

	int outer_x = 10;
	static int outer_y = 20;

	static class InnerStatic {

		void display() {

			// System.out.println("Outer x:" + outer_x); Static inner class cann
			System.out.println("Outer y:" + outer_y);
		}

	}

	class Inner {

		void display() {
			System.out.println("Outer x:" + outer_x);
			System.out.println("Outer y:" + outer_y);

		}

	}
}

interface Age {

	int getAge();

}
