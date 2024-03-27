package com.javaex.ex05;

public class Depart extends Employee {

	private String Department;
	
	public Depart(String Department) {
		super(null,0);
		this.Department = Department ;
	}
	
	public Depart(String name, int salary, String Department) {
		 super(name, salary);
		 this.Department = Department;
	 }

	public String getDepartment() {
		return Department;
	}

	public void setDepartment(String Department) {
		this.Department = Department;
	}
	
	 
	 public void showInfomation() {
		 System.out.println("이름: " + super.getName() +"연봉: " + super.getSalary() + "부서:" + Department);
	 }


}
