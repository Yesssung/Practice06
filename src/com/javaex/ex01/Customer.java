package com.javaex.ex01;

public class Customer extends Person{
	
	private int cNo;
	private int point;
	
	public Customer() {
		
	}
	
	public Customer(String name, String hp, int cNo, int point) {
		super(name, hp);
		this.cNo = cNo;
		this.point = point;
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
		System.out.printf("%n#이름: %s, #핸드폰: %s, #고객번호: %d, #포인트점수: %d", super.getName(), super.getHp(), cNo, point);
	}
	

	
}


























//package com.javaex.ex01;
//
//public class Customer extends Person{
//	
//	private int cNo;
//	private int point;
//	
//	public Customer() {
//		System.out.println("Customer 생성자 (0) 호출");
//	}
//	public Customer(String name, String hp, int cNo, int point) {
//		super(name,hp);
//		this.cNo = cNo;
//		this.point = point;
//		System.out.println("Customer 생성자 (4) 호출");
//	}
//	
//	public int getcNo() {
//		return cNo;
//	}
//	public void setcNo(int cNo) {
//		this.cNo = cNo;
//	}
//	public int getPoint() {
//		return point;
//	}
//	public void setPoint(int point) {
//		this.point = point;
//	}
//	
//	@Override
//	public void showInfo() {
//		System.out.printf("#이름: %s #핸드폰: %s #고객번호: %d, #포인트번호: %d", super.getName(), super.getHp(), cNo/*this.cNo라고 써도 됌*/, point);
//	}
//	
//	
//}
