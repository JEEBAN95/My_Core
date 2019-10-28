package com.jk.plan;

public class CommercialBillsPlan implements BillsPlan {

	public CommercialBillsPlan() {
		System.out.println("CommercialBillsPlan");
	}

	@Override
	public double getRate() {
		return 7.50;
	}
	@Override
	public String calculateBills(int unit) {
		float price = (float) getRate()*unit;
		return price+" rs";
	}
}
