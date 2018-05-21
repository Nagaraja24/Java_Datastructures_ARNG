package com.java.threads;

import java.util.Scanner;

public class InterThreadComm {

	public static void main(String[] args) throws InterruptedException {

		final PC pc = new PC();

		Thread t1 = new Thread(() -> {
			//call produce
			try {
				pc.produce();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		});
		
		Thread t2 = new Thread(new Runnable() {
			
			@Override
			public void run() {
				//call consume
				try {
					pc.consume();
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
			}
		});
		
		t1.start();
		t2.start();
		
		t1.join();
		t2.join();
		
		

	}

	static class PC {

		public void produce() throws InterruptedException {

			synchronized (this) {
				System.out.println("Producer thread running");

				wait();

				System.out.println("Resume");
			}
		}

		public void consume() throws InterruptedException {

			// this makes the produce thread to run first.
			Thread.sleep(1000);
			Scanner s = new Scanner(System.in);

			synchronized (this) {
				System.out.println(Thread.currentThread().getThreadGroup());
				System.out.println("Waiting for return key.");
				s.nextLine();
				System.out.println("Return key pressed");

				// notifies the produce thread that it
				// can wake up.
				notify();
				
				//Thread.dumpStack();

				// Sleep
				Thread.sleep(20000);

			}

		}
	}

}
