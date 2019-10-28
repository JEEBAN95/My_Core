package com.jk.classes;

public class Printer {

	private static Printer INSTANCE;
	private static boolean isInstantiated = false;
	
	static {
		if(INSTANCE==null) {
			try {
				INSTANCE = new Printer();
				System.out.println("Object already created");
			} catch (InstantiationException e) {
				e.printStackTrace();
			}
			isInstantiated = true;
		}
	}

	private Printer() throws InstantiationException {
		if(isInstantiated) {
			throw new InstantiationException("Can not created object");
		}
		else
		System.out.println("Printer:: 0-Param Constructor");
	}

	/*	public final static Printer getInstance() {
	
			if (INSTANCE == null) {
				synchronized (Printer.class) {
					if (INSTANCE == null) {
						INSTANCE = new Printer();
					}
				} // synchronized
			}
			return INSTANCE;
		}*/
	
	public  static Printer getInstance() throws InstantiationException {
		return INSTANCE;
	}
}
