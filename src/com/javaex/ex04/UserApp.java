package com.javaex.ex04;

public class UserApp {

	public static void main(String[] args) {
		
		String[]user = new String[3];
		
		for(int a = 0; a < 3; a++) {
		Customer cs1 = new Customer("jws","j1234","정우성",1000);
		System.out.printf("#아이디: %s, #패스워드: %s, #이름: %s #포인트: %d");
		
		Customer cs2 = new Customer("yjs","y2345","이효리",2000);
		System.out.printf("#아이디: %s, #패스워드: %s, #이름: %s #포인트: %d");
		
		Employee em = new Employee("master","m7788","운영자",500);
		System.out.printf("#아이디: %s, #패스워드: %s, #이름: %s #월급: %d");
		
		User newUser = new User();
		newUser.setId(id);
		newUser.setPassword(password);
		newUser.setName(name);
		
		user[a] = newUser;
		
		
		}
		
		
		for(int i = 0; i < user.length; i++) {
			user[i].showInfo();
		}
		System.out.println("운영자의 월급은 5,000,000만원 입니다.");
	}

}
