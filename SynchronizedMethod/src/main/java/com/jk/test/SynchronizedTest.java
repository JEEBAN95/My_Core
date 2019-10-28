package com.jk.test;

import com.jk.bo.EmployeeDAO;

public class SynchronizedTest {
	public static void main(String[] args) {
		
		EmployeeDAO dao1 = EmployeeDAO.getInstance();
		System.out.println(dao1.hashCode());	
		
		EmployeeDAO dao2 = EmployeeDAO.getInstance();
		System.out.println(dao2.hashCode());
	}
}
