package com.jk.classes;

public class MyThread extends Thread {
	
	@Override
	public synchronized void start() {
		System.out.println("MyThread.start()");
	}
	
}
