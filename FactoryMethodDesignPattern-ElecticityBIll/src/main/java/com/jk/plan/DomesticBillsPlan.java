package com.jk.plan;

public class DomesticBillsPlan implements BillsPlan {

	public DomesticBillsPlan() {
		System.out.println("DomesticBillsPlan");
	}
	
	@Override
	public double getRate() {
		return 3.50;
	}

	@Override
	public String calculateBills(int unit) {
		System.out.println("Unit :: "+unit);
		float price = (int) (getRate()*unit);
		return price+" rs";
	}
}
