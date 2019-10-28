package com.jk.classes;

public final class EmployeeDAOImpl {
	
	public static void main(String[] args) {
		EmployeeDAO dao = ()->{
			return "Inserting...";	
		};
		System.out.println(dao.insertRecords());
	}
}
