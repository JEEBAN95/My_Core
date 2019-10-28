package com.jk.classes;

@FunctionalInterface
public interface EmployeeDAO {
	
	// functional interfaces are having only one method
	public String insertRecords(String msg);
}
