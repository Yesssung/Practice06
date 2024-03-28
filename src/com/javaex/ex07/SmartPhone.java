package com.javaex.ex07;

public class SmartPhone extends MusicPhone {
    @Override
    public void execute(String str){
         if("앱".equals(str)){ // 저""글자가 str과 같다면 밑에 있는 앱 메소드를 실행시키고 아니라면 부모클래스를 실행시켜라
            runApp();
        }else{
            super.execute(str); // 오버라이드 해도 슈퍼를 이용해서 슈퍼에 있는 값을 출력할 수 있다.
        }
        
    }
 
    //메소드작성
    @Override
    public void playMusic() { // music phone클래스에 있던 플레이 뮤직을 오버라이드 해서 내가 원하는데로 출력하기
    	System.out.println("다운로드해서 음악재생");
    }
    
    //메소드작성
    public void runApp() {
    	System.out.println("앱 실행");
    }
    
}
