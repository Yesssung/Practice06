package com.javaex.ex05;

public class Depart extends Employee {

	private String Department;
	
	public Depart() {
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
	
	 @Override // 이거 오버라이드 안해서 출력 안됐었던것 걍 오버라이드 필수라고 생각하고 하자 까먹지 말고
	 		   // 오버라이드 일종의 검증기능, 없어도 작동하기는 한다. 그치만 부모클래스에 있는지 없는지 확인차 오버라이드 사용가능
	 public void showInformation() {
		 System.out.println("이름: " + super.getName() + " 연봉: " + super.getSalary() + " 부서: " + Department);
		 super.showInformation(); // -> 오버라이드 하지 않고 부모 클래스의 출력을 그대로 받고 싶은경우 super로 받기
	 }


}
