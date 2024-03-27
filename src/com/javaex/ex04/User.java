package com.javaex.ex04;

public class User {
	
	private String id;
	private String password;
	private String name;
	
	public User() {
		
	}
	
	public User(String id, String password, String name) {
		this.setId(id);
		this.setPassword(password);
		this.setName(name);
	}

	
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public void showInfo() {
		System.out.printf("#아이디: %s, #패스워드: %s, #이름: %s" , id, password, name);
	}
	
	
}
