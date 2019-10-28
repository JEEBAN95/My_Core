package com.jk.comp;

import java.util.ArrayList;
import java.util.Hashtable;
import java.util.List;

public class MyThread implements Runnable {

	private static EmployeeDAO empDAO;
	
	static {
		empDAO = new EmployeeDAO();
		System.out.println("EmployeeDAO :: "+empDAO.hashCode());
	}
	
	@Override
	public void run() {
		System.out.println("MyThread.run()");
		List<EmployeeBO> listDAO = null;
		listDAO = empDAO.putEmpdetailsInHashTable();
		listDAO.forEach(bo -> {
			System.out.println(bo);
		});
	}
}
