package com.jk.test;

import com.jk.plan.BillsPlan;
import com.jk.plan.ElectriBillsPlan;
import com.jk.planFactory.BillsPlanFactory;
import com.jk.planType.ElectriPlan;

public class BillsPayment {
	public static void main(String[] args) {
		
		BillsPlan plan = null;
		BillsPlanFactory factory = null;
		
		factory=new BillsPlanFactory();
		plan = factory.getPlan(ElectriPlan.COMMERCIAL_TYPE);
		System.out.println(plan.calculateBills(65));
	}
}
