package com.jk.classes;

public final class EmployeeDAOImpl {

	public EmployeeDAOImpl() {
		System.out.println("EmployeeDAOImpl.EmployeeDAOImpl()");
	}

	public static void main(String[] args) {

		Runnable r1 = null;
		r1 = ()-> {
			System.out.println("EmployeeDAOImpl.main()");
		};
		
		Thread th1 = new Thread(r1);
		th1.start();
	}
}
