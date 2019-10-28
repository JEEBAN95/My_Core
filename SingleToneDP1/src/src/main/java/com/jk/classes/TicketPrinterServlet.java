package com.jk.classes;

public class TicketPrinterServlet implements Runnable {

	public  TicketPrinterServlet() {	
		System.out.println("Printer.Printer()");
	}

	@Override
	public  void  run() {
		Printer2 INSTANCE = Printer2.getInstance();
		 System.out.println(INSTANCE.hashCode());
	}
}
