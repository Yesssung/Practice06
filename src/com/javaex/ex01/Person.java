package com.javaex.ex01;

public class Person {
	
	private String name;
	private String hp;
	
	public Person() {
		System.out.println("생성자 Person(0) 호출");
	}
	public Person(String name, String hp) {
		this.name = name;
		this.hp = hp; ;
		System.out.println("생성자 Person(2) 호출");
	}
	
	public String getName() {
		return name; // return this.name 이라고 해도 됌!
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getHp() {
		return hp;
	}
	public void setHp(String hp) {
		this.hp = hp;
	}
	
	public void showInfo() {
		System.out.printf("#이름: %s #핸드폰: %s%n", name, hp);
	}
	
	
}
