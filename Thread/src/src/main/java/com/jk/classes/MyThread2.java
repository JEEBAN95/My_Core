package com.jk.classes;

public class MyThread2 extends Thread {
	
	
	@Override
	public synchronized void start() {
	System.out.println("MyThread2.start()");
	}
	
	@Override
	public void run() {
		MyThread th = new MyThread();
		th.start();
		System.out.println("MyThread2.run()");
	}
}
