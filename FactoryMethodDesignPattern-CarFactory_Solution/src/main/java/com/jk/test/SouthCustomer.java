package com.jk.test;

import com.jk.bikeTypes.BikeType;
import com.jk.bikefactory.BajajFactory;
import com.jk.classes.Bike;
import com.jk.mfc.ChennaiFactory;

public class SouthCustomer {
	public static void main(String[] args) {
	
		BajajFactory factory=null;
		Bike bike = null;
		
		factory= new ChennaiFactory();
		bike = factory.getInstance(BikeType.DISCOVER_TYPE);
		bike.setBikeID("1002");
		bike.setEngineCC("200");
		bike.drive();	
	}
}
