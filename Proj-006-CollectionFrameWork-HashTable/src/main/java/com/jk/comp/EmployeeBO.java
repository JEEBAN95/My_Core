package com.jk.comp;

public class EmployeeBO {
	
	private String empName;
	private String empAdd;
	private byte empAge;
	
	public EmployeeBO() {
		System.out.println("EmployeeBO :: 0-param const");
	}
	
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public String getEmpAdd() {
		return empAdd;
	}
	public void setEmpAdd(String empAdd) {
		this.empAdd = empAdd;
	}
	public byte getEmpAge() {
		return empAge;
	}
	public void setEmpAge(byte empAge) {
		this.empAge = empAge;
	}

	@Override
	public String toString() {
		return "EmployeeBO [empName=" + empName + ", empAdd=" + empAdd + ", empAge=" + empAge + "]";
	}
}
