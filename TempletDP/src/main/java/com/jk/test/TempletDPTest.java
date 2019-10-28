package com.jk.test;

import com.jk.comp.HireFreshers;
import com.jk.comp.HireJAVAFreshers;

public class TempletDPTest {
	public static void main(String[] args) {
		HireFreshers javaFreshers, dotNetFreshers = null;
		boolean result = false;
		javaFreshers = new HireJAVAFreshers();
		result = javaFreshers.recuitmentProcess();

		HireJAVAFreshers freshers = new HireJAVAFreshers();
		freshers.conductApptitudeTest();
		freshers.conductGroupDisscussion();
		freshers.conductTechnicalTest();
		if (result) {
			System.out.println("Congrats you are selected");
		} else {
			System.out.println("Please try after 6 months");
		}
	}
}
