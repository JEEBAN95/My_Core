package com.jk.classes;

public final class EmployeeDAOImpl {
	public static void main(String[] args) {
		EmployeeDAO dao = new EmployeeDAO() {
			
			@Override
			public void insertRecords() {
				System.out.println("insertRecords_ _ _ _");
			}
		};
		dao.insertRecords();
	}
}
