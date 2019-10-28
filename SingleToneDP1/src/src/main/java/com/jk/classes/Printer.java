package com.jk.classes;

public class Printer {

	static Printer INSTANCE;

	private Printer() {
		System.out.println("Printer.Printer()");
	}

	public final static Printer getInstance() {

		if (INSTANCE == null) {
			INSTANCE = new Printer();
		}
		return INSTANCE;
	}
}
