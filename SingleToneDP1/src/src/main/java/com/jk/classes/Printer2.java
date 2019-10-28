package com.jk.classes;

public class Printer2 {

	static Printer2 INSTANCE;

	private Printer2() {
		System.out.println("Printer.Printer()");
	}

	public final static Printer2 getInstance() {

		if (INSTANCE == null) {
			synchronized (Printer2.class) {
				if (INSTANCE == null) {
					INSTANCE = new Printer2();
				}
			}
		}
		return INSTANCE;
	}
}
