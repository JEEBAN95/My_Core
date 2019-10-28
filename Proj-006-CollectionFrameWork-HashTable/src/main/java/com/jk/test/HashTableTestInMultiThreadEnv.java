package com.jk.test;

import com.jk.comp.MyThread;

public class HashTableTestInMultiThreadEnv {
	public static void main(String[] args) throws InterruptedException {
		
		MyThread mt= new MyThread();
		
		Thread th1, th2, th3 = null;
		
		th1 = new Thread(mt);
		th2 = new Thread(mt);
		th1.run();
		System.out.println("----------------------------");
		th2.run();
		System.out.println("----------------------------");
		
		th3 = new Thread(mt);
		th3.run();
		
	}
}
