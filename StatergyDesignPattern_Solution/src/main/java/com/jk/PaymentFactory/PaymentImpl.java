package com.jk.PaymentFactory;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import com.jk.comp.GooglePay;
import com.jk.comp.PaymentStargy;

public final class PaymentImpl {

	private static Properties prop = null;

	public PaymentImpl() {
		System.out.println("PaymentImpl.PaymentImpl()");
	}

	private static PaymentStargy stargy;

	static {
		prop = new Properties();
		try {
			try {
				prop.load(new FileInputStream("src/main/java/com/jk/commons/comp.properties"));
			} catch (IOException e) {
				// TODO Auto-generated catch block
				// e.printStackTrace();
			}
			
			// load the class
			// instantiate the class
			stargy = (PaymentStargy) Class.forName(prop.getProperty("p.mode")).newInstance();
		} // try
		catch (ClassNotFoundException cnf) {
			cnf.printStackTrace();
			System.out.println("Invalid Class Name");
		} // catch
		catch (InstantiationException ie) {
			// e.printStackTrace();
			System.out.println("Internal Problem");
		} // catch
		catch (IllegalAccessException ile) {
			// e.printStackTrace();
			System.out.println("Internal problem");
		} // catch
	}

	public static PaymentStargy getInstance() {
		return stargy;
	}
}
