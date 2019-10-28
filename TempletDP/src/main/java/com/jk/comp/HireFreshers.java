package com.jk.comp;

public abstract class HireFreshers {
	
	public boolean conductApptitudeTest() {
		return true;
	}
	public boolean conductGroupDisscussion() {
		return true;
	}
	public abstract boolean conductTechnicalTest();
	public abstract boolean conductSystemTest();
	
	public boolean coductHR() {
		return true;
	}
	public final boolean recuitmentProcess() {
		boolean result = conductApptitudeTest();
		if(result) {
			return conductGroupDisscussion();
		}
		if(result) {
			return conductTechnicalTest();
		}
		if(result) {
			return conductSystemTest();
		}
		return result;
	}
}
