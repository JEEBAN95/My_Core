package com.jk.classes;

public final class EmployeeDAOTest1 {

	public static void main(String[] args) {

		EmployeeDAO dao = (msg) -> {
			return "Records are" + msg;
		};
		System.out.println(dao.insertRecords(" Inserting"));
	}
}
