package com.jk.test;

import com.jk.classes.TicketPrinterServlet;

public class SingletoneTestUsingMultiThreadingEnv2 {

	public static void main(String[] args) {

		TicketPrinterServlet tpr = new TicketPrinterServlet();

		Thread th1 = null;
		Thread th2 = null;
		Thread th3 = null;
		
		th1 = new Thread(tpr);
		th2 = new Thread(tpr);
		th3 = new Thread(tpr);
		
		th1.start();
		th2.start();
		th3.start();
	}
}
