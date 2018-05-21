package com.java.threads;

public class ThreadJoinDemo {

	public static void main(String[] args) throws InterruptedException {

		Thread t1 = new Thread(new Mythread());

		t1.start();

		t1.join(1000);

		System.out.println("\nJoining after 1000" + " mili seconds: \n");
		System.out.println("Current thread: " + t1.getName());

		// Checks if this thread is alive
		System.out.println("Is alive? " + t1.isAlive());

	}

}

class Mythread implements Runnable {

	@Override
	public void run() {

		Thread t = Thread.currentThread();

		System.out.println("Current thread name:" + t.getName());

		System.out.println("Is current thread alive:" + t.isAlive());
	}

}