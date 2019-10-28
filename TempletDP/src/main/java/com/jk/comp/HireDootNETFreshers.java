package com.jk.comp;

public class HireDootNETFreshers extends HireFreshers {

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
	
	private boolean conductDotNETTechnicalTest() {
		System.out.println("Conduct DotNET Technical Test");
		return true;
	}
	private boolean conductDotNETSystemTest() {
		System.out.println("Conduct DotNET System Test");
		return true;
	}
}
