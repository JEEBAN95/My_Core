package com.jk.test;

import com.jk.PaymentFactory.PaymentImpl;
import com.jk.comp.Items;
import com.jk.comp.PaymentStargy;

public class PaymentTest {

	public static void main(String[] args) {

		Items items = null;
		PaymentStargy payment = null;

		payment = PaymentImpl.getInstance();

		items = new Items();
		items.setItemName("Cookies");
		items.setItemPrice(50); 
		items.setStergy(payment);
		System.out.println(items);
		payment.payment();
		
	}//main
}//Class
