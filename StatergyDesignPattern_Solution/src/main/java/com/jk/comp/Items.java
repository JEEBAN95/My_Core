package com.jk.comp;

public class Items {

	private String itemName;
	private int itemPrice;
	private PaymentStargy stergy;

	public PaymentStargy getStergy() {
		return stergy;
	}

	public void setStergy(PaymentStargy stergy) {
		this.stergy = stergy;
	}

	public String getItemName() {
		return itemName;
	}

	public void setItemName(String itemName) {
		this.itemName = itemName;
	}

	public int getItemPrice() {
		return itemPrice;
	}

	public void setItemPrice(int itemPrice) {
		this.itemPrice = itemPrice;
	}

	@Override
	public String toString() {
		return "Items [itemName=" + itemName + ", itemPrice=" + itemPrice + ", stergy=" + stergy + "]";
	}
}
