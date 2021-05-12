package com.ojas;

public class MyThread extends Thread {

	public static void main(String[] args) {
		MyThread mt = new MyThread() {
			public void run() {

				for (int i = 1; i <= 10; i++) {
					System.out.println(5 + " * " + i + " = " + (5 * i));
					try {
						Thread.sleep(1000);
					} catch (InterruptedException e) {

						System.out.println(e);
					}
				}
			}
		};
		mt.start();
	}
}