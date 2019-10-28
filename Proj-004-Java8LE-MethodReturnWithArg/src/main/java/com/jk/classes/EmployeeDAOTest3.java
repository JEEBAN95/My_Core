package com.jk.classes;

public final class EmployeeDAOTest3 {

	public static void main(String[] args) {

		String records = null;
		
		EmployeeDAO3 dao = (msg) -> {
			System.out.println(msg);
		};
		records = "Records are Inserted.";
		dao.insertRecords(records);
	}
}
