package com.jk.classes;

public final class EmployeeDAOImpl {
	public static void main(String[] args) {
		EmployeeDAO dao = ()->{
			System.out.println("Inserting...");
		};
		dao.insertRecords();
	}
}
