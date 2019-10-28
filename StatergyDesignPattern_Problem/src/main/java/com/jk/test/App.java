package com.jk.test;

import com.jk.comp.AsianFoodHotel;
import com.jk.comp.Resturant;

public class App {
	public static void main(String[] args) {
		
		AsianFoodHotel as = null;
		as=new AsianFoodHotel();
		
		as.setFoodType("veg");
		as.setCustName("Raja");
		
		Resturant rs = as;
		rs.order(true);
		rs.deliver(true);
	}
}
