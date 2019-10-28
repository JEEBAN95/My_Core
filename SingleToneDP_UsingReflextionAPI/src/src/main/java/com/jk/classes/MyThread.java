package com.jk.classes;

public class MyThread implements Runnable {

	@Override
	public void run() {
		Printer INSTANCE;
		try {
			INSTANCE = Printer.getInstance();
			System.out.println(INSTANCE.hashCode());
		} catch (InstantiationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
