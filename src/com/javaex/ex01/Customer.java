package com.javaex.ex01;

public class Customer extends Person{
	
	private int cNo;
	private int point;
	
	public Customer(int cNo, int point) {
		super(null, null);
		this.setcNo(cNo);
		this.setPoint(point);
	}
	public Customer(String name, String hp, int cNo, int point) {
		super(name,hp);
		this.setcNo(cNo);
		this.setPoint(point);
	}
	
	public int getcNo() {
		return cNo;
	}
	public void setcNo(int cNo) {
		this.cNo = cNo;
	}
	public int getPoint() {
		return point;
	}
	public void setPoint(int point) {
		this.point = point;
	}
	
	public void showInfo() {
		System.out.printf("#이름: %s #핸드폰: %s #고객번호: %d, #포인트번호: %d", super.getName(), super.getHp(), cNo, point);
	}
	
	
}
