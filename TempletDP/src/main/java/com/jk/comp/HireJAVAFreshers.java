package com.jk.comp;

public class HireJAVAFreshers extends HireFreshers {

	@Override
	public boolean conductTechnicalTest() {
		System.out.println("Proceed for Techical Test");
		return conductTechnicalTest();
	}

	@Override
	public boolean conductSystemTest() {
		System.out.println("Proceed for System Test");
		return conductSystemTest();
	}
	
	private boolean conductJAVATechnicalTest() {
		System.out.println("Conduct JAVA Technical Test");
		return true;
	}
	private boolean conductJAVASystemTest() {
		System.out.println("Conduct JAVA System Test");
		return true;
	}
}
