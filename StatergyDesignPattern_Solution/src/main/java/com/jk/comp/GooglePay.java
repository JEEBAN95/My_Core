package com.jk.comp;

public final class GooglePay implements PaymentStargy {
	
	private long phoneNo;
	private String password;
	
	public long getPhoneNo() {
		return phoneNo;
	}
	public void setPhoneNo(long phoneNo) {
		this.phoneNo = phoneNo;
	}
	public  String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	@Override
	public void payment() {
		System.out.println("Payment by GooglePay");
		
			System.out.println("Status :: Payment is Succeeded");
	}
	@Override
	public String toString() {
		return "GooglePay";
	}
}
