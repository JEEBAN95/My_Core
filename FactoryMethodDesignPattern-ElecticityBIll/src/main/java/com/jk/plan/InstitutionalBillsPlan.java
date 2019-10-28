package com.jk.plan;

public class InstitutionalBillsPlan implements BillsPlan {

	public InstitutionalBillsPlan() {
		System.out.println("InstitutionalBillsPlan");
	}
	@Override
	public double getRate() {
		return 5.50;
	}
	@Override
	public String calculateBills(int unit) {
		float price = (int) (getRate()*unit);
		return price+" rs";
	}
}
