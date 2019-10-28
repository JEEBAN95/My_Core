package com.jk.bo;

public class EmployeeDAO {
	
	private EmployeeDAO() {
		System.out.println("Employee.Employee()");
	}
	private static EmployeeDAO INSTANCE;
	public synchronized static EmployeeDAO getInstance() {
		INSTANCE = new EmployeeDAO();
		return INSTANCE;
	}
}
