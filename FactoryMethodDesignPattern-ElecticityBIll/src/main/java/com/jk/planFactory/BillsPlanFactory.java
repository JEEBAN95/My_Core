package com.jk.planFactory;

import com.jk.plan.BillsPlan;
import com.jk.plan.CommercialBillsPlan;
import com.jk.plan.DomesticBillsPlan;
import com.jk.plan.ElectriBillsPlan;
import com.jk.plan.InstitutionalBillsPlan;

public class BillsPlanFactory implements ElectriBillsPlan {

	@Override
	public BillsPlan getPlan(String planType) {

		BillsPlan plan = null;

		if (planType == null)
			return null;

		else if (planType.equals("domestic"))
			plan = new DomesticBillsPlan();

		else if (planType.equals("commercial")) {
			plan = new CommercialBillsPlan();
		}

		else if (planType.equals("institutional")) {
			plan = new InstitutionalBillsPlan();
		}
		return plan;
	}
}
