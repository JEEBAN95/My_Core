package com.jk.classes;

public class Printer4 extends CommonsUtil {

	private static final long serialVersionUID = -6084337995703687383L;
	static Printer4 INSTANCE;

	private Printer4() {
		System.out.println("Printer4 :: 0-Param Constructor");
	}

	public final static Printer4 getInstance() {

			if (INSTANCE == null)
				synchronized (Printer4.class) {
					if (INSTANCE == null)
						INSTANCE = new Printer4();
				}
		return INSTANCE;
	}

	@Override
	public final Object clone() throws CloneNotSupportedException {
		throw new CloneNotSupportedException("Use Already Available Object");
	}
	
		private Object readResolve() {
			return INSTANCE;	
		}
}
