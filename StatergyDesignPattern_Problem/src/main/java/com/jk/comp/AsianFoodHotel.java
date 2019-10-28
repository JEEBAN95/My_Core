package com.jk.comp;

import com.jk.commons.FoodTypes;

public class AsianFoodHotel implements Resturant {

	private String foodType;
	private String custName;

	public String getCustName() {
		return custName;
	}

	public void setCustName(String custName) {
		this.custName = custName;
	}

	public String getFoodType() {
		return foodType;
	}

	public void setFoodType(String foodType) {
		this.foodType = foodType;
	}

	public String[] getFoods() {
		if (foodType.equalsIgnoreCase(FoodTypes.VEG_TYPE)) {
			return new String[] { "Rice", "Dal,", "Paneer Curry", "Mosroom Curry" };
		} else if (foodType.equalsIgnoreCase(FoodTypes.NON_VEG_TYPE)) {
			return new String[] { "Beriyani", "Egg-Rice", "Chicken Fry", "Chicken Curry", "Chicken Masala" };
		} else
			return null;
	}

	@Override
	public String order(Boolean isOrder) {
		if (isOrder) {
			System.out.println(total_billAmt());
			calculateBIlls();
			return "Oder is given by" + custName;
		} else
			return null;
	}

	@Override
	public String deliver(Boolean isDelliver) {
		if (isDelliver)
			return "Food is Delivered";
		else
			return "Not Deliverd";
	}

	@Override
	public int total_billAmt() {
		if (foodType.equalsIgnoreCase(FoodTypes.VEG_TYPE))
			return 250;
		else if (foodType.equalsIgnoreCase(FoodTypes.NON_VEG_TYPE))
			return 350;
		else
			return 0;
	}

	@Override
	public void calculateBIlls() {
		int tax = 2;
		int billAmt = total_billAmt() + tax;
		System.out.println(billAmt);
	}
}
