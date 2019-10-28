package com.jk.comp;

public final class CardPayment implements PaymentStargy {

	private String cardHolderName;
	private int cvv;
	private String expairyDate;

	public String getCardHolderName() {
		return cardHolderName;
	}

	public void setCardHolderName(String cardHolderName) {
		this.cardHolderName = cardHolderName;
	}

	public int getCvv() {
		return cvv;
	}

	public void setCvv(int cvv) {
		this.cvv = cvv;
	}

	public String getExpairyDate() {
		return expairyDate;
	}

	public void setExpairyDate(String expairyDate) {
		this.expairyDate = expairyDate;
	}

	@Override
	public void payment() {
		System.out.println("Payment by CardPayment.");
		System.out.println("Status :: Payment is Succeeded");
	}

	@Override
	public String toString() {
		return "CardPayment";
	}
}
