package com.java.threads;

public class ThreadYieldDemo {

	public static void main(String[] args) {

		MyThreadYield t1 = new MyThreadYield();
		t1.start();

		for (int i = 0; i < 5; i++) {
			Thread.yield();
			System.out.println("Current Thread:"+ Thread.currentThread().getName());
		}

	}

}

class MyThreadYield extends Thread {

	@Override
	public void run() {

		for (int i = 0; i < 5; i++) {
			System.out.println("Current Thread:"+ Thread.currentThread().getName());
		}

	}

}
